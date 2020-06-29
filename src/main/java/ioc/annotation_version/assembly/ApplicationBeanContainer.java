package ioc.annotation_version.assembly;

import ioc.annotation_version.annotation.Autowire;
import ioc.annotation_version.annotation.Prototype;
import ioc.annotation_version.annotation.Singleton;
import org.reflections.Reflections;

import java.util.Arrays;
import java.util.Set;

/**
 * @author Ranin
 * @version Id: ApplicationBeanContainer.java, v 0.1 2020/6/23 14:26 Ranin Exp $$
 */
public class ApplicationBeanContainer {
    private BeanFactory beanFactory = new BeanFactory();

    private String DEFAULT_PACKAGE_PATH = "ioc.annotation_version";

    public ApplicationBeanContainer() {
        scanAnnotation(DEFAULT_PACKAGE_PATH);
    }

    public ApplicationBeanContainer(String packagePath) {
        scanAnnotation(packagePath);
    }

    private void scanAnnotation(String packagePath) {
        //todo: issue-001 通过classLoader实现,原理后续研究
        Reflections reflections = new Reflections(packagePath);
        Set<Class<?>> singletonAnnotated = reflections.getTypesAnnotatedWith(Singleton.class);
        Set<Class<?>> prototypeAnnotated = reflections.getTypesAnnotatedWith(Prototype.class);

        initSingleton(singletonAnnotated);
        initPrototype(prototypeAnnotated);
    }

    private void initSingleton(Set<Class<?>> singletonClass) {
        singletonClass.forEach(clazz -> {
            Object o = beanFactory.getSingletonByClass(clazz);
            autoWireFiled(o,clazz);
        });
    }

    private void initPrototype(Set<Class<?>> singletonClass) {
        singletonClass.forEach(clazz -> {
            Object o = beanFactory.getPrototypeByClazz(clazz);
            autoWireFiled(o,clazz);
        });
    }

    private void autoWireFiled(Object o, Class clazz) {
        Arrays.stream(clazz.getDeclaredFields()).forEach(field -> {
            Autowire[] annotationsByType = field.getAnnotationsByType(Autowire.class);
            if (annotationsByType != null) {
                field.setAccessible(true);
                try {
                    field.set(o, beanFactory.getSingletonByClass(field.getType()));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
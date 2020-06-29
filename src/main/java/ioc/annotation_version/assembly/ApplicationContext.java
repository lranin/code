package ioc.annotation_version.assembly;

import ioc.annotation_version.annotation.Autowire;
import ioc.annotation_version.annotation.Singleton;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.reflections.Reflections;

import java.util.Arrays;
import java.util.Set;

/**
 * @author Ranin
 * @version Id: ApplicationContext.java, v 0.1 2020/6/23 14:26 Ranin Exp $$
 */
public class ApplicationContext {
    private BeanFactory beanFactory = new BeanFactory();

    private String DEFAULT_PACKAGE_PATH = "ioc.annotation_version";

    public ApplicationContext() {
        scanAnnotation(DEFAULT_PACKAGE_PATH);
    }

    private void scanAnnotation(String packagePath) {
        //todo: 通过classLoader实现,原理后续研究
        Reflections reflections = new Reflections(packagePath);
        Set<Class<?>> typesAnnotated = reflections.getTypesAnnotatedWith(Singleton.class);
        typesAnnotated.forEach(System.out::print);

        typesAnnotated.forEach(n -> {
            Object o = beanFactory.getSingletonByClass(n);
            Arrays.stream(n.getDeclaredFields()).forEach(field -> {
                Autowire[] annotationsByType = field.getAnnotationsByType(Autowire.class);
                if (annotationsByType != null) {
                    field.setAccessible(true);
                    try {
//                        ConvertUtils.convert(o, n);
                        field.set(o, beanFactory.getSingletonByClass(field.getType()));
                    } catch (IllegalAccessException e) {
                        System.out.println(e);
                        e.printStackTrace();
                    }
                }
            });
        });
    }

    public Object getBean(Class c) {
        return beanFactory.getSingletonByClass(c);
    }

//    private void setFiledValueWithAutowire(Object o){
//        o.
//
//    }
}
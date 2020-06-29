package ioc.beanFactory_version;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ranin
 * @version Id: BeanFactory.java, v 0.1 2020/6/11 17:35 Ranin Exp $$
 * 工厂模式创建和管理对象的实例
 */
public class BeanFactory {
    private static final Object lock = new Object();
    private static Map<String, Object> beanMap = new HashMap<String, Object>();

    public static Object getBeanByName(String beanName) {
        Object o = null;
        if (beanName.equals("SingletonClass_2")) {
            o = SingletonClass_2.getInstance();
        }
        if (beanName.equals("NormalClass_2")) {
            o = new NormalClass_2();
        }
        return o;
    }

    public static Object getSingletonByClassName(String className) {
        Object o;
        o = beanMap.get(className);
        if (o != null) {
            System.out.println("get object from cache: " + className);
            return o;
        }
        try {
            synchronized (lock) {
                o = beanMap.get(className);
                if (o != null) {
                    return o;
                }
                Class c = Class.forName(className);
                o = ReflectUtil.getInstanceByNoParaConstructor(c);
                beanMap.put(className, o);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }
}
package ioc.annotation_version.assembly;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ranin
 * @version Id: BeanFactory.java, v 0.1 2020/6/11 17:35 Ranin Exp $$
 * 工厂模式创建和管理对象的实例
 */
public class BeanFactory {
    private final Object lock = new Object();
    @Getter
    private Map<String, Object> singletonCache = new HashMap<String, Object>();

    public Object getPrototypeByName(Class clazz) {
        Object o = null;
        o = ReflectUtil.getInstanceByNoParaConstructor(clazz);
        return o;
    }

    public Object getSingletonByClass(Class clazz) {
        Object object;
        object = singletonCache.get(clazz.getName());
        if (object != null) {
            System.out.println("get object from cache: " + clazz.getName());
            return object;
        }

        synchronized (lock) {
            object = singletonCache.get(clazz.getName());
            if (object != null) {
                return object;
            }
            object = ReflectUtil.getInstanceByNoParaConstructor(clazz);
            singletonCache.put(clazz.getName(), object);
        }
        return object;
    }
}
package ioc.version_2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ranin
 * @version Id: BeanFactory.java, v 0.1 2020/6/11 17:35 Ranin Exp $$
 * 工厂模式创建对象的实例
 */
public class BeanFactory {
    private final Object lock = new Object();
    private Map<String,Object> beanMap = new HashMap();

    public Object getBeanByName(String beanName){
        Object o = beanMap.get(beanName);
        if (o != null) {
            return o;
        }
        if (beanName.equals("SingletonClass_2")){
            o =  SingletonClass_2.getInstance();

        }
        if (beanName.equals("NormalClass_2")) {
            synchronized (lock) {
                o = new NormalClass_2();
            }
        }
        beanMap.put(beanName, o);
        return o;
    }
}
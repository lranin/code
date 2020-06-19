package ioc.version_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Ranin
 * @version Id: ReflectUtil.java, v 0.1 2020/6/18 15:33 Ranin Exp $$
 * 反射工具类
 */
public class ReflectUtil {
    public static Object getInstanceByNoParaConstructor(Class clazz) {
        Constructor[] constructors = clazz.getDeclaredConstructors();
        Object o = null;
        try {
            for (int i = 0; i < constructors.length; i++) {
                Class[] paras = constructors[i].getParameterTypes();
                if (paras.length == 0) {
                    if (!constructors[i].isAccessible()) {
                        constructors[i].setAccessible(true);
                    }
                    o = constructors[i].newInstance();
                }
            }
            System.out.println("从反射创建:"+o);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return o;
    }

    public static void main(String[] args) {
        getInstanceByNoParaConstructor(SingletonClass_2.class);
    }
}
package ioc.annotation_version.pojo;

import ioc.annotation_version.annotation.Singleton;

/**
 * @author Ranin
 * @version Id: SingletonClass.java, v 0.1 2020/6/22 15:38 Ranin Exp $$
 */
@ioc.annotation_version.annotation.Singleton
public class SingletonClass {
    public void speak(String words) {
        System.out.println("singleton speak:" + words);
    }
}
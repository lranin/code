package ioc.annotation_version.pojo;

import ioc.annotation_version.annotation.Singleton;

/**
 * @author Ranin
 * @version Id: Singleton_01.java, v 0.1 2020/6/22 15:38 Ranin Exp $$
 */
@Singleton
public class Singleton_01 {
    public void speak(String words) {
        System.out.println("singleton speak:" + words);
    }
}
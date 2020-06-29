package ioc.annotation_version.pojo;

import ioc.annotation_version.annotation.Prototype;

/**
 * @author Ranin
 * @version Id: PrototypeClass.java, v 0.1 2020/6/22 15:38 Ranin Exp $$
 */
@Prototype
public class PrototypeClass {
    public void speak(String words) {
        System.out.println("prototype speak:" + words);
    }
}
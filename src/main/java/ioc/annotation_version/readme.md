getClass（）是一个类的实例所具备的方法，而class（）方法是一个类的方法。 
另外getClass（）是在运行时才确定的，而class（）方法是在编译时就确定了。
```java
    if (!this.field.getDeclaringClass().isAssignableFrom(var1.getClass())) {
        
    }
```

### beanFactory_version
1. 类中的引用可以使用同一个单例对象
2. 使用工厂方式创建对象
3. 使用反射的方式从私有无参构造函数中创建对象并缓存,即使原类不是单例方法,也可以在工厂中创建出单例
4. 用锁隔离工厂创建单例的代码,避免多线程时产生冲突重复创建
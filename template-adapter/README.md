# design-pattern：template 
模板模式：一个抽象类定义了执行的操作的骨架，子类按需重写一些方法。调用将以抽象类中定义的方法执行。
适用：1、有多个子类共有的方法，且逻辑相同。 2、重要的、复杂的方法，可以考虑作为模板方法。
优点： 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。

实例：jdbctemplate、httpservlet（doget、dopost、doservice）

# design-pattern：adapter 
适配器模式：是为两个不兼容的接口提供一个桥梁，比如转换头，变压器等。适配器模式使得原本由于接口
不兼容而不能一起工作的那些类可以一起工作。

实例：spring中的HandlerAdapter、advisorAdapter

迭代器模式（Interator Pattern）
迭代器模式是Java和.Net编程环境中常用的设计模式。
	这种设计模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
	
介绍：
	意图：提供一种方法顺序访问一个聚合对象中的各个元素，而又无需暴露改对象的内部表示。
	主要解决:不同方式去遍历整个对象。
	何时使用:遍历一个聚合对象。
	如何解决：把在元素之间游走的责任交给迭代器，而不是聚合对象。
	关键代码：hasNext，next。
	应用实例：Java中iterator。
	优点：1.它支持不同的方式遍历一个聚合对象。
		2.迭代器简化了聚合类。
		3.在同一个聚合上可以有多个遍历。
		4.在迭代器模式中，增加新的聚合力和迭代器类都很方便，无须修改原有的代码。
	缺点：由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。
	使用场景：1.访问一个聚合类的内容无需暴露它的内部表示，2需要为聚合对象提供多种遍历方式。3.为遍历不同的聚合结构提供一个统一的接口。
	注意事项：迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，有可以让外部代码透明的访问集合内部的数据。
	
	实现：
		我们将创建一个导航方法的Iterator接口和一个返回迭代器的Container接口。实现了Container接口的实体类将负责出现Iterator接口。
		IteratorPatternDemo，我们演示类使用实体类NamesReposity来打印NamesReposity中存储为集合的Names；
	
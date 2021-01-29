# 容器集合
[题目转载地址跳转](https://blog.csdn.net/fangchao2011/article/details/89203535)

## 容器汇总图
  ![avatar](collection1.png)
## Collection 和 Collections 有什么区别？
1.Collection是集合体系的最顶层，包含了集合体系的共性
  <br>
  ![avatar](collection2.png)
  <br>
  Collections是一个工具类，方法都是用于操作Collection
  <br>
  ![avatar](collection3.png)

## List、Set、Map 之间的区别是什么？
 List：有序集合，元素可重复 
 <br>
 Set：不重复集合，LinkedHashSet按照插入排序，SortedSet可排序，HashSet无序
 <br>
 Map：键值对集合，存储键、值和之间的映射；Key无序，唯一；value 不要求有序，允许重复
 <br>
  ![avatar](collection4.png)


## HashMap 和 Hashtable 有什么区别？
1.HashMap是非线程安全 Hashtable是线程安全 Hashtable的实现方面里面都添加了synchronized关键字来确保线程同步。<br>
在多线程环境下若使用HashMap需要使用Collections.synchronizedMap()<br>
2.HashMap可以使用null作为key，不过建议还是尽量避免这样使用。HashMap以null作为key时，总是存储在table数组的第一个节点上。<br>
而Hashtable则不允许null作为key<br>
3.HashMap继承了AbstractMap，HashTable继承Dictionary抽象类，两者均实现Map接口。<br>
4.HashMap的初始容量为16，Hashtable初始容量为11，两者的填充因子默认都是0.75。<br>
5.HashMap扩容时是当前容量翻倍即:capacity*2，Hashtable扩容时是容量翻倍+1即:capacity*2+1。<br>
6.HashMap和Hashtable的底层实现都是数组+链表结构实现。<br>
7.Hashtable计算hash是直接使用key的hashcode对table数组的长度直接进行取模<br>
HashMap计算hash对key的hashcode进行了二次hash，以获得更好的散列值，然后对table数组长度取摸<br>
8.在HashMap 中，null 可以作为键，这样的键只有一个；可以有一个或多个键所对
应的值为null。当get()方法返回null 值时，既可以表示HashMap 中没有该键，也可
以表示该键所对应的值为null。因此，在HashMap 中不能用get()方法来判断HashMap 中是否存在某个键，而应该用containsKey()方法来判断。Hashtable 的键值都不能
为null，所以可以用get()方法来判断是否含有某个键。
[转载地址](https://blog.csdn.net/qq_35181209/article/details/74503362?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.control)

## 如何决定使用 HashMap 还是 TreeMap？

## 说一下 HashMap 的实现原理？

## 说一下 HashSet 的实现原理？

## ArrayList 和 LinkedList 的区别是什么？

## 如何实现数组和 List 之间的转换？

## ArrayList 和 Vector 的区别是什么？

## Array 和 ArrayList 有何区别？

## 在 Queue 中 poll()和 remove()有什么区别？

## 哪些集合类是线程安全的？

## 迭代器 Iterator 是什么？

## Iterator 怎么使用？有什么特点？

## Iterator 和 ListIterator 有什么区别？



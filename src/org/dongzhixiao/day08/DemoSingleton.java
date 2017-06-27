package org.dongzhixiao.day08;
/**
 * 单例模式
 * 任何情况下，该类只能创建一个实例！
 * 
 * 1 定义私有静态当前类型的实例作为属性
 * 2 私有化构造方法
 * 3 定义静态的可以获取当前类实例的方法
 *   这个方法中我们可以判断是否创建过实例，创建过就直接返回
 *   从而达到单例效果
 * 
 * @author Administrator
 *
 */

public class DemoSingleton {
    private static DemoSingleton obj = null;
    /**
     * 私有化构造方法
     */
    private DemoSingleton(){}
    /**
     * 
     */
    public static DemoSingleton getInstance(){
        if(obj == null){
            obj = new DemoSingleton();
        }
        return obj;
    }
}
/**
 * 模板方法：大部分内容已经做好了，套用即可
 * 比如：字帖和word
 * 程序中定义一个抽象类，实现功能相同的方法。
 * 将存在差异的部分定义为抽象方法由子类实现
 */
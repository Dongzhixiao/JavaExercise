package org.dongzhixiao.day10.inner;
/**
 * 实例化内部类
 * @author Administrator
 *
 */
public class DemoInnerClass {
    private int age;
    public static void main(String[] args) {
        DemoInnerClass obj = new DemoInnerClass();
        obj.sayAge();
        Inner inner = obj.new Inner();
        inner.sayAge();
    }
    
    public void sayAge(){
        System.out.println(age);
    }
    
    class Inner{
        public void sayAge(){
            System.out.println(age);
            //调用外部的this要使用外部类的类名
            DemoInnerClass.this.sayAge();
        }
    }
}

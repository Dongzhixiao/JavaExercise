package org.dongzhixiao.day10.inner;
/**
 * ʵ�����ڲ���
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
            //�����ⲿ��thisҪʹ���ⲿ�������
            DemoInnerClass.this.sayAge();
        }
    }
}

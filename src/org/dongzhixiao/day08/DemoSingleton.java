package org.dongzhixiao.day08;
/**
 * ����ģʽ
 * �κ�����£�����ֻ�ܴ���һ��ʵ����
 * 
 * 1 ����˽�о�̬��ǰ���͵�ʵ����Ϊ����
 * 2 ˽�л����췽��
 * 3 ���徲̬�Ŀ��Ի�ȡ��ǰ��ʵ���ķ���
 *   ������������ǿ����ж��Ƿ񴴽���ʵ������������ֱ�ӷ���
 *   �Ӷ��ﵽ����Ч��
 * 
 * @author Administrator
 *
 */

public class DemoSingleton {
    private static DemoSingleton obj = null;
    /**
     * ˽�л����췽��
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
 * ģ�巽�����󲿷������Ѿ������ˣ����ü���
 * ���磺������word
 * �����ж���һ�������࣬ʵ�ֹ�����ͬ�ķ�����
 * �����ڲ���Ĳ��ֶ���Ϊ���󷽷�������ʵ��
 */
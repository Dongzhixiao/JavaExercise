package org.dongzhixiao.day08;

public class DemoContact {

    public static void main(String[] args) {
        Contact someone = new Contact();
        someone.set("name", "·¶´«Ææ");
        someone.set("phone","1500000000");
        someone.set("mail","fanchuanqi@qq.com");
        someone.set("qq","346762839");
        System.out.println(someone);
        System.out.println(
                someone.get("name")
                +"qqÊÇ£º"
                +someone.get("qq")
        );       
        
    }

}

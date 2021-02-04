package cn.yjw.day14.demo04;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one = new Member("成员A",0);
        Member Two = new Member("成员B",0);
        Member Three = new Member("成员C",0);

        manager.show();
        one.show();
        Two.show();
        Three.show();
        System.out.println("============================");

        // 群主总共发20块钱 , 分成3个红包
        ArrayList<Integer> redList = manager.send(20,3);

        // 三个普通成员收红包
        one.receive(redList);
        Two.receive(redList);
        Three.receive(redList);

        manager.show();
        one.show();
        Two.show();
        Three.show();
        System.out.println("============================");
    }
}

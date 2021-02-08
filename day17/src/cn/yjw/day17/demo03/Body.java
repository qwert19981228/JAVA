package cn.yjw.day17.demo03;

public class Body {// 外部类
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Heart{ // 成员类

        // 内部类方法
        public void beat(){
            System.out.println("心脏跳动: 蹦蹦蹦!!!");
            System.out.println("我叫:" + name);
        }
    }

    private String name;

    public void methodBody(){
        System.out.println("内部类的方法");
//        Heart heart = new Heart();
//        heart.beat();
        new Heart().beat();
    }


}

package cn.yjw.day13.Demo06;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();
        System.out.println("显示名称");
        System.out.println("显示头像");
    }
}

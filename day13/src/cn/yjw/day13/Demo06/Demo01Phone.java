package cn.yjw.day13.Demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();

        NewPhone newPhone = new NewPhone();
        newPhone.show();
        newPhone.call();
        newPhone.send();
    }
}

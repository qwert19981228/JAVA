public class Demo09Logic{
    public static void main(String[] args) {
        System.out.println(true && false);      // false
        // true && true --> true
        System.out.println(3 < 4 && 10 > 5);    // true
        System.out.println("================");

        System.out.println(true || false);      // true
        System.out.println(true || true);       // true
        System.out.println(false || false);     // false
        System.out.println("================");

        System.out.println(true);               // true
        System.out.println(!true);              // false
        System.out.println("================");

        int a = 10;
        // false && ...
        System.out.println(3 > 4 && ++a < 100); // false
        System.out.println(a);                  // 10
        System.out.println("================");

        int b = 20;
        // true || ...
        System.out.println(3 < 4 || ++b < 100); // true
        System.out.println(b);
    }
}
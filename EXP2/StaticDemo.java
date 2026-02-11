public class StaticDemo {

    static int count;

    static {
        count = 10;
        System.out.println("Static Block Executed");
    }

    static void display() {
        System.out.println("Count = " + count);
    }

    public static void main(String args[]) {
        display();
    }
}

import java.util.Scanner;

public class Area {

    int length, breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        obj.setDim(l, b);

        System.out.println("Area of Rectangle: " + obj.getArea());
    }
}

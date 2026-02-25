class Student {
    int roll_no;

    void getRollNo(int r) {
        roll_no = r;
    }

    void putRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}

class Test extends Student {
    float sub1, sub2;

    void getMarks(float s1, float s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void putMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

class Result extends Test {
    float total;

    void displayResult() {
        total = sub1 + sub2;
        putRollNo();
        putMarks();
        System.out.println("Total Marks: " + total);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result student = new Result();

        student.getRollNo(101);
        student.getMarks(85.5f, 90.0f);
        student.displayResult();
    }
}

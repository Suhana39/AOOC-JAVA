interface Stack {
    int size = 5;   // fixed stack size

    void push(int data);
    void pop();
    void display();
    void overflow();
    void underflow();
}

class IntegerStack implements Stack {
    int[] stack = new int[size];
    int top = -1;

    public void push(int data) {
        if (top == size - 1) {
            overflow();
        } else {
            stack[++top] = data;
            System.out.println(data + " pushed into stack");
        }
    }

    public void pop() {
        if (top == -1) {
            underflow();
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public void overflow() {
        System.out.println("Stack Overflow!");
    }

    public void underflow() {
        System.out.println("Stack Underflow!");
    }
}

public class StackInterfaceProgram {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}

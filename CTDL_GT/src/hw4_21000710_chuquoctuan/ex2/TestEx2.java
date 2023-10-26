package hw4_21000710_chuquoctuan.ex2;

public class TestEx2 {
    public static void main(String[] args) {
       //testArrayStack();
        testLinkedListStack();
    }
    public static void testArrayStack(){
        StackInterface<Integer> stack = new ArrayStack<>();
        stack.push(6);
        stack.push(5);
        stack.push(3);
        stack.push(4);

        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
    }
    public static void testLinkedListStack(){
        StackInterface<Integer> stack = new LinkedListStack<>();
        stack.push(6);
        stack.push(5);
        stack.push(3);
        stack.push(4);

        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
    }
}


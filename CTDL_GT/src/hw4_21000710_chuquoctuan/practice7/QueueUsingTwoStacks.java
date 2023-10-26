package hw4_21000710_chuquoctuan.practice7;

import java.util.Stack;

public class QueueUsingTwoStacks<E> {
    private Stack<E> stack1 = new Stack<>();
    private Stack<E> stack2 = new Stack<>();

    public void enqueue(E element){
        stack1.push(element);
    }

    // If stack2 is empty and stack1 is'n empty -> stack2.push((stack1.pop()));
    // else stack2 is'n empty -> stack2.pop()
    // if stack1 and stack2 is empty -> return null
    public E dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push((stack1.pop()));
            }
        }
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        return null;
    }
    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(-1);
        queue.enqueue(2);
        queue.enqueue(6);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(1);
        queue.enqueue(0);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

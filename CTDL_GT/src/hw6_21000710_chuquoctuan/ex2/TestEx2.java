package hw6_21000710_chuquoctuan.ex2;

public class TestEx2 {
    public static void main(String[] args) {
        MinHeapPriorityQueue minHeap = new MinHeapPriorityQueue<Integer ,String>();

        minHeap.insert(3 ,"A");
        minHeap.insert(1 ,"B");
        minHeap.insert(9 ,"C");
        minHeap.insert(4 ,"D");
        minHeap.insert(6 ,"E");
        minHeap.insert(12 ,"F");
        minHeap.insert(7 ,"G");
        minHeap.insert(10 ,"H");
        minHeap.insert(11 ,"J");

        System.out.println("Heap before remove min : ");

        minHeap.print();

        Entry<Integer ,String> min = minHeap.removeMin();

        System.out.println("Remove min : (" + min.getKey() + min.getValue() +")");
        System.out.println("Heap after remove min : ");


        minHeap.print();
    }
}

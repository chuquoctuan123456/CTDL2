package hw6_21000710_chuquoctuan.ex1;

public class TestEx1 {
    public static void main(String[] args) {
        testUnsortedArray();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        testSortedArray();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        testUnsortedLinkedPriority();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        testSortedLinkedPriority();
    }
    public static void testUnsortedArray(){
        UnsortedArrayPriorityQueue unsortedArray = new UnsortedArrayPriorityQueue<Integer ,Integer>();

        unsortedArray.insert(4 ,"Hoang");
        unsortedArray.insert(1 ,"Tuan");
        unsortedArray.insert(3 ,"Hung");
        unsortedArray.insert(2 ,"Cuong");
        unsortedArray.insert(5 ,"Manh");


        System.out.println("Size queue : " + unsortedArray.size());

        System.out.println("Remove key min : " + unsortedArray.removeMin().getValue());
        System.out.println("Size after remove queue : " + unsortedArray.size());

        // After be removed key min
        System.out.println("Key min : " + unsortedArray.min().getValue());
        unsortedArray.print();

    }
    public static void testSortedArray(){
        SortedArrayPriorityQueue sortedArray = new SortedArrayPriorityQueue<Integer ,String>();

        sortedArray.insert(4 ,"Hoang");
        sortedArray.insert(1 ,"Tuan");
        sortedArray.insert(3 ,"Hung");
        sortedArray.insert(5 ,"Manh");
        sortedArray.insert(2 ,"Cuong");



        System.out.println("Size queue : " + sortedArray.size());

        System.out.println("Remove key min : " + sortedArray.removeMin().getValue());
        System.out.println("Size after remove queue : " + sortedArray.size());

        // After be removed key min
        System.out.println("Key min : " + sortedArray.min().getValue());
        sortedArray.print();

    }
    public static void testUnsortedLinkedPriority(){
        UnsortedLinkedPriorityQueue unsortLinked = new UnsortedLinkedPriorityQueue<Integer ,String>();

        unsortLinked.insert(4 ,"Hoang");
        unsortLinked.insert(1 ,"Tuan");
        unsortLinked.insert(3 ,"Hung");
        unsortLinked.insert(2 ,"Cuong");
        unsortLinked.insert(5 ,"Manh");

        unsortLinked.print();
        System.out.println("Size queue : " + unsortLinked.size());

        unsortLinked.removeMin();
        System.out.println("Size after remove queue : " + unsortLinked.size());

        // After be removed key min
        System.out.println("Key min : " + unsortLinked.min().getValue());
        unsortLinked.print();
    }

    public static void testSortedLinkedPriority(){
        SortedLinkedPriorityQueue sortLinked = new SortedLinkedPriorityQueue<Integer ,String>();

        sortLinked.insert(4 ,"Hoang");
        sortLinked.insert(1 ,"Tuan");
        sortLinked.insert(3 ,"Hung");
        sortLinked.insert(2 ,"Cuong");
        sortLinked.insert(5 ,"Manh");

        sortLinked.print();
        System.out.println("Size queue : " + sortLinked.size());

        sortLinked.removeMin();
        System.out.println("Size after remove queue : " + sortLinked.size());

        // After be removed key min
        System.out.println("Key min : " + sortLinked.min().getValue());
        sortLinked.print();
    }
}

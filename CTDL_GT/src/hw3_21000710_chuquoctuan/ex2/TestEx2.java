package hw3_21000710_chuquoctuan.ex2;

public class TestEx2 {
    public static void main(String[] args) {
        ListInterface<Integer> list = new SimpleArrayList<>();
        list.add(6);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(8);
        list.add(88);

        list.print();

        System.out.println(list.get(0));

        list.set(1 ,100);
        System.out.println(list.get(1));

        list.remove(9);
        System.out.println(list.size());

        System.out.println(list.isContain(8));

        System.out.println(list.isEmpty());
    }
}

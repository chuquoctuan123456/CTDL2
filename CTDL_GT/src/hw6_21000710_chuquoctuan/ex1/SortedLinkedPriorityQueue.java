package hw6_21000710_chuquoctuan.ex1;

public class SortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {
    protected class NodeEntry<K, E> implements Entry<K, E> {
        private K key;
        private E element;
        private NodeEntry<K, E> next;

        public NodeEntry(K key, E element) {
            this.key = key;
            this.element = element;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public E getValue() {
            return element;
        }

    }

    private NodeEntry<K, E> head;
    private NodeEntry<K, E> tail;
    int n = 0;

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public void insert(Entry entry) {
        NodeEntry<K ,E> node = (NodeEntry<K, E>)entry;
        K key = node.key;
        // With Queue is empty
        if(isEmpty()){
            head = node;
            tail = head;
            n++;
            return;
        }
        // With insert first queue
        if(head.key.compareTo(key) >= 0){
            node.next = head;
            head = node;
            n++;
            return;
        }

        NodeEntry<K ,E> currentNode = head;

        // With insert node in middle and end queue
        while (currentNode.next != null) {
            if (currentNode.next.key.compareTo(key) >= 0) {
                break;
            }
            currentNode = currentNode.next;
        }

        node.next = currentNode.next;
        currentNode.next = node;

        // Trường hợp chèn vào cuối hàng đợi, cập nhật tail
        if (node.next == null) {
            tail = node;
        }

        n++;
    }

    @Override
    public void insert(Object key, Object element) {
        NodeEntry<K ,E> node = new NodeEntry<>((K) key ,(E) element);
        insert(node);
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) {
            return null;
        }
        NodeEntry<K ,E> min = head;
        NodeEntry<K ,E> node = head;
        head = node.next;
        node = head;
        n--;
        return min;
    }

    @Override
    public Entry min() {
        if(isEmpty()) {
            return null;
        }
        return head;
    }
    public void print(){
        NodeEntry node = head;
        while(node != null){
            if(node == tail){
                System.out.print(node.key + " : " + node.element);
            }else{
                System.out.print(node.key + " : " + node.element + " , ");
            }
            node = node.next;
        }
        System.out.println();
    }
}

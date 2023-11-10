package hw6_21000710_chuquoctuan.ex1;

public class UnsortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {
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
        if (head == null) {
            head = (NodeEntry<K, E>) entry;
            tail = head;
            n++;
            return;
        }
        tail.next = (NodeEntry<K, E>) entry;
        tail = (NodeEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(Object o1, Object o2) {
        NodeEntry<K, E> node = new NodeEntry<>((K) o1, (E) o2);
        insert(node);
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) {
            return null;
        }
        NodeEntry<K, E> node = head;
        NodeEntry<K, E> minNode = null;
        K key = node.key;

        // Find key min
        while (node != null) {
            if (node.key.compareTo(key) < 0) {
                minNode = node;
                key = node.key;
            }
            node = node.next;
        }
        if(minNode == head){
            head = head.next;
        }else{
            NodeEntry<K, E> currentNode = head;
            while (currentNode != null) {
                if (currentNode.next.key.compareTo(key) == 0) {
                    currentNode.next = minNode.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }

        n--;
        return minNode;
    }

    @Override
    public Entry min() {
        if (isEmpty()) {
            return null;
        }
        NodeEntry<K, E> node = head;
        NodeEntry<K, E> minNode = null;
        K key = node.key;

        // Find key min

        while (node != null) {
            if (node.key.compareTo(key) < 0) {
                minNode = node;
                key = node.key;
            }
            node = node.next;
        }
        return minNode;
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

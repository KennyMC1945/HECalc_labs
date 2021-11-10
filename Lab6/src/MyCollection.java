public class MyCollection<E> {
    private Node<E> first = null;
    private int size = 0;

    public MyCollection() {}

    public void add(E item) {
        Node<E> newNode = new Node<>(item);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> currNode = first;
            while (currNode.next != null) currNode = currNode.next;
            currNode.next = newNode;
        }
        this.size += 1;
    }

    public int getSize() {
        return size;
    }

    public void remove(int index) {
        if (index >= size) throw new IllegalArgumentException("Выход за границы массива. Размер: " + size + ", Запрошенный индекс: " + index);
        if (index == 0) {
            first = first.next;
        } else {
            Node<E> prevNode = null;
            Node<E> currNode = first;
            for (int i = 0; i < index; i++) {
                prevNode = currNode;
                currNode = currNode.next;
            }

            prevNode.next = currNode.next;
        }
        size -= 1;
    }

    public void remove(E item) {
        if (item.equals(first.value)) {
            first = first.next;
        } else {
            Node<E> prevNode = null;
            Node<E> currNode = first;
            while(currNode.next != null) {
                prevNode = currNode;
                currNode = currNode.next;
                if (item.equals(currNode.value)) {
                    prevNode.next = currNode.next;
                    break;
                }
            }
        }
        size -= 1;
    }

    public E get(int index) {
        if (index >= size) throw new IllegalArgumentException("Выход за границы массива. Размер: " + size + ", Запрошенный индекс: " + index);
        Node<E> currNode = first;
        for (int i = 0; i<index; i++) currNode = currNode.next;
        return currNode.value;

    }

    public void clear() {
        first = null;
        size = 0;
    }


    class Node<E> {
        public E value;
        public Node<E> next = null;
        public Node(E item) {
            this.value = item;
        }
    }
}

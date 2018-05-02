package homework_14;

import sun.plugin.dom.core.Element;

public class Queue implements IQueue {
    Node head;

    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }

    public int currentSize() {
        if (!isEmpty()) {
            Node t = head;
            int size = 1;
            while (t.next != null) {
                t = t.next;
                size++;
            }
            return size;
        } else return 0;
    }


    public Object deQueue() {
        if (!isEmpty()) {
            if (head.next != null) {
                Node t = head;
                while (t.next.next != null) {
                    t = t.next;
                }
                Node temp = t.next;
                t.next = null;
                return t;
            } else {
                Node temp = head;
                head = null;
                return temp;
            }
        }
        return null;
    }


    public void enQueue(Node newNode) {
        if(!isEmpty()){
            newNode.next = head;
            head = newNode;
        }else {
            head = newNode;
        }
    }

}

package homework_14;

public class List {
    private Element head;

    private class Element {
        int key;
        Object data;
        Element next;

        public Element(int key, Object data) {
            this.key = key;
            this.data = data;
        }

        public void displayElement() {
            System.out.print(this.toString());
        }

        @Override
        public String toString() {
            return
                    "{key=" + key +
                            ", data=" + data + "} ";
        }
    }

    public List() {
        this.head = null;
    }

    public List(Element head) {
        this.head = head;
    }


    public void insertToBegin(int key, Object data) {
        Element newElement = new Element(key, data);
        newElement.next = head;
        head = newElement;
    }

    public void insertAfter(int elementKey, Element element) {
        Element newElement = element;
        Element current = find(elementKey);
        Element next = current.next;
        current.next = newElement;
        newElement.next = next;
    }

    public Element delete(int key) {
        Element current = head;
        Element previous = head;

        while (current.key != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == head) {
            head = head.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public Element deleteFirst() {
        Element temp = head;
        head = head.next;


        return temp;
    }

    public Element find(int key) {
        Element current = head;
        while (current.key != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public void displayList() {
        System.out.println("List (first-->last):");
        Element current = head;
        while (current != null) {
            current.displayElement();
            current = current.next;
        }
        System.out.println("");
    }

//    public void push(Object obj) {
//        Element a = new Element(obj, tail);
//        if (head == null) {
//            head = a;
//            tail = a;
//        } else {
//            a.next = head;
//            head = a;
//        }
//    }
//
//    public Element pop() {
//        if (head != null) {
//            if (head != tail) {
//                Element t = head;
//                while (t.next != null) {
//                    if (t.next == tail) {
//                        Element temp = t.next;
//                        t.next = null;
//                        tail = t;
//                        return temp;
//                    }
//                    t = t.next;
//                }
//            }else{
//                Element temp = head;
//                head = null;
//                tail = null;
//                return temp;
//            }
//        }
//        return null;
//
//    }
}

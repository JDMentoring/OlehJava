package homework_14;

interface IQueue {
    public boolean isEmpty();
    public int currentSize();
    public Object deQueue();
    public void enQueue(Node newNode);
}

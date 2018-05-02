package lesson14;

public class ArrayStack implements Stack {
    private final int size;
    private int topIndex;
    private int[] array;

    public ArrayStack(int size) {
        this.size = size;
        topIndex = -1;
        array = new int[size];
    }

    public boolean isFull() {
        if (topIndex == (size - 1)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void push(int value) {
        if (!(isFull())) {
            array[++topIndex] = value;
        }else System.out.println("Stack is full.");

    }

    @Override
    public int pop() {
        if(!isEmpty()){
            int tempValue = array[topIndex];
            array[topIndex--]=0;
            return tempValue;
        }else{
            System.out.println("Stack is empty.");
            return 0;
        }
    }

    public void showStack(){
        while(!isEmpty()){
            int tempValue = array[topIndex];
            array[topIndex--]=0;
            System.out.println(tempValue);
        }
    }

}

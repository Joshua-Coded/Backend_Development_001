
public class dynamicStack {
    private int maxSize;

    private int[] stackArray;

    private int top;

    // constructor
    public dynamicStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // method for pushing to stack array
    public void push(int value) {
        if (!isFull()) {
            top++;
            stackArray[top] = value;
        } else {
            resize(maxSize * 2);
            push(value);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }

        if (top < maxSize / 4) {
            resize(maxSize / 2);
            return pop();
        } else {
            System.out.println("The stack is already empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("The stack is is empty, can't peek");
            return -1;
        }
    }

    private void resize(int newSize) {
        int[] transferArray = new int[newSize];

        for (int i = 0; i < stackArray.length; i++) {
            transferArray[i] = stackArray[i];
            stackArray = transferArray;
        }

        maxSize = newSize;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top + 1 == maxSize);
    }

    public void makeEmpty() {
        top = -1;
    }

    public static void main(String[] args) {
        dynamicStack myStack = new dynamicStack(3);
        myStack.push(4);
        myStack.push(6);
        myStack.push(10);

        myStack.push(11);
        myStack.push(12);
        myStack.push(13);

        System.out.println("********** Stack array implementation ************");
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}

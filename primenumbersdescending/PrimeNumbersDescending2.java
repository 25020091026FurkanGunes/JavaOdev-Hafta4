package primenumbersdescending;

public class PrimeNumbersDescending2 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }

        System.out.println("120'den küçük asal sayılar (azalan sırada):");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
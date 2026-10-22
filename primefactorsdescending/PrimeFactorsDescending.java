package primefactorsdescending;

import java.util.Scanner;

public class PrimeFactorsDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı girin (Örn: 120): ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();
        int factor = 2;

        while (number > 1) {
            if (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }

        System.out.print("Çarpanlar (azalan sırada): ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
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
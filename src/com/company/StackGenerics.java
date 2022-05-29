package com.company;

import java.util.EmptyStackException;

public class StackGenerics<T> {  // стек на основе generic (обобщенные переменные итд)
    private int capacity;
    private T[] stack; // стек собственной персоной (че)
    private int lastFilledIndex; // хз можно ли ввести такое поле в стек но я ввёл
                                 // отслеживает индекс верхнего элемента в стеке
                                 // если lastFilledIndex == -1, то стек пуст

    public StackGenerics(int capacity) { // конструктор где можно задать количество элементов
        if(capacity <= 0) { // ну типа эээ... нельзя так делать
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        this.lastFilledIndex = -1;
        stack = (T[])new Object[capacity];
    }

    public StackGenerics() { // по условию дефолтный конструктор инициализирует размер стека как 10 элементов
        this.capacity = 10;
        this.lastFilledIndex = -1;
        stack = (T[])new Object[capacity]; // генерик колдунство (приведение?) инициализируем стек с нашим capacity
    }

    public void push(T val) { // возвращает верхний элемент стека и удаляет его из стека
        if(lastFilledIndex == capacity-1) { // если места на новый элемент не хватает то мы умножаем размер стека на 2
            T[] oldStack = stack;
            capacity *= 2;
            stack = (T[])new Object[capacity];
            System.arraycopy(oldStack, 0, stack, 0, lastFilledIndex+1);
        }
        // если место есть то добавляем новый элемент на вершину стека
        stack[lastFilledIndex+1] = val;
        lastFilledIndex++;
    }

    public T pop() /*throws NullPointerException */{
        if(lastFilledIndex == -1) {
            throw new EmptyStackException();
        }
        T tmp = stack[lastFilledIndex];
        this.stack[lastFilledIndex] = null;
        lastFilledIndex--;
        return tmp;
    }

    public boolean isEmpty() { // да, пуст
        if(lastFilledIndex == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() { // да, заполнен
        if(lastFilledIndex == capacity-1) {
            return true;
        }
        else {
            return false;
        }
    }

    public T peek() { // возвращает верхний элемент стека без его удаления из стека
        if(lastFilledIndex == -1) {
            throw new NullPointerException();
        }
        return stack[this.lastFilledIndex];
    }

}

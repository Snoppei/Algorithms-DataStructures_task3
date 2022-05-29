package com.company;

import java.util.EmptyStackException;
import java.util.Stack;

public class ReverseStack {
    public static StackGenerics reverseSimpleStack(StackGenerics<String> stack) { // для самописного стека
        StackGenerics<String> newStack = new StackGenerics();
        while(true) {
            try {
                newStack.push(stack.pop());
            } catch(EmptyStackException e) {
                break;
            }
        }
        return newStack;
    }

    public static Stack reverseStack(Stack<String> stack){ // для стандартного стека который уже есть в джаве
        Stack<String> newStack = new Stack();
        while(true) {
            try {
                newStack.push(stack.pop());
            } catch(EmptyStackException e) {
                break;
            }
        }
        return newStack;
    }

    public static String[] stackToArray(StackGenerics<String> stack, int stackSize){
        String[] str = new String[stackSize];
        for(int i = 0; i < stackSize; i++){
            str[i] = stack.pop();
        }
        return str;
    }

    public static String[] stackToArray(Stack<String> stack, int stackSize){ // перегрузка для дефолт стека
        String[] str = new String[stackSize];
        for(int i = 0; i < stackSize; i++){
            str[i] = stack.pop();
        }
        return str;
    }

    public static StackGenerics arrayToStack(String[] arr) {
        StackGenerics<String> stack = new StackGenerics();
        for(int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        return stack;
    }

    public static Stack arrayToStack(String[] arr, boolean b) { // перегрузка для обычного стека
        Stack<String> stack = new Stack();
        for(int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        return stack;
    }


    public static String[] logicsSimpleStackForJTable(String[] matrix) {
        int size = matrix.length;
        StackGenerics<String> stack;
        stack = ReverseStack.arrayToStack(matrix);
        StackGenerics<String> newStack;
        newStack = ReverseStack.reverseSimpleStack(stack); // debruh
        newStack = ReverseStack.reverseSimpleStack(newStack); // второй раз для корректного отображения в массиве
        return ReverseStack.stackToArray(newStack, size);     // т.к. стек превращается в массив, потом снова в стек для вывода на интерфейс
    }

    public static String[] logicsJavaStackForJTable(String[] matrix) { // перегрузка для обычного стека
        int size = matrix.length;
        Stack<String> stack;
        stack = ReverseStack.arrayToStack(matrix, true);
        Stack<String> newStack;
        newStack = ReverseStack.reverseStack(stack); // debruh
        newStack = ReverseStack.reverseStack(newStack); // второй раз для корректного отображения в массиве
        return ReverseStack.stackToArray(newStack, size);    // т.к. стек превращается в массив, потом снова в стек для вывода на интерфейс
    }

}

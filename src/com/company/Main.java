package com.company;

import com.company.util.*;
import java.util.EmptyStackException;
import java.util.Locale;
import java.util.Stack;

public class Main { // стек из таска 1.13

    public static void winMain() throws Exception {
        //SwingUtils.setLookAndFeelByName("Windows");
        Locale.setDefault(Locale.ROOT);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    public static void main(String[] args) throws Exception {

        winMain();
        // шаблон моего стека
/*        StackGenerics stack = new StackGenerics<>();
        stack.push("something");
        stack.push("is");
        stack.push("weird");
        stack.push("with");
        stack.push("me");
        StackGenerics stackSecond = ReverseStack.reverseSimpleStack(stack);*/

/*
        System.out.println(stack.peek());
        stackSecond.push(stack.pop());
        System.out.println(stack.peek());
        stackSecond.push(stack.pop());
        System.out.println(stack.peek());
        stackSecond.push(stack.pop());
        System.out.println(stack.peek());
        stackSecond.push(stack.pop());
        System.out.println(stack.peek());
        stackSecond.push(stack.pop());

        try {
        stack.pop();
        } catch(EmptyStackException e) {
            System.out.println("Всё");
        }
        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
        System.out.println("///////////////////////////////////////////////////////");
        Stack stk = new Stack();
        StackGenerics stk2 = new StackGenerics<>();
        stk.push("something");
        stk.push("is");
        stk.push("weird");
        stk.push("with");
        stk.push("me");
        System.out.println(stk.peek());
        stk2.push(stk.pop());
        System.out.println(stk.peek());
        stk2.push(stk.pop());
        System.out.println(stk.peek());
        stk2.push(stk.pop());
        System.out.println(stk.peek());
        stk2.push(stk.pop());
        System.out.println(stk.peek());
        stk2.push(stk.pop());
        try {
            stk.pop();
        } catch(EmptyStackException e) {
            System.out.println("Всё");
        }
        System.out.println(stk2.pop());
        System.out.println(stk2.pop());
        System.out.println(stk2.pop());
        System.out.println(stk2.pop());
        System.out.println(stk2.pop());
*/


    }
}

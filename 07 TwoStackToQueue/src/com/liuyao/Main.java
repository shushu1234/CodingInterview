package com.liuyao;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static  class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if (stack1.isEmpty()&&stack2.isEmpty()){
                throw new RuntimeException("Stack Empty");
            }
//            当stack2要为空的时候才能放入，否者先弹出stack2中的元素
            if (stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }
}

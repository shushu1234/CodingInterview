package com.liuyao;

import java.util.Stack;

/**
 * 定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈最小元素的min函数。
 */

public class Solution {

    public static int minValue=Integer.MAX_VALUE;
    public Stack<Integer> stack=new Stack<>();
    public Stack<Integer> minStack=new Stack<>();
    public void push(int node) {
        if (node<minValue){
            minValue=node;
            minStack.push(node);
        }
        stack.push(node);
    }

    public void pop() {
        if (stack.peek()==minStack.peek()){
            stack.pop();
            minStack.pop();
        }else {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
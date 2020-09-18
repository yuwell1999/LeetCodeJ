package Easy;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    Deque<Integer> xStack = new LinkedList<>();
    Deque<Integer> minStack = new LinkedList<>(); // 辅助栈

    /** initialize your data structure here. */
    public MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        // 一个元素入栈时，取当前辅助栈的栈顶存储的最小值，与当前元素比较出最小值，将其放入辅助栈中
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

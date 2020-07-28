package Easy;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution_jz40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1); // 重写比较器，改写成大根堆
        /*
         * 优先队列的使用
         * peek() 返回队首元素
         * poll() 返回队首元素，队首元素出队列
         * add() 添加元素
         */

        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        for (int o : arr) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(o);
            } else if (o < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(o);
            }
        }

        int[] ans = new int[priorityQueue.size()];
        int index = 0;
        for (int o : priorityQueue) {
            ans[index++] = o;
        }

        return ans;
    }
}

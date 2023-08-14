import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if(priorityQueue.size() < k){
                priorityQueue.add(nums[i]);
            }else {
                if(nums[i] > priorityQueue.peek()){
                    priorityQueue.poll();
                    priorityQueue.add(nums[i]);
                }
            }
        }
        return priorityQueue.poll();
    }
}

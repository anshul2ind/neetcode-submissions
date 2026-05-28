class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> queue = new PriorityQueue();
       for(var num: nums) {
        queue.offer(num);
        if(queue.size() > k) {
            queue.poll();
        }
       } 

       return queue.poll();
    }
}

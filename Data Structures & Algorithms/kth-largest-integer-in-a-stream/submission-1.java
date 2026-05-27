class KthLargest {
    int k;
    List<Integer> list;
    Queue<Integer> priorityQueue = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(var num: nums) {
            priorityQueue.offer(num);
        }
        while(priorityQueue.size() > k) {
            priorityQueue.poll();
        }
    }
    
    public int add(int val) {
        priorityQueue.offer(val);
        while(priorityQueue.size() > k) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }

    public void bubbleSort() {
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() - 1 - i; j++ ) {
                if(list.get(j) > list.get(j+1)) {
                    var temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}

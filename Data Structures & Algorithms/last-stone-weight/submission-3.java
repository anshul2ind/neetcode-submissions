class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) {
            return stones[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        for(var num: stones) {
            queue.offer(num);
        }
        
        while(queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            if ( x < y ) {
                var diff = y - x;
                queue.offer(diff);
            } else if (x > y) {
                var diff = x - y;
                queue.offer(diff);
            }
        }

        return queue.size() == 1 ? queue.poll() : 0;
    }

    public void bubbleSort(int[] stones) {
        for(int i = 0; i < stones.length; i++) {
            for(int j = 0; j < stones.length - i - 1; j++) {
                if(stones[j] < stones[j+1]) {
                    var temp = stones[j];
                    stones[j] = stones[j+1];
                    stones[j+1] = temp;
                }
            }
        }

    }
}

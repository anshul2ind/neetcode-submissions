class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) {
            return stones[0];
        }
        for(int i = 0; i < stones.length; i++) {
            bubbleSort(stones);
            if(stones[0] == stones[1]) {
                stones[0] = stones[1] = 0;
            } else if(stones[0] < stones[1]) {
                stones[1] = stones[1] - stones[0];
                stones[0] = 0;
            } else {
                stones[0] = stones[0] - stones[1];
                stones[1] = 0;
            }
        }
        return stones[0];
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

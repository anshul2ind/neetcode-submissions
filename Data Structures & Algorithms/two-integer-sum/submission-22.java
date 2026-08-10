class Solution {
    class Node {
        int index;
        int val;
        Node(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }
    // public int[] twoSum(int[] nums, int target) {
    //     int l = 0;
    //     int r = nums.length - 1;

    //     Node[] arr = new Node[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         arr[i] = new Node(i, nums[i]);
    //     }

    //     BSort(arr);

    //     while (l < r) {
    //         int sum = arr[l].val + arr[r].val;
    //         if (sum < target) {
    //             l++;
    //         } else if (sum > target) {
    //             r--;
    //         } else {
    //             return new int[] {
    //                 Math.min(arr[l].index, arr[r].index), Math.max(arr[l].index, arr[r].index)};
    //         }
    //     }
    //     return null;
    // }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
                var j = map.get(nums[i]);
                return i < j ? new int[] {i, j} : new int[] {j, i};
            }
        }

        return null;
    }

    public void BSort(Node[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j].val > nums[j + 1].val) {
                    var temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

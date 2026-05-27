class KthLargest {
    int k;
    List<Integer> list;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        if (nums == null) {
            list = new ArrayList();
        } else {
        list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        }
    }
    
    public int add(int val) {
        list.add(val);
        bubbleSort();
        return list.get(list.size() - k);
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

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap();
        List<Integer> unique = new ArrayList();
        for(var val : arr2) {
            set.add(val);
        }


        for(var val: arr1) {
            if(set.contains(val)) {
                map.put(val, map.getOrDefault(val, 0) + 1);
            } else {
                unique.add(val);
            }
        }
        int i = 0;
        for(var val: arr2) {
            var count = map.get(val);
            while(count > 0) {
                arr1[i++] = val;
                count--;
            }
        }
        for(var val : unique.stream().sorted().toList()){
            arr1[i++] = val;
        };
        return arr1;
    }
}
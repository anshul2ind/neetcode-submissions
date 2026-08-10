class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char [] arr = s.toCharArray();
        char [] tArr = t.toCharArray();
    //     Map<Character,Integer> map1 = new HashMap();
    //     Map<Character,Integer> map2 = new HashMap();
    //     for( int i = 0; i < arr.length; i++) {
    //         map1.put(arr[i], map1.getOrDefault(arr[i], 0) + 1);
    //         map2.put(tArr[i], map2.getOrDefault(tArr[i], 0) + 1);
    //     }
       
    //    return map1.equals(map2);
        int [] counter = new int[26];
        for(int i = 0; i < arr.length; i++) {
            counter[arr[i] - 'a']++;
            counter[tArr[i] - 'a']--;
        }
        
        for(var num : counter) {
            if(num != 0) {
                return false;
            }
        }
        return true;
    }

    public void bSort(char[] arr) {
        for( int i = 0; i < arr.length -1; i++) {
            for(int j = 0; j < arr.length - i -1; j++) {
                if(arr[j] > arr[j+1]) {
                    var temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void sSort(char[] arr) {
        for(int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++) { 
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            var temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

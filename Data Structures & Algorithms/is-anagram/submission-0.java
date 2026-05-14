class Solution {
    public boolean isAnagram(String s, String t) {
        var sArr = s.toCharArray();
        var tArr = t.toCharArray();
        if (sArr.length != tArr.length) {
            return false;
        }

        bubbleSort(sArr);
        bubbleSort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }

        return true;
    }

    public void bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1 - i) ; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

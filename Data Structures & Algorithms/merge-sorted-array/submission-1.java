class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for(int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        int idx = 0;
        int i = 0;
        int j = 0;
        while(idx < m+n) {
            if(j >= n || (i < m && temp[i] < nums2[j])) {
                nums1[idx] = temp[i];
                i++;
                idx++;
            } else {
                nums1[idx] = nums2[j];
                j++;
                idx++;

            }
        }

        
    }

    public void bubbleSort(int[] num) {
        int len = num.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] num) {
        int len = num.length;
        int mini;

        for (int i = 0; i < len - 1; i++) {
            mini = i;
            for (int j = i + 1; j < len; j++) {
                if (num[j] < num[mini]) {
                    mini = j;
                }
            }

            int temp = num[mini];
            num[mini] = num[i];
            num[i] = temp;
        }
    }

    public void intertionSort(int[] num) {
        int len = num.length;
        for (int i = 0; i < len; i++) {
            int temp = num[i];
            int j = i;

            while (j > 0 && temp < num[j-1]) {
                num[j] = num[j - 1];
                j--;
            }

            num[j] = temp;
        }
    }
}
class Solution {
    char ch = '-';

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder("");
        for (var str : strs) {
            result.append(str.length());
            result.append(ch);
            result.append(str);
        }
        System.out.println(result);
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        if(str == null || str.length() == 0) {
            return result;
        }
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            var length = 0;
            while (arr[i] != ch) {
                length = (length * 10) + (arr[i++] - '0');
            }
            var st = "";
            while (length > 0) {
                st += arr[++i];
                length--;
            }
            result.add(st);
        }

        return result;
    }
}

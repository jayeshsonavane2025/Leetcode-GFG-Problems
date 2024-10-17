class Solution {
     public int maximumSwap(int num) {
        char[] c = String.valueOf(num).toCharArray();
        int[] cumGreater = new int[c.length];

        int greaterIndex = c.length - 1;
        for (int i = c.length - 1; i >= 0; i--) {
            if ((c[i] - '0') > (c[greaterIndex] - '0')) {
                greaterIndex = i;
            } 
            cumGreater[i] = greaterIndex;
        }

        for (int i = 0; i < c.length; i++) {
            if ((c[i] - '0') < (c[cumGreater[i]] - '0')) {
                char temp = c[i];
                c[i] = c[cumGreater[i]];
                c[cumGreater[i]] = temp;
                break;
            }
        }

        return Integer.parseInt(new String(c));
    }
}
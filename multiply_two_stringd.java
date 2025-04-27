class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here.
        // s1 = s1.replaceFirst("^0+(?!$)", "");
        // s2 = s2.replaceFirst("^0+(?!$)", "");
        
        // if(s1.equals("0") || s2.equals("0")){
        //     return "0";
        // }
        
        // long num1 = Long.parseLong(s1);
        // long num2 = Long.parseLong(s2);
        
        // long num3 = num1 * num2;
        
        // // StringBuilder sb = new StringBuilder();
        // // while(sb.length() > 1 && (sb.charAt(0)==0 && sb.charAt(1)==0)){
        // //     sb.deleteCharAt(0);
        // //     sb.deleteCharAt(1);
        // // }
        // // return sb.toString();
        // String str = Long.toString(num3);
        // return str;
        
        
        boolean isNegative = false;
        
        if (s1.charAt(0) == '-') {
            isNegative = !isNegative;
            s1 = s1.substring(1);
        }
        
        if (s2.charAt(0) == '-') {
            isNegative = !isNegative;
            s2 = s2.substring(1);
        }

        s1 = s1.replaceFirst("^0+(?!$)", "");
        s2 = s2.replaceFirst("^0+(?!$)", "");

        // If any number becomes "0", return "0"
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        int n = s1.length();
        int m = s2.length();
        int[] result = new int[n + m];

        // Multiply each digit
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int digit1 = s1.charAt(i) - '0';
                int digit2 = s2.charAt(j) - '0';
                int product = digit1 * digit2;

                int sum = product + result[i + j + 1];

                result[i + j] += sum / 10;     // carry
                result[i + j + 1] = sum % 10;   // current digit
            }
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        // Skip leading zeros in result array
        while (i < result.length && result[i] == 0) {
            i++;
        }
        
        for (; i < result.length; i++) {
            sb.append(result[i]);
        }

        if (isNegative) {
            sb.insert(0, '-');
        }

        return sb.toString();

    }
}

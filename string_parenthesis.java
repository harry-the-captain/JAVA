public class string_parenthesis {
    String remove_p(string s){
        String res = "";
        int j = 0;
        for (int i=0; i<s.length(); i++){
            if(s[i] == 41){
                j--;
            }
            if(j!=0){
                res = res + s[i];

            }
            if(s[i] == 40){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        System.err.println(remove_p);
    }
}

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1 = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(!s1.isEmpty() && s1.peek() == s.charAt(i)){
                s1.pop();
            }
            else{
                s1.push(s.charAt(i));
            }
        }

        for(Character ch : s1){
            sb.append(ch);
        }
        return sb.toString();
    }
}

class reverse_string{
    public static void main(String[] args) {
        String s = "harry";
        int length = s.length();
        char[] charArray = s.toCharArray();  // i just used toCharArray() method

        for(int i=charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
    }
}

class Solution{
    String isVowel(char c){
        // code here
        
        // if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        // {
        //     System.out.println("YES");
            
        // }
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        for(char vowel:vowels)
        {
        if(c==vowel)
        {
            return "YES";
        }
        }
        
        return "NO";
    }
}

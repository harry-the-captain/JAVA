// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class vowels_consonants {
    public static void main(String[] args) {
        String s = "harry the captain!";
        int vowels=0; 
        int consonants =0;
        String lower = s.toLowerCase();
        for(int i=0; i<s.length(); i++)
        {
            char ch = lower.charAt(i);
            if(ch !=' ' && (ch >='a' && ch <='z'))
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println("no.of vowels: "+ vowels);
        System.out.println("no.of. consonants: " + consonants);
    }
}

package may;

import java.util.HashSet;
import java.util.Set;

public class May_5 {
    public static void main(String[] args) {
        String str = "weallloveyou";
        System.out.println(noofvowels(str,7));
    }

    private static int noofvowels(String str, int k) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int ans=0;
        for (int i=0;i<k;i++){
            ans += vowels.contains(str.charAt(i)) ? 1:0;
        }
        int answer = ans;
        for (int i=k;i<str.length();i++){
            ans += vowels.contains(str.charAt(i)) ?1:0;
            ans -= vowels.contains(str.charAt(i-k)) ?1:0;
            answer = Math.max(answer,ans);
        }
        return answer;
    }
}

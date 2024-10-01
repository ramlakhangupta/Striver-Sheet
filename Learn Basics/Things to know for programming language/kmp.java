import java.util.HashMap;

public class kmp {
    public static void main(String[] args){
        String str = "ababcabcabababd";
        String target = "abcdeabfabc";
        int[] localArray = local(target);
        int i = 1, j = -1;
        while(i < str.length() && j < localArray.length){
            if (str.charAt(i) == target.charAt(j+1)) {
                i++;
                j++;
            } else {
                
            }
        }
    }

    public static int[] local(String target) {
        int n = target.length();
        int[] ans = new int[target.length()];
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 1; i <= n; i++) {
           if(!map.containsKey(target.charAt(i-1))){
                ans[i-1] = 0;
                map.put(target.charAt(i-1), i);
           } else {
            ans[i-1] = map.get(target.charAt(i-1));
            int indKey = map.get(target.charAt(i-1));
            map.put(target.charAt(i-1), indKey);
           }
        }
        
        return ans;
    }
}

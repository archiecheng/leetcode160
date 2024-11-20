import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
//        String s = "()";
//        String s = "()[]{}";
        String s = "([])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        if (s.length() % 2 != 0){
            return false;
        }
        Map<Character, Character> mp = new HashMap<>();
        mp.put('(', ')');
        mp.put('[', ']');
        mp.put('{', '}');
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (mp.containsKey(c)){
                st.push(mp.get(c));
            } else if (st.isEmpty() || st.pop() != c){
                return false;
            }
        }
        return st.isEmpty();
    }
}

import java.util.HashMap;
public class hashmap{
    public static void main(String[] args) {
        HashMap<Character , Integer> map = new HashMap<>();
        String word = "banana";
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch , map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }

}



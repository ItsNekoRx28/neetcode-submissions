class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> strmapS = charOcurrences(s);
        HashMap<Character,Integer> strmapT = charOcurrences(t);
        return strmapS.equals(strmapT);
    }

    private HashMap<Character,Integer> charOcurrences(String s){
        HashMap<Character,Integer> strmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if (strmap.containsKey(currentChar)){
                strmap.put(currentChar,strmap.get(currentChar) + 1);
            }
            else{
                strmap.put(currentChar,1);
            }
        }
        return strmap;
    }
}

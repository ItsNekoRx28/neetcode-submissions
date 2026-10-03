class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> groupedAnagrams = new HashMap<>();
        boolean added = false;
        String currentStr;
        String currentAnagram;
        List<String> currentAnagramList;
        for(int i = 0; i < strs.length; i++){
            added = false;
            currentStr = strs[i];
            currentAnagram = anagramize(currentStr);
            currentAnagramList = groupedAnagrams.get(currentAnagram);
            if(currentAnagramList != null){
                currentAnagramList.add(currentStr);
            }
            else{
                List<String> newAnagramList = new ArrayList<>();
                newAnagramList.add(currentStr);
                groupedAnagrams.put(currentAnagram,newAnagramList);
            }
        }
        return new ArrayList<>(groupedAnagrams.values());
    }

    private String anagramize(String s) {
        String[] strArr = s.split("");
        Arrays.sort(strArr);
        return String.join("",strArr);
    }
}
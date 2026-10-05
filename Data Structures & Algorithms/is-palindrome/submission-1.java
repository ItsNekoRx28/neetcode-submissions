class Solution {
    public boolean isPalindrome(String s) {
        String cleanned = cleanStr(s);
        return cleanned.equals(new StringBuilder(cleanned).reverse().toString());
    }

    public String cleanStr(String s){
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] c = new int[26];
        for(int i = 0;i<magazine.length();i++){
            c[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0;i<ransomNote.length();i++){
            int index = ransomNote.charAt(i)-'a';
            if(c[index] == 0) return false;
            c[index]--;
        }
        return true;
    }
}
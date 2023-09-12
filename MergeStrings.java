/*
You are given two strings word1 and word2. 
Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
*/

class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length() > 0 && word2.length() > 0){
            String result = "";
            for(int i = 0; i < word1.length() || i < word2.length(); i++){
                if(i < word1.length()){
                    result = result + String.valueOf(word1.charAt(i));
                }
                if(i < word2.length()){
                    result = result + String.valueOf(word2.charAt(i));
                }
            }
            return result;
        }else if(word1.length() > 0){
            return word1;
        }else{
            return word2;
        }
    }
}

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
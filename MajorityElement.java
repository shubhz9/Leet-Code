class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> occurences = new HashMap<Integer, Integer>();
        int max = 0, res = 0;
        for(Integer occ: nums){
            if(occurences.containsKey(occ)){
                occurences.put(occ, occurences.get(occ) + 1);
            }else{
                occurences.put(occ, 1);
            }
        }

        for(Integer key: occurences.keySet()){
            if(max < occurences.get(key)){
                max = occurences.get(key);
                res = key;
            }
        }

        return res;
    }
}
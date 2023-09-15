/* 
169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

LINK - https://leetcode.com/problems/majority-element/description/
*/

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
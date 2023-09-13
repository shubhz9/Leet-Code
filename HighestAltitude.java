/* 
1732. Find the Highest Altitude

Problem Statement -
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). 
Return the highest altitude of a point.

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Link - https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75
*/
class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prev = 0;
        for(int i = 0; i < gain.length; i++){
            prev = prev + gain[i];
            if(max < prev){
                max = prev;
            }
        }

        return max;
    }
}
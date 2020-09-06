/*
 * A string S of lowercase English letters is given.
 *  We want to partition this string into as many parts as possible so that each letter appears in at most one part, 
 *  and return a list of integers representing the size of these parts.
 *  Example 1:
 *  Input: S = "ababcbacadefegdehijhklij"
 *  Output: [9,7,8]
 *  Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 */

// AUTHOR:Nisarg Devdhar
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class labelPartition {
	
	public static void main(String[] args) {
		List<Integer> result=partitionLabels("abaabcdeedfedfklmklm");
		for(Integer i:result) {
			System.out.print(i+",");
		}
	}
	   public static List<Integer> partitionLabels(String s) {
	        List<Integer> result=new ArrayList<Integer>();
	        if(s.length()==0){
	            return result;
	        }
	        
	        char[] arr=s.toCharArray();
	        HashSet<Character> seen=new HashSet<Character>();
	        int[] right=new int[26];
	        
	        for(char ch:arr){
	            right[ch-'a']++;
	        }
	        
	        int count=0;
	        for(char ch:arr){
	            count++;
	            seen.add(ch);
	            if(--right[ch-'a']==0){
	                seen.remove(ch);
	                if(seen.isEmpty()){
	                    result.add(count);
	                    count=0;
	                }
	            }
	            
	        }
	        return result;
	    }
}

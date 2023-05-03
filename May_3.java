package may;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class May_3 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3} , nums2 = {2,6,4};
        System.out.println(findDifference(nums1,nums2));
    }
    public static ArrayList<ArrayList<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>();
        ArrayList<Integer> ans2 = new ArrayList<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int n : nums1) set1.add(n);
        for(int n : nums2) set2.add(n);
        for (int n : set1){
            if(set2.contains(n) == false){
                ans1.add(n);
            }
        }
        for (int n : set2){
            if(set1.contains(n) == false){
                ans2.add(n);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}

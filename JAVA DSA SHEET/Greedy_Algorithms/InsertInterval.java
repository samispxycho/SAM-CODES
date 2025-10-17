package Greedy_Algorithms;

import java.util.*;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        int i = 0;
        while(i<n && newInterval[0] > intervals[i][1]){
            result.add(intervals[i]);
            i+=1;
        }
        while(i<n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i+=1;
        }
        result.add(newInterval);
        while(i<n){
            result.add(intervals[i]);
            i+=1;
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] ans = insert(intervals, newInterval);
        for(int[] arr : ans){
            System.out.println(Arrays.toString(arr));
        }
    }
}

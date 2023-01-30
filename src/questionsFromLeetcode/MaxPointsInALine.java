/*
* Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.
* */

package questionsFromLeetcode;

import java.util.HashMap;

public class MaxPointsInALine {
    public static int maxPoints(int[][] points) {
        int max = 1;
        for(int i = 0; i < points.length; i++){
            HashMap<Double, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                if(i == j) continue;
                double slope =  (points[j][0] - points[i][0]) != 0 ? (points[j][1] - points[i][1]) * 1.0 / (points[j][0] - points[i][0]) : Integer.MAX_VALUE;
                map.put(slope, map.getOrDefault(slope, 1) + 1);
                max = Math.max(max, map.get(slope));
            }
        }
        return max;

    }
    public static void main(String[] args) {
//     [[1,1],[2,2],[3,3]]
        int[][] arr = {
                {1,1},
                {2,2},
                {3,3}
        };
        System.out.println(maxPoints(arr));
    }
}

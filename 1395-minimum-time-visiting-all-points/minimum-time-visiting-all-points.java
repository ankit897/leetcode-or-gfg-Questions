class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int mintime = 0;
        for(int i =1;i<points.length;i++){
            mintime+=Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
        }
        return mintime;
    }
}
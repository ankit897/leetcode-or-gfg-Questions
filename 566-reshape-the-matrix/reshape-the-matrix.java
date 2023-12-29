class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                a.add(mat[i][j]);
            }
        }
        if(r*c==mat.length*mat[0].length){
        int matrix[][] = new int[r][c];
        int k =0;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(a.size()==k){
                    break;
                }
                matrix[i][j] = a.get(k);
                k++;
            }
        }
        return matrix;
        }
        else{
            return mat;
        }
    }
}
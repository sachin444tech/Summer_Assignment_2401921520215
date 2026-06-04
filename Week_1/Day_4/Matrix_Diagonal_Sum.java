class Solution {
    public int diagonalSum(int[][] mat) {
        int sumOfDiagonal = 0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            sumOfDiagonal += mat[i][i];
            sumOfDiagonal += mat[i][n-1-i];
        }
        if(n%2 != 0){
            sumOfDiagonal -= mat[n/2][n/2];
        }
        return sumOfDiagonal;
    }
}
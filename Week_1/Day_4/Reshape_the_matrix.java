class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c) return mat;
        if(n==r && m==c)  return mat;
        
        int new_mat[][] = new int[r][c];
        int new_index = 0;
        int old_index = 0;
        while(new_index<r*c && old_index<n*m){
            new_mat[new_index/c][new_index%c] = mat[old_index/m][old_index%m];
            new_index++;
            old_index++;
        }
        return new_mat;
    }
}
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if((row*col)!=(r*c)){
            return mat;
        }
        int[][] reshaped=new int[r][c];
        int noOfEle=row*col;
        for(int i=0;i<noOfEle;i++){
            int rowInd=i/col;
            int colInd=i%col;
            int tarRow=i/c;
            int tarCol=i%c;
            reshaped[tarRow][tarCol]=mat[rowInd][colInd];
        }
        return reshaped;
    }
}

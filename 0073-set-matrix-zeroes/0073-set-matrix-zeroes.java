class Solution {
    public void setZeroes(int[][] matrix) {
        int fr=-1, fc=-1;
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                if(matrix[row][col]==0){
                    if(fc==-1){
                        fr=row;
                        fc=col;
                    }
                    matrix[fr][col]=0;
                    matrix[row][fc]=0;
                }

            }
        }
        if(fc==-1) return;
        for(int col=0; col<matrix[0].length; col++){
            if(matrix[fr][col]==0&&col!=fc){
                setColsZero(col, matrix);
            }
        }
        for(int row=0; row<matrix.length; row++){
            if(matrix[row][fc]==0){
                setRowsZero(row, matrix);
            }
        }
        setColsZero(fc, matrix);
    }

    private static void setColsZero(int col, int[][] matrix){
        for(int row=0; row<matrix.length; row++){
            matrix[row][col]=0;
        }
    }
    private static void setRowsZero(int row, int[][] matrix){
        for(int col=0; col<matrix[row].length; col++){
            matrix[row][col]=0;
        }
    }
}
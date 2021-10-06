package edai.tema1.ejercicio3;

public class Matrix {
    private int[][] matrix ;
    //===========================================================
    public Matrix(int[][] rc) throws NullPointerException{
        if(rc == null){
            throw new NullPointerException();
        }
        matrix = new int[rc.length][rc[rc.length-1].length];

        for(int i = 0; i < rc.length;i++){
            for(int j = 0; j < rc[i].length; j++){
                matrix[i][j] = rc[i][j];
            }
        }
    }
    //===========================================================
    public void setRC(int r, int c, int val) throws ArrayIndexOutOfBoundsException{
        matrix[r][c] = val;
    }
    //===========================================================
    public int getRC(int r, int c) throws ArrayIndexOutOfBoundsException{
        return matrix[r][c];

    }
    //===========================================================
    public Matrix add(Matrix right) throws MatrixException{
        if(matrix.length != right.matrix.length || matrix[0].length != right.matrix[0].length){
            throw new MatrixException("Cannot add matrices of different order");

        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                matrix[i][j]+= right.getRC(i,j);
            }
        }
        return this;
    }
    //===========================================================
    public Matrix multiply(Matrix right) throws MatrixException{
        if(matrix.length != right.matrix.length || matrix[0].length != right.matrix[0].length){
            throw new MatrixException("Cannot multiply matrices if number of columns in left matrix is not equal to number of rows in right matrix");
        }
        int[][] res =new int[matrix.length][matrix[matrix.length-1].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j=0;j<matrix[matrix.length-1].length;j++){
                res[i][j] = 0;
                for(int k = 0; k < matrix.length; k++){
                    res[i][j] += matrix[i][k] * right.getRC(k,j);
                    System.out.println(res[i][j]);
                }
            }
        }
        return new Matrix(res);
    }
    //===========================================================
    public boolean equals(Matrix other){
        boolean res = true;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] != other.getRC(i,j)){
                    res = false;
                }
                System.out.println(matrix[i][j] +" = "+ other.getRC(i, j));
            }
        }

        return res;
    }
    //===========================================================
}

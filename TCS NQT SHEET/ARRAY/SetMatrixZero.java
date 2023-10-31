package ARRAY;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][]matrix = {{1,1,1},{1,0,1},{1,1,1}};

        //Creating two arrays of m and n sizes
        int[]row = new int[matrix.length];
        int[]col = new int[matrix[0].length];

        //manipulating values acc to matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        //changing the values in the original matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
        //printing matrix
        for(int[]arr : matrix){
            for(int ele:arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        
    }
}

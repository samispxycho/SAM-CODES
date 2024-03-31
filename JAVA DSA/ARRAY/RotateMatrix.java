package ARRAY;

public class RotateMatrix {

    static void swap(int[][]arr,int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }

    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;

        //Transposing the matrix
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }

        //Reversing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        for(int[]nums : matrix){
            for(int ele:nums){
                System.out.print(ele +" ");
            }
            System.out.println();
        }

    }
}

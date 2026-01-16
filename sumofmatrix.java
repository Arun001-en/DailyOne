import java.util.Scanner;

public class sumofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the array:");
        // int row= sc.nextInt();
        // int col = sc.nextInt();
        // int[][]arr = new int[row][col];
        // int sum = 0;
        // for(int i = 0 ; i<row ; i++){
        //     for(int j = 0 ; j<col; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i = 0 ; i<row ; i++){
        //     for(int j = 0 ; j<col ; j++){
        //         sum = sum+arr[i][j];
        //     }
        // }
        // System.out.println(sum);
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        boolean []rows = new boolean[rowLength];
        boolean []columns = new boolean [columnLength];

        for(int i=0; i<rowLength; i++){
            for(int j=0; j<columnLength; j++){
                if(matrix[i][j]==0){
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        for(int i=0; i<rowLength; i++){
            for(int j=0; j<columnLength; j++){
                if(rows[i] || columns[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

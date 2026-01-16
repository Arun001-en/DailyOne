import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
    { 1,  2,  3,  4,  5,  6},
    { 7,  8,  9, 10, 11, 12},
    {13, 14, 15, 16, 17, 18},
    {19, 20, 21, 22, 23, 24},
    {25, 26, 27, 28, 29, 30},
    {31, 32, 33, 34, 35, 36}
    };  
    int top = 0 , bottom = arr.length-1 , left = 0 , right = arr[0].length;
    while(right>=left && top>=bottom){
        for(int i = left ; i<=right ; i++){
            System.out.print(arr[top][i]);
        }
        top++;
        for(int i = top ; i<=bottom ; i++){
        System.out.print(arr[i][right]+" ");
    }
    right--;
    if(top<=bottom){
        for(int i = right ; i>=left ; i--){
            System.out.println(arr[bottom]+" ");
        }
        bottom--;
            }
            if(left<=right){
                for(int i = bottom ; i>=top ; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    
    }
}

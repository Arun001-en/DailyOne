import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number is:");
        int target = sc.nextInt();
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        if(arr.length==0){
            System.out.println(-1);
        }
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                System.out.println("the traget is found at the index of:" + i);
                break;
            }
        }
    }
}

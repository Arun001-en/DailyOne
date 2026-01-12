import java.util.Scanner;

public class BInarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target is:");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println("The index of the element is:"+ mid);
                break;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
    }
}

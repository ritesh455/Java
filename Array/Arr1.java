// Example-1 Searching number in array
// import java.util.Scanner;
// class Arr1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int flag=0;
//         int[] arr=new int[]{10,20,30,40,50};
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==num){
//                 System.out.println("Number found at "+i+" index number");
//                 flag=1;
//             }
//         }
//         if(flag!=1){
//             System.out.println("Number not found");
//         }
//     }
// }






// Example no.2   2D array printing sum and average
import java.util.*;
class Arr1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int sum=0;
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("--------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+sum/(row*col));
    }
}





// Example no.3  in 1D array sum of even num and odd num
// class Arr1 {
//     public static void main(String[] args) {
//         int flag=0;
//         int evenSum=0,oddSum=0;
//         int[] arr=new int[]{15,20,11,6,19,3,18,21,23,13};
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 evenSum=evenSum+arr[i];
//             }else{
//                 oddSum=oddSum+arr[i];
//             }
//         }
//         System.out.println("Even sum: "+evenSum);
//         System.out.println("Odd sum: "+oddSum);
//     }
// }





// Example no. 4 
class Arr1 {
    public static void main(String[] args) {
        int flag=0;
        int min=0,max=0;
        int[] arr=new int[]{15,20,11,6,19,3,18,21,23,13};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max=arr[i];
            }else if(arr[i]<arr[i+1]){
                min=arr[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
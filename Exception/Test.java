// // Example of Exception handling using 'throw' keyword in java
// import java.util.*;
// class Test {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);   
//         try{
//             int a=sc.nextInt();
//             int b=sc.nextInt();
//             if(a<=0 || b<0){                        //If the condition match
//                 Exception ex=new Exception();       //The object of Exception class is created
//                 throw ex;                           //The exception throws using 'throw' keyword - the error message goes to catch(Exception e2) line and throws the error which programmer wants to show
//             }
//             int c=a/b;
//             System.out.println(c);
//         }catch(ArithmeticException e1){
//             System.out.println(e1.getMessage());
//         }
//         catch(Exception e2){
//             System.out.println("Enter positive number and non zero number");
//         }
//     }
// }



// Example of throw
// import java.util.*;
// class Test{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         try{
//             int a=sc.nextInt();
//             int b=sc.nextInt();
//             if(a<=0 || b<0){
//                 Exception ex=new Exception("Please Enter positive and non zero number");
//                 throw ex;
//             }
//             int c=a/b;
//             System.out.println(c);
//         }catch(Exception e2){
//             System.out.println(e2.getMessage());
//         }
//     }
// }




// Example 3

import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }catch(Exception e1){
            System.out.println(e1);
        }
    }
}
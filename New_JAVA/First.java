// Example No. 1-----------------------------
// class Hello{
//     class New{

//     }
// }
// class First{
//     public static void main(String[] args){
//         System.out.println("Hello");
//     }
// }





// Example No. 2--------------If we create two class and compile then It will work but we have to call class name to run the code
// class Hello{
//     static public void main(String []args){
//         System.out.println("Hello");
//     }
// }
// class New{
//     public static void main(String[] args){
//         System.out.println("New One");
//     }
// }









// Example no. 3--------------------------------------
// class Cal{
//     public static void main(String []args){
//         int p=1000,r=2,t=365;
//         double result;
//         result= p*r*t/100;
//         System.out.println("Result: "+ result);
//     }
// }














// Example no. 4-------------------------------------
// class Maths{
//     public static void main(String []args){
//         System.out.println("result "+ Math.random());
//         System.out.println("result "+ Math.max(2,3));
//         System.out.println("result "+ Math.min(10,11));
//         double p=5,b=10;
//         double area= Math.sqrt(Math.pow(p, 2)+Math.pow(b, 2));
//         System.out.println("Area: "+area);
//     }
// }



















// Example no. 5 ------------------------
// class Test {
//     public static void main(String[] args){
//         int n=2;
//         if(n<=2)
//             System.out.println(n);//If we don`t declare inside the block then first line after if is treated as part of 'if'
//             System.out.println("General Statement");//This statement executed as general statement (Do not depend on if condition)
//     }
// }











// Example no. 6-------------------Command Line input
// class Input{
//     public static void main(String[] args) {
//         System.out.println(args[0]);
//         System.out.println(args[1]);
//         System.out.println(args[0]+args[1]);// It will not perform addition because the input is treated as string so we have to convert the string to int
//     }
// }



// class Input{
//     public static void main(String[] args) {
//         int a=Integer.parseInt(args[0]);
//         int b=Integer.parseInt(args[1]);
//         int c=a+b;
//         System.out.println(c);
//     }
// }


















// Example no. 7 ---------Check number is even or odd
// class Num{
//     public static void main(String[] args) {
//         int n= Integer.parseInt(args[0]);
//         if(n%2==0){
//             System.out.println("Even: "+n);
//         }else{
//             System.out.println("Odd: "+n);
//         }
//     }
// }


// Check employee is married or unmarried to provide inssuarance
// class Emp{
//     public static void main(String[] args) {
//         int age=Integer.parseInt(args[0]);
//         if (args[1].equals("unmarried") & age>35 & args[2].equals("male")) {
//             System.out.println("Insurance");
//         }
//         else if(args[1].equals("unmarried") & age>30 & args[2].equals("female")){
//             System.out.println("Insurance");
//         }
//         else if(args[1].equals("married")){
//             System.out.println("Insurance");
//         }else{
//             System.out.println("Nooo");
//         }
//     }
// }












// Switch
// class Switch{
//     public static void main(String[] args) {
//         int a=Integer.parseInt(args[0]);
//         switch (a) {
//             case 11:case 12:case 1:case 2:
//                 System.out.println("winter");
//                 break;
//             case 3:case 4:case 5:case 6:
//                 System.out.println("summer");
//                 break;
//             case 7:case 8:case 9:case 10:
//                 System.out.println("rainy");
//                 break;
//             default:
//                 System.out.println("Enter valid month");
//         }
//     }
// }















// Input from scanner  --------------  and  ------------------- format double to fixed length
// To format the double we can also use the Formmater class
// like:=   Formatter fmt= new Formmatter();
//          fmt.format("%2f",a);
//          System.out.println(fmt);

// import java.util.Scanner;
// class Input{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 1st num");
//         double a=sc.nextDouble();
//         // System.out.println("Enter 2nd num");
//         // double b=sc.nextDouble();
//         // System.out.println("Sum: "+(a+b));
//         System.out.printf("%.2f ",a);  //This statement helps to format the double number to fixed length.
//     }
// }

























// Loops--------------------------------
// while
// class Loop{
//     public static void main(String[] args) {
//         int a=0;
//         while (a<5) {
//             System.out.println(a);
//             a++;
//         }
//     }
// }

// class Loop{
//     public static void main(String[] args) {
//         int a=0;
//         while (true) {       //This while loop goes to infinite loop
//             System.out.println(a);
//             a++;
//         }
//     }
// }





// For loop
// class Loop{
//     public static void main(String[] args) {
//         //for(int i=0;i<6;i++){
//         for(int i=0;(i<10||i<=5)&&(i<11 || i<6);i++){
//             System.out.println(i);
//         }
//     }
// }



//     \n   \t   \b    \r
// public class Main
// {
    
// 	public static void main(String[] args) {
// 	    System.out.println("Hello\tNewHello\nNewText\rReplace\boo");	
// 	}
// }
// class Employee{
//     private String name;
//     private double sal;
//     public Employee(String name,double sal){
//         this.name=name;
//         this.sal=sal;
//     }
//     public String getName(){
//         return name;
//     }
//     public double getSal(){
//         return sal;
//     }
// }
// class Manager extends Employee{
//     private double bonus;
//     public Manager(String name,double sal,double bonus){
//         super(name, sal);
//         this.bonus=bonus;
//     }
//     public double getTotal(){
//         return bonus+getSal();
//     }
// }
// class Intro1 {
//     public static void main(String[] args) {
//         Manager e1=new Manager("Amit", 10000, 444.33);
//         System.out.println("Name: "+e1.getName());
//         System.out.println("Salary: "+e1.getSal());
//         System.out.println("Total Salary: "+e1.getTotal());
//     }   
// }






// Example of staic and dynamic binding
// class A{
//     public static void show(){
//         System.out.println("In show of A");
//     }
//     public void display(){
//         System.out.println("Display A");
//     }
// }
// class B extends A{
//     public static void show(){
//         System.out.println("In show of B");
//     }
//     public void display(){
//         System.out.println("Display B");
//     }
// }
// class Intro1{
//     public static void main(String[] args) {
//         A ref;
//         ref=new A();
//         ref.show();
//         ref.display();
//         ref=new B();
//         ref.show();
//         ref.display();
//     }
// }






// Interface example to achieve multiple inheritance
// interface Shape{
//     double area();
// }
// interface figure{
//     String name();
// }
// interface myShape extends Shape,figure{

// }
// class UseShape implements myShape{
//         double l=10.1;
//         double b=20.1;
//        public double area(){
//             return l*b;
//         }
//        public String name(){
//             return "name";
//         }
//     }
// class Intro1 {
//     public static void main(String[] args) {
//         myShape m1=new UseShape();
//         System.out.println(m1.area());
//         System.out.println(m1.name());
//     }
// }






// // It gives error
//  interface car1 {
//     default void start(){
//         System.out.println("car 1");
//     }
//     void stop();
// }
//  interface car2 {
//     default void start(){
//         System.out.println("car 2");
//     }
//     void stop();
// }
// class cars implements car1,car2{
//     public void stop(){
//         System.out.println("stop");
//     }
// }
// class Intro1{
//     public static void main(String[] args) {
//         cars c=new cars();
//         c.start();
//         c.stop();
//     }
// }





// // string equals
// class Main1{
//     String s1="Hello";
//     String s2="Hello";
//     String s3=new String("Hello");
//     String s4=new String("Hello");
//     String s5=new String();
//     char [] arr={'s','a','h','i','l'};
//     String s6=new String(arr);
//     String s7=new String(arr,2,3);
// }
// class Intro1 {
//     public static void main(String[] args) {
//         Main1 m1=new Main1();
//         System.out.println(m1.s1==m1.s2);
//         System.out.println(m1.s3==m1.s4);
//         System.out.println(m1.s2==m1.s3);
//         System.out.println(m1.s5);
//         System.out.println(m1.s6);
//         System.out.println(m1.s7);
//     }
// }






// class Main1{
//     String name;
//     public Main1(String name){
//         this.name=name;
//     }
//     public boolean equals(Object obj){
//         Main1 m=(Main1)obj;
//         return this.name.equals(m.name);
//     }
// }
// class Intro1 {
//     public static void main(String[] args) {
//         Main1 m1=new Main1("Hello");
//         Main1 m2=new Main1("Hello");
//         System.out.println(m1.equals(m2));
//     }
// }










// import java.util.*;
// class Intro1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x1=0,x2=0;
//         try{
//          x1=sc.nextInt();
//          x2=sc.nextInt();
//         int x3=x1/x2;
//         System.out.println("Div: "+x3);
//         }catch(ArithmeticException e){
//             System.out.println("Division by 0");
//         }catch(InputMismatchException e1){
//             System.out.println("Not integer");
//         }
//         int x4=x1+x2;
//         System.out.println(x4);
//     }
// }







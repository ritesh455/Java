// // Using setter and getter which can achieve encapsulation
// class Circle{
//     private int radius;
//     public void setRadius(int r){
//         radius=r;
//     }
//     public double getCalR(){
//         double result=Math.PI*Math.pow(radius, 2);
//         return result;
//     }
//     public double getCircumference(){
//         double result2=Math.PI*2*radius;
//         return result2;
//     }
// }
// class Main2 {
//     public static void main(String[] args) {
//         Circle c=new Circle();
//         c.setRadius(10);
//         System.out.println("Radius is: "+c.getCalR());
//         System.out.println("Circumference is: "+c.getCircumference());
//     }
// }















// // Example no.2
// class Worker{
//     private int hw;
//     private double payRate;
//     public void setData(int h,double r){
//         hw=h;
//         payRate=r;
//     }
//     public double getSalary(){
//         double result=hw*payRate;
//         return result;
//     }
// }
// class Main2 {
//     public static void main(String[] args) {
//         Worker w= new Worker();
//         w.setData(10, 100);
//         System.out.println("Salary is: "+w.getSalary());
//     }    
// }















// // Passing value to array reference
// class myArr{
//     public void dob(int[] brr){
//     for(int i=0;i<brr.length;i++){
//         brr[i]=brr[i]*2;
//     }
//     }
// }
// class Main2{
//     public static void main(String[] args) {
//         int[] arr= {10,20,30,40};
//         myArr a=new myArr();
//         for(int x:arr){
//             System.out.println(x);
//         }
//         System.out.println("After");
//         a.dob(arr);
//         for(int x:arr){
//             System.out.println(x);
//         }
//     }
// }


// // Example no.2
// class myArr{
//     public int cal(int[] brr){
//         int x=0;
//         for(int i=0;i<brr.length;i++){
//             x+=brr[i];
//         }
//         return x;
//     }
// }
// class Main2{
//     public static void main(String[] args) {
//         myArr m=new myArr();
//         int[] arr={1,2,3,4};
//         int result=m.cal(arr);
//         System.out.println(result);
//     }
// }



// Example no.2
// class myArr{
//     public double[] dub(int[] brr){
//         double[] res=new double[2];
//         int sum=0;
//         for(int x:brr){
//             sum+=x;
//         }
//         res[0]=sum;
//         res[1]=sum/brr.length;

//         return res;
//     }
// }
// class Main2{
//     public static void main(String[] args) {
//         int[] arr={2,3,2,3};
//         myArr m=new myArr();
//         double[] result=m.dub(arr);
//         System.out.println(result[0]);
//         System.out.println(result[1]);

//     }
// }



// Example no.3
// class Counter{
//     public int[] Count(int[]brr,int x){
//         int[] res=new int[3];
//         int eq=0;
//         int gt=0;
//         int st=0;
//         for(int i=0;i<brr.length;i++){
//             if(brr[i]==x){
//                 eq++;
//             }
//             if(brr[i]>x){
//                 gt++;
//             }
//             if(brr[i]<x){
//                 st++;
//             }
//         }
//         res[0]=eq;
//         res[1]=gt;
//         res[2]=st;

//         return res;
//     }
// }
// class Main2{
//     public static void main(String[] args) {
//         Counter c1=new Counter();
//         int[] arr={2,3,4,3};
//         int x=2;
//         int[] ans=c1.Count(arr, x);
//         System.out.println("Equal numbers: "+ans[0]);
//         System.out.println("Greater numbers: "+ans[1]);
//         System.out.println("Smaller numbers: "+ans[2]);
//     }
// }













// Swap object
// class myClass{
//     private int x,y;
//     public void setNum(int a,int b){
//         x=a;
//         y=b;
//     }
//     public void swap(myClass e1){
//         int temp;
//         temp=e1.x;
//         e1.x=e1.y;
//         e1.y=temp;
//     }
//     public void display(){
//         System.out.println(x+" "+y);
//     }
// }

// class Main2{
//     public static void main(String[] args) {
//         myClass c1=new myClass();
//         c1.setNum(2, 3);
//         myClass c2=new myClass();
//         c2.setNum(4,5);
//         c1.display();
//         c2.display();
//         System.out.println("After object is swapped");
//         myClass temp=new myClass();
//         temp.swap(c1);
//         temp.swap(c2);
//         c1.display();
//         c2.display();
//     }
// }




// Array

// import java.util.Arrays;

// class myArr{
//     public static void main(String[] args) {
//         int[] arr={2,7,3,4,1};
//         int[] brr={2,7,3,4,1};

//         // Arrays.sort(arr);
//         // System.out.println(Arrays.toString(arr));
//         System.out.println(Arrays.equals(arr, brr));
//     }
// }

















// Static variable and call garbage collector to forcefully remove object from memory
// class myEmp{
//     private int id;
//     private int age;
//     private String name;
//     static private int nextId=1;
//     public myEmp(int a,String s){
//         age=a;
//         name=s;
//         id=nextId++;
//     }
//     public void show(){
//         System.out.println("Employee Id: "+id);
//         System.out.println("Employee age: "+age);
//         System.out.println("Employee name: "+name);
//     }
//     public void nextIds(){
//         System.out.println("Next Emp id: "+nextId);
//     }
//     protected void finalize(){
//         nextId--;
//     }
// }
// class Main2{
//     public static void main(String[] args) {
//         myEmp e1=new myEmp(23, "Ravi");
//         myEmp e2=new myEmp(25, "Rajesh");
//         myEmp e3=new myEmp(21, "Radha");
//         e1.show();
//         e2.show();
//         e3.show();
//         e1.nextIds();
//         e2.nextIds();
//         System.out.println("------------------Intern-----------------");
//         {
//             myEmp x1=new myEmp(19, "Invi");
//             myEmp x2=new myEmp(18, "Nami");
//             x1.show();
//             x2.show();
//             x1.nextIds();
//             x1=x2=null;
//             System.gc();
//             System.runFinalization();
//         }
//         System.out.println("------------------END-----------------");
//         e1.nextIds();
//          myEmp e6=new myEmp(20, "Roni");
//          e6.show();
//         e1.nextIds();
//     }
// }





// Example no.2
// class Emp{
//     Emp(){
//         System.out.println("This is default constructor");
//     }
//     {
//         System.out.println("This is Ananomyous block");
//     }
//      static{
//         System.out.println("This is static block of code");
//     }
//      static int x=10;
// }
// class Main2 {
//     public static void main(String[] args) {
//         System.out.println("Main2 class is running.");
//         Emp e=new Emp();
//         System.out.println(Emp.x);
//     }
// }











// there is no copy Constructor we have to create one
// class Box{
//     private int l;
//     private int b;
//     private int h;
//     public Box(){
//         l=b=h=0;
//     }
//     public Box(int x,int y,int z){
//         l=x;
//         b=y;
//         h=z;
//     }
//     public Box(Box bi){
//         l=bi.l;
//         b=bi.b;
//         h=bi.h;
//     }
//     public void show(){
//         System.out.println("l= "+l+" b= "+b+" h= "+h);
//     }
// }
// class Main2{
//     public static void main(String[] args) {
//         Box b1=new Box();
//         Box b2=new Box(4,3,5);
//         Box b3=new Box(b2);
//         b1.show();
//         b2.show();
//         b3.show();
//     }
// }














// Inheritance using super keyword in method and constructor
// class Circle{
//     private int radius;
//     public Circle(int radius){
//         this.radius=radius;
//     }
//     public int getRadius(){
//         return radius;
//     }
//     public double getArea(){
//         return Math.PI * Math.pow(radius, 2);
//     }
// }
// class Cilender extends Circle{
//     private int h;
//     public Cilender(int radius,int h){
//         super(radius);
//         this.h=h;
//         System.out.println("Circle Area: "+super.getArea());
//     }
//     public double getArea(){
//         return 2 * super.getArea() + 2 * Math.PI * getRadius() * h;
//     }
//     public double getValume(){
//         return super.getArea() * h;
//     }
// }
// class Main2{
//     public static void main(String[] args) {
//         Cilender obj=new Cilender(10, 20);
//         System.out.println("Circle Radius: "+obj.getRadius());
//         System.out.println("Cylender Area: "+obj.getArea());
//         System.out.println("Cylender Volume: "+obj.getValume());
//     }
// }


// Example no.2
// class Box{
//     private int l;
//     private int b;
//     private int h;
//     public Box(){
//         l=b=h=0;
//     }
//     public Box(int x,int y,int z){
//         l=x;
//         b=y;
//         h=z;
//     }
//     public Box(Box bi){
//         l=bi.l;
//         b=bi.b;
//         h=bi.h;
//     }
//     public void show(){
//         System.out.println("l= "+l+" b= "+b+" h= "+h);
//     }
// }
// class BoxWeigth extends Box{
//     private int w;
//     public BoxWeigth(){
//         w=0;
//     }
//     public BoxWeigth(int l,int b,int h, int w){
//         super(l,b,h);
//         this.w=w;
//     }
//     public BoxWeigth(BoxWeigth bi){
//         super(bi);
//         this.w=bi.w;
//     }
//     public void show(){
//         System.out.println("w= "+w);
//         super.show();
//     }
// }
// class Main2{
//     public static void main(String[] args) {
//         BoxWeigth b1=new BoxWeigth();
//         BoxWeigth b2=new BoxWeigth(2,3,1,4);
//         BoxWeigth b3=new BoxWeigth(b2);
//         b1.show();
//         b2.show();
//         b3.show();
//     }
// }

























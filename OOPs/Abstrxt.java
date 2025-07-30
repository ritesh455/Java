// abstract class Animal{
//     public abstract void eat();
//     public void fly(){

//     }
//     public void run(){
        
//     }
// }

// class Bird extends Animal{
//     public void eat(){
//         System.out.println("bird");
//     }
// }

// class car extends Animal{
//     public void eat(){
//         System.out.println("car");
//     }
// }

// class Abstrxt {
//     public static void main(String[] args) {
//         Animal b=new Bird();
//         b.eat();
//         b=new car();
//         b.eat();
//     }
// }


















// // Example no.1
// abstract class Shape{
//     int l;
//     int h;
//     public Shape(int l, int h){
//         this.l=l;
//         this.h=h;
//     }
//     abstract public String getName();
//     abstract public double getArea();
// }
// class Rectangle extends Shape{
//     public Rectangle(int l,int h){
//         super(l, h);
//     }
//     public String getName(){
//         return "Rectangle";
//     }
//      public double getArea(){
//        double area=l*h;
//        return area;
//     }
// }
// class triangle extends Shape{
//     public triangle(int l,int h){
//         super(l, h);
//     }
//     public String getName(){
//         return "triangle";
//     }
//      public double getArea(){
//        double area=0.5*l*h;
//        return area;
//     }
// }
// class Abstrxt{
//     public static void main(String[] args) {
//         Shape ab=new Rectangle(2, 1);
//         System.out.println(ab.getName());
//         System.out.println(ab.getArea());
//         ab=new triangle(3, 1);
//         System.out.println(ab.getName());
//         System.out.println(ab.getArea());

//     }
// }


























// Example no. 2
class Shape{
    private int dim1;
    private int dim2;
    public Shape(int dim1, int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    public int getDim1(){
        return dim1;
    }
    public int getDim2(){
        return dim2;
    }
    public String getName(){
        return "x";
    }
    public double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shape{
    public Rectangle(int l,int h){
        super(l, h);
    }
    public String getName(){
        return "Rectangle";
    }
     public double getArea(){
       double area=getDim1()*getDim2();
       return area;
    }
}
class triangle extends Shape{
    public triangle(int l,int h){
        super(l, h);
    }
    public String getName(){
        return "triangle";
    }
     public double getArea(){
       double area=0.5*getDim1()*getDim2();
       return area;
    }
}
class Abstrxt{
    public static void main(String[] args) {
        Shape ab;
        ab=new Rectangle(2, 1);
        System.out.println(ab.getName());
        System.out.println(ab.getArea());
        ab=new triangle(3, 1);
        System.out.println(ab.getName());
        System.out.println(ab.getArea());
    }
}
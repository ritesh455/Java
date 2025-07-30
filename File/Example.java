// import java.io.DataInputStream;
// import java.io.DataOutputStream;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.util.Scanner;

// class Example {
//     public static void main(String[] args) {
//        DataOutputStream dot;
//        DataInputStream din;
//        try{
//         dot=new DataOutputStream(new FileOutputStream("E:\\Stupid\\File\\ex1.txt"));
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enetr name and phone no.");
//         String s=sc.nextLine();
//         int n=sc.nextInt();
//         dot.writeUTF(s);
//         dot.writeInt(n);

//         din=new DataInputStream(new FileInputStream("E:\\Stupid\\File\\ex1.txt"));
//         System.out.println(din.readUTF());
//         System.out.println(din.readInt());
//        }
//         catch(IOException e1){
//             System.out.println(e1.getMessage());
//         }
//     }
// }

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Emp implements Serializable{
    private int empid;
    private String ename;
    private String dname;
    private double sal;

    public void get(){
        Scanner sc=new Scanner(System.in);
        empid=sc.nextInt();
        ename=sc.next();
        dname=sc.next();
        sal=sc.nextDouble();
    }
    public void show(){
        System.out.println("Empid: "+empid);
        System.out.println("Ename: "+ename);
        System.out.println("Dname: "+dname);
        System.out.println("Salary: "+sal);
    }
}
class Example{
    public static void main(String[] args) {
        try{
            Emp e=new Emp();
            e.get();

            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.txt"));
            oos.writeObject(e);
            oos.close();

            ObjectInputStream ooi=new ObjectInputStream(new FileInputStream("abc.txt"));
            Emp f=(Emp)ooi.readObject();
            ooi.close();

            f.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}






import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class MyEmp implements Serializable{
    private int empid;
    private String name;
    private double sal;

    public void get(){
        Scanner sc=new Scanner(System.in);
        empid=sc.nextInt();
        name=sc.next();
        sal=sc.nextDouble();
    }
    public void show(){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(sal);
    }
}

class Serial {
    public static void main(String[] args) {
        try{
            MyEmp e=new MyEmp();
            e.get();
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\Stupid\\File\\ex2.docx"));
            oos.writeObject(e);     //Serialization Done here
            oos.close();

            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\Stupid\\File\\ex2.docx"));
            MyEmp f=(MyEmp)ois.readObject();    //De-serialization Done here
            f.show();
            ois.close();
        }
        catch(Exception e){
            System.out.println("Exception is: "+e.getMessage());
        }
    }
}

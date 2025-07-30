// Example of DataInputStream and DataOutputStream

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class dataOutIn {
    public static void main(String[] args) {
        DataInputStream din=null;
        DataOutputStream dout=null;
        try{
            dout=new DataOutputStream(new FileOutputStream("E:\\Stupid\\File\\abc.txt"));
            dout.writeDouble(Math.PI);

            dout.close();

            din=new DataInputStream(new FileInputStream("E:\\Stupid\\File\\abc.txt"));
            double x=din.readDouble();

            System.out.println("Data saved in file is: "+x);
            din.close();
        }
        catch(IOException e1){
            System.out.println("Exception: while writing or reading file");
        }
    }
}

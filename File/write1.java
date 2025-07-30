// java.lang.Object
//    ↳ java.io.Writer
//        ↳ java.io.OutputStreamWriter
//            ↳ java.io.FileWriter

// Example no.1 write using write()
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class write1 {
    public static void main(String[] args) {
        FileWriter fr=null;
        try{
            fr=new FileWriter("E:\\Stupid\\File\\ex1.txt");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name nad address number");
            String name=sc.nextLine();
            String address=sc.nextLine();

            fr.write(name);
            fr.write("\n");
            fr.write(address);
        }
        catch(FileNotFoundException e1){
            System.out.println(e1.getMessage());
        }
        catch(IOException e2){
            System.out.println(e2.getMessage());
        }
        finally{
            if(fr!=null){
                try{
                    fr.close();
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}







// // Example no.2

// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// class write1{
//     public static void main(String[] args) {
//         FileWriter fw=null;
//         try{
//             fw=new FileWriter("E:\\Stupid\\File\\abc.txt");
//             Scanner sc=new Scanner(System.in);
//             for(int i=0;i<2;i++){
//                 System.out.println("Enter name and phone number:");
//                 String name=sc.next();
//                 long number=sc.nextLong(); 
//                 fw.write(name);
//                 fw.write(" ");
//                 fw.write(String.valueOf(number));
//                 fw.write("\n");
//             }
//         }
//             catch(FileNotFoundException e1){
//                 System.out.println(e1.getMessage());
//             }
//             catch(IOException e2){
//                 System.out.println(e2.getMessage());
//             }
//             finally{
//                 if(fw!=null){
//                     try{
//                         fw.close();
//                         System.out.println("File saved successfully");
//                     }
//                     catch(IOException e){
//                         System.out.println("Exception while closing file");
//                     }
//                 }
//             }
//         }
//     }







// java.lang.Object
//   ↳ java.io.Writer
//        ↳ java.io.PrintWriter

// Example no.3 PrintWriter

// import java.io.IOException;
// import java.io.PrintWriter;
// class write1{
//     public static void main(String[] args) {
//         PrintWriter pw=null;
//         try{
//             pw = new PrintWriter("E:\\Stupid\\File\\ex2.txt");
//             pw.println(Math.PI);
//         }
//         catch(IOException e1){
//             System.out.println(e1.getMessage());
//         }
//         finally{
//             if(pw!=null){
//                 pw.close();
//                 System.out.println("File saved");
//             }      
//         }
//     }
// }





// 📂 Types of Streams in Java:
// Java provides two main types of streams:

// Byte Streams (used for binary data like images, PDF):
// Classes: FileInputStream, FileOutputStream

// Character Streams (used for text data):
// Classes: FileReader, FileWriter, BufferedReader, BufferedWriter


// Fig---------------------------------
// java.lang.Object
// │
// ├── java.io.File
// │
// ├── java.io.InputStream                 (abstract - byte input)
// │   ├── FileInputStream
// │   ├── ByteArrayInputStream
// │   ├── FilterInputStream
// │   │   ├── BufferedInputStream
// │   │   └── DataInputStream
// │   └── ObjectInputStream
// │
// ├── java.io.OutputStream                (abstract - byte output)
// │   ├── FileOutputStream
// │   ├── ByteArrayOutputStream
// │   ├── FilterOutputStream
// │   │   ├── BufferedOutputStream
// │   │   └── DataOutputStream
// │   └── ObjectOutputStream
// │
// ├── java.io.Reader                      (abstract - char input)
// │   ├── BufferedReader
// │   ├── InputStreamReader
// │   │   └── FileReader
// │   ├── StringReader
// │   └── CharArrayReader
// │
// └── java.io.Writer                      (abstract - char output)
//     ├── BufferedWriter
//     ├── OutputStreamWriter
//     │   └── FileWriter
//     ├── StringWriter
//     └── CharArrayWriter


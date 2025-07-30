// This is structure of classes while reading file
// java.lang.Object
//    └── java.io.Reader (abstract)
//          └── java.io.InputStreamReader
//                └── java.io.FileReader



import java.io.*;
class file3 {
    public static void main(String[] args) {
        Reader fr=null;                                                         //(Reader)It is a abstract class
        try{
            fr=new FileReader("E:/Stupid/File/abc.txt");                //(FileReader)It is child class of 'InputStreamReader' and 'InputStreamReader' is child class of 'Reader'
            int ch;
            int count=0;
            //the read() method reads data directly from hard disk or we can say where the file is stored 
            // so it take more time, their we have another method to class to read the file 'BufferedReader' we learn in next code
            while ((ch=fr.read())!=-1) {                                        //It will read the file unless the codition is false
                System.out.print((char)ch);                                     //It will print the readed characters, But here we have to type cast the 'int' 'ch' into 'char' to covert the byte code to character form
                ++count;
            }
            System.out.println("\nTotal character read: "+count);
        }
        catch(FileNotFoundException e1){                                        //It throw exception if file not found for read
            System.out.println("Can not open file: "+e1.getMessage());
        }
        catch(IOException e2){                                                  //It handles IO exceptions
            System.out.println("Error while reading the file: "+e2.getMessage());
        }
        finally{                                                                //This block run in any situation to close the files
            if(fr!=null){                                                       //If it is not null means file is exits and opneed for read then it returns true
                try{
                    fr.close();                                                 //And it close the opneed files
                }
                catch(IOException e){
                    System.out.println("Error while closing file");
                }
            }
        }
    }
}

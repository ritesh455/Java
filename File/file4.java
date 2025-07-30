import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

class file4 {
    public static void main(String[] args) {

        // Declares a Reader object (fr) for reading character streams.
        Reader fr=null;
        try{

            // Creates a FileReader for the file at the specified path.
            // If the file doesn't exist, this throws FileNotFoundException.
            fr=new FileReader("E:/Stupid/File/abc.txt");
            int count;

            // Creates a File object representing the file path.
            // Used to get the file size in the next step.
            File f=new File("E:\\Stupid\\File\\abc.txt");

            // Allocates a char array to hold the file content.
            // f.length() returns the file size in bytes, and it is cast to int because length() returns a long.
            char [] arr=new char[(int)f.length()];

            // Reads characters from the file into the char array arr.
            // Returns the number of characters successfully read, which is stored in count.
            // It reads up to arr.length characters
            count=fr.read(arr);

            // Converts the character array arr into a String.
            String s=new String(arr);
            System.out.println(s);
            System.out.println("Total count: "+count);
        }
        catch(FileNotFoundException e1){
            System.out.println("Exception: "+e1.getMessage());
        }
        catch(IOException e2){
            System.out.println("Exception: "+e2.getMessage());
        }
        finally{
            if(fr!=null){
                try{
                    fr.close();
                }
                catch(IOException e){
                    System.out.println("Exception: "+e.getMessage());
                }
            }
        }
    }
}

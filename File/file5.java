// read file using Buffered Reader
// Reader--|
//         |---->FileReader
//         |---->BufferedReader
//

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

class file5 {
    public static void main(String[] args) {
        Reader fr=null;
        try{

            // - Wraps the `FileReader` with a `BufferedReader`.
            // - `BufferedReader` allows **efficient reading of text**, especially for reading **lines** using `readLine()`.
            fr=new FileReader("E:\\Stupid\\File\\abc.txt");
            BufferedReader bf=new BufferedReader(fr);

            String str;
            int count=0;
            while ((str=bf.readLine()) != null) {
                System.out.println(str);
                count+=str.length();
            }
            System.out.println("Total character count: "+count);
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

import java.io.*;

class file1 {
    public static void main(String[] args)throws IOException {
        File myfile = new File("E:/Stupid/File/abc.txt");
        if (myfile.exists()) {                                                      //It returns true if path is valid/exists
            System.out.println(myfile.getName() + " is present");
            if (myfile.isFile()) {                                                  //It runs true when file is present
                System.out.println(myfile.getName() + " is a file");                //Get the name of the file
                System.out.println("Size of file is: " + myfile.length());          //Length of characters in file
                System.out.println("Last modification: "+myfile.lastModified());    //Last time modification of file
            } else {
                System.out.println("Not a file");
            }
            if (myfile.isHidden()) {                                                //It returns true if file is hidden
                System.out.println(myfile.getName() + " is hidden file");
            } else {
                System.out.println(myfile.getName() + " is not a hidden file");
            }
            if (myfile.canWrite()) {                                                //It returns true if file is writeable
                System.out.println(myfile.getName() + " is writable file");
            } else {
                System.out.println(myfile.getName() + " read only file");
            }
            if(myfile.delete()){                                                    //If the file is present then it is deleted
                System.out.println(myfile.getName()+" is deleted");
            }else{
                System.out.println(myfile.getName()+" is not deleted, cause there is some issue");
            }
            if(myfile.createNewFile()){                                             //It create a new File when the file is not present
                System.out.println(myfile.getName()+" is created");
            }else{
                System.out.println(myfile.getName()+" Not created");
            }
        } else {
            System.out.println("File not found");
        }
    }
}

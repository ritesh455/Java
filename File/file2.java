import java.io.File;

class file2 {
    public static void main(String[] args) {
        File myFile=new File("E:/Stupid/");
        String[] arr=myFile.list();                         //It can store the all file names which exists in given directory path
        System.out.println("length: "+arr.length);          //It return the length of array
        for(String s:arr){
            System.out.println(s);
        }
    }
}

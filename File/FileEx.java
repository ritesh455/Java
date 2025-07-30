// // Example 1 to read file using method int read()
// import java.io.Reader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// class FileEx {
//     public static void main(String[] args) {
//         Reader fr=null;
//         try{
//             fr=new FileReader("E:\\\\Stupid\\\\File\\\\abc.txt");
//             int count=0;
//             int ch;
//             while ((ch=fr.read())!=-1) {
//                 System.out.print((char)ch);
//                 ++count;
//             }
//             System.out.println("\nTotal number of character: "+count);
//         }
//         catch(FileNotFoundException e1){
//             System.out.println("Exception: File not found");
//         }
//         catch(IOException e2){
//             System.out.println("Exception: "+e2.getMessage());
//         }
//         finally{
//             if(fr!=null){
//                 try{
//                     fr.close();
//                 }
//                 catch(IOException e){
//                     System.out.println("Exception: while closing the file");
//                 }
//             }
//         }
//     }
// }




// // Example no.2 read file using method int read(char[])
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.Reader;
// import java.io.FileReader;
// import java.io.IOException;
// class FileEx{
//     public static void main(String[] args) {
//         Reader fr=null;
//         try{
//             fr=new FileReader("E:\\Stupid\\File\\abc.txt");
//             File f=new File("E:\\Stupid\\File\\abc.txt");
//             int count=0;
//             char[] arr=new char[(int)f.length()];
//             count=fr.read(arr);
//             String s=new String(arr);
//             System.out.println(s);
//             System.out.println("Total count: "+count);
//         }
//         catch(FileNotFoundException e1){
//             System.out.println("Exception: File not found");
//         }
//         catch(IOException e2){
//             System.out.println("Exception: "+e2.getMessage());
//         }
//         finally{
//             if(fr!=null){
//                 try{
//                     fr.close();
//                 }
//                 catch(IOException e){
//                     System.out.println("Exception: while closing the file");
//                 }
//             }
//         }
//     }
// }






// // int read(char[],off,end)

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.Reader;

// class FileEx{
//     public static void main(String[] args) {
//         Reader fr=null;
//         try{
//             fr=new FileReader("E:\\Stupid\\File\\abc.txt");
//             File f=new File("E:\\Stupid\\File\\abc.txt");
//             int count;
//             char[] arr=new char[(int)f.length()];
//             count=fr.read(arr,20,3);
//             String s=new String(arr);
//             System.out.println(s);
//             System.out.println("Total count: "+count);
//         }
//         catch(FileNotFoundException e1){
//             System.out.println(e1.getMessage());
//         }
//         catch(IOException e2){
//             System.out.println(e2.getMessage());
//         }
//         catch(IndexOutOfBoundsException e3){
//             System.out.println("Exception: "+e3.getMessage());
//         }
//         finally{
//             if(fr!=null){
//                 try{
//                     fr.close();
//                 }
//                 catch(IOException e){
//                     System.out.println(e.getMessage());
//                 }
//             }
//         }
//     }
// }








// // Using Buffered reader
// import java.io.Reader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// class FileEx{
//     public static void main(String[] args) {
//         Reader fr=null;
//         try{
//             fr=new FileReader("E:\\Stupid\\File\\abc.txt");
//             BufferedReader bf=new BufferedReader(fr);
//             String str;
//             int count=0;
//             while ((str=bf.readLine())!=null) {
//                 System.out.println(str);
//                 count=count+str.length();
//             }
//             System.out.println("Total count: "+count);
//         }
//         catch(FileNotFoundException e1){
//             System.out.println("Exception: File not found");
//         }
//         catch(IOException e2){
//             System.out.println("Exception: "+e2.getMessage());
//         }
//         finally{
//             if(fr!=null){
//                 try{
//                     fr.close();
//                 }
//                 catch(IOException e){
//                     System.out.println(e.getMessage());
//                 }
//             }
//         }
//     }
// }
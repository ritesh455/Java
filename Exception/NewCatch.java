import java.util.Scanner;

class NewCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<=0){
                CustomeEx ex=new CustomeEx("Please enter positive exception");
                throw ex;
            }
            int c=a/b;
            System.out.println("Div: "+c);
        }catch(ArithmeticException | CustomeEx e1){
            System.out.println("Exception: "+e1.getMessage());
        }
    }
}

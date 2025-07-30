import java.util.*;
class UseCustome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter two intergers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<=0){
                CustomeEx ex=new CustomeEx("Please Enter positive number");
                throw ex;
            }
            int c=a/b;
            System.out.println("Division: "+c);
        }catch(ArithmeticException e1){
            System.out.println("Exception: "+e1.getMessage());
        }
        catch(CustomeEx e2){
            System.out.println("Exception: "+e2.getMessage());
        }
    }
}

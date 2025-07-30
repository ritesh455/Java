class Main{
    int a,b;
    public int area(int a,int b){
        return a+b;
    }
    public int area(int a){
        return a*a;
    }
}
class Over {
    public static void main(String[] args) {
        Main m=new Main();
        System.out.println(m.area(2));
        System.out.println(m.area(2, 3));
    }
}

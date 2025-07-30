class Box{
    private int l,b,h;
    Box(){
        l=b=h=0;
    }
    Box(int x){
        l=x;
        b=x;
        h=x;
    }
    Box(int i, int j, int k){
        l=i;
        b=j;
        h=k;
    }
    public void show(){
        System.out.println(l+" "+b+" "+h);
    }

}

class Contructor {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(10);
        Box b3=new Box(2,4,2);
        b1.show();
        b2.show();
        b3.show();
    }
}

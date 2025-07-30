// It is called entity class
class College{
    int rollno;
    String name;
    char grade;
    float marks;
    // void getData(int rollno,String name, char grade){
    //     rollno=rollno;
    //     name=name;
    //     grade=grade;
    // }
}
// It is called Main class
class Main{
    public static void main(String[] args) {
        College c;
        c=new College();
        c.rollno=10;
        c.name="Jay";
        c.grade='A';
        c.marks=89.43f;
        System.out.println("Roll no. "+c.rollno);
        System.out.println("Name: "+c.name);
        System.out.println("Grade: "+c.grade);
        System.out.println("Marks: "+c.marks);
    }
}
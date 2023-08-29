public class Oops{
    public static void main(String args[]){

    s1.name = "Rohan Vasan";
    s1.roll = 123;
    s1.marks[0] = 100;
    s1.marks[1] = 70;
    s1.marks[2] =80;


    Student s2 = new Student(s1);

    System.out.println("Name = "+ s1.name);
    System.out.println("Roll No = "+ s1.roll);

    System.out.println(" S2 name = "+ s2.name);
    System.out.println(" S2 roll = "+s2.roll);

    s1.marks[2] = 30;

    for(int i=0; i<3; i++){
        System.out.println("marks " + i + " = "+ s2.marks[i]);
    }

    }
}





class Student{
    String name;
    int roll;
    int marks[]= new int[3];

    //Copy constructor:-
    Student(Student s1){
        marks = new int[3];
        this.marks = s1.marks;
        this.name = s1.name;
        this.roll = s1.roll;
    }


    Student(){
        marks = new int[3];
        System.out.println("Constructor is being called ");
    }

    Student(String name){
        this.name = name;
        marks = new int[3];
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
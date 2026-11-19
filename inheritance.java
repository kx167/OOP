/* 
---------------------------
INHERITANCE
---------------------------
*/
import java.util.Scanner;
public class inheritance {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        System.out.println("Enter RollNO");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course");
        String course = sc.nextLine();
        student s1 = new student(name,age,rollno,course);
        s1.displayPerson();
        s1.displaystudent();

        
    sc.close();


    }
}

/*
---------------------------
PUBLIC CLASS PERSON
---------------------------
 */

class person{
    String name;
    int age;

    public person(){
        
    }
   
    public person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void displayPerson(){
        System.out.println("person name is "+name);
    }
}

/*
---------------------------
PUBLIC CLASS STUDENT
---------------------------
 */

class student extends person{
     int rollNo;
     String course;

     public student(String name,int age,int rollNo,String course){
        super(name,age);
        this.rollNo = rollNo;
        this.course = course;
     }

     public void displaystudent(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollNo);
        System.out.println(course);
     }

}
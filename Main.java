package javaMain;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Teacher lizzy = new Teacher(1,"lizzy", 500);
        Teacher James = new Teacher(2,"James",1400);
        Teacher Elvis = new Teacher(3,"Elvis",20000);

        List<Teacher> teachersList = new ArrayList<>();

        teachersList.add(lizzy);
        teachersList.add(James);
        teachersList.add(Elvis);

                
        Student Samara = new Student(1 ,"Victor",4);
        Student Rashid = new Student(2 ,"Rashid",4);
        Student Brenda = new Student(3 ,"Brenda",5);
        
        List<Student> studentList = new ArrayList<>();
        
        studentList.add(Samara);
        studentList.add(Rashid);
        studentList.add(Brenda);



        School Egerton = new School(teachersList,studentList);
        System.out.println(Egerton.getTotalMOneyEarned());
        
        Samara.payFees(5000);
        System.out.println("Egerton has earned "+Egerton.getTotalMOneyEarned());
        Rashid.payFees(600);
        System.out.println("Egerton has earned "+Egerton.getTotalMOneyEarned());

        System.out.println("-----------------Making Egerton pay teachers their salary---------------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("Egerton has paid salary to " + lizzy.getName() + "and now has " + Egerton.getTotalMOneyEarned());
        System.out.println(Elvis);
    }
}
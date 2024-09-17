package javaMain;

import java.util.List;
/**
 * IMpliment teachers and students using an array slist 
 */
public class School{
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;
 
   /**
    * new school object is created 
    * @param teachers list of teachers in schoo;
    * @param students list of students in the chool
    */
   
   public School(List<Teacher> teachers,List<Student> students){
      this.teachers =teachers;
      this.students= students;
      totalMoneyEarned=0;
      totalMoneySpend=0;
   }

   public static void updateTotalMoneySpent(int moneySpent){
      totalMoneyEarned-=moneySpent;
   }

   public int getTotalMoneySpend(){
      return totalMoneySpend;
   }

   public static void updateTotalMoneyEarned(int MoneyEarned){
      totalMoneyEarned+=MoneyEarned;
   }

   public int getTotalMOneyEarned(){
      return totalMoneyEarned;
   }

   public void addTeachers(Teacher teacher){
      teachers.add(teacher);
   }

   public List<Teacher> getTeachers(){
      return teachers;
   }
   /**
    * add student to the school
   * @param student student to be added to the school
   */
   public void addStudents(Student student){
      students.add(student);
   } 
   public List<Student> getStudents(){
      return students;
   }

   /**
    * add teacher to school
    * @param teacher the teacher to be added
    */
}
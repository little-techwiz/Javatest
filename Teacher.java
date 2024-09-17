package javaMain;

/**
 * this class is responsible for giving student an id 
 */


public class Teacher {
    private int id;
    private String name ;
    private int salary;
    private int salaryEarned;


    //lets create a constructor 
    //
    public Teacher(int id,String name , int salary){
        this.name =name ;
        this.salary=salary;
        this.id=id;
        this.salaryEarned=0;
    }
    /**
     * retuen id of teacher
     */
    public int getId(){
        return id;
    }

    /**
     * return salary of teacher
     */
    public int getSalary(){
        return salary;
    }
    /**
     * return name of teacher 
     */
        public String getName(){
            return this.name;
        }

    /**
     * update the salary
     * set the salary
     */

        public void setSalary(int salary){
            this.salary=salary;
        }
    /**
     * Adds to the salary 
     * removes from the total moneyearned from school
     * @param salary salary
     */
    public void receiveSalary(int salary){
    salaryEarned+=salary;
    School.updateTotalMoneySpent(salary);
    }

    //@overide
    public String toString(){
        return "Name of teacher " + name + "Total salary earned so far " + salaryEarned;
    }
}
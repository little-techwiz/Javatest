package javaMain;


/**
 * This  class is responsible for keeping track of student 
 */



public class Student {
    //Private is a access identifier 
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * Constructor 
     * create new student object by initializes student
     * id name of student that is unique 
     * fees for every student is 150 000 dollars per year
     */

    public Student (int id ,String name,int grade) {
    // lets validate the vakues do we want id to be repeated 
    this.feesPaid=0;
    this.feesTotal=30000;

    // my id from the class will be equal to my id in the method 
    this.id=id;
    this.name=name;
    this.grade=grade;
    }



    // we are not going to  alter sudent name  then setNmae method is not required so is id 
    //we are going to alter student grade and class 


    //setter should always be void and gettters should always be dealing with a particular data type 


    /**
     * param grade is the new grade of student 
     */

    //we are going to change fees paid but not fees total
    public  void setGrade(int grade){
        //we are updating the grade of student

        this.grade=grade;

    }


    public void updateFeesPaid(int fees){
        /**
         * keep adding fees to fees paid field
         * add the fees to fees paid
         * The school is going to receive the funds 
         */
        feesPaid+=fees;

    }

    public int getId(){
        return id;

    }

    public String  getName(){
        return name;
    }

    public int getGrade(){
        return grade;

    }

    public int getFeesPaid(){
        return feesPaid;

    }
    public int getTotalFees(){
        return feesTotal;
    }
    /**
     * pays the selected amount as fees to the school
     */
    public void payFees(int fees){
        //update fees paid 
        //get fees paid 
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
        //
    }

    /**
     * get remaining fees
     * subtract from totoal fees 
     * fees total -fees paid
     * @param return the remaining fees 
     */

    /*public int getRemainingFees(){

    }*/
}
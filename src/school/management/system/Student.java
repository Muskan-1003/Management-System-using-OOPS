package school.management.system;



//this class use to keep track of students
//fees name grade and fees paid
public class Student {
    private int id;
    private String name;
    private  int grade;
    private  int feesPaid;
    private int feesTotal;

    /**
     * to create a new student by initializing id name and grade
     *  i.e we are creating object and initializing its values
     *  Fees for every student will be $30,000
     *  Fees paid initially will be 0; as student hasn't enrolled yet;
     * @param id-->unique
     * @param name
     * @param grade
     */
    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;//as fees-total and fees-paid is not passed in argument
         this.id=id; // even if we don't write this it will be ok and there will be no ambiguity
         this.name=name;
         this.grade=grade;
    }
//we are never going to alter id and name
    /**
     * this is use to update the students grade
     * @param grade- new grade for student
     */
    public void setGrade(int grade){//setter function
        this.grade=grade;
    }

    /**
     * Keep adding the fees to FeesPaid field
     * add the fees to the fees paid
     * fees is first student paid 5000+10000+15000
     * till he paid 30000;
     * @param fees the fees that student pays
     */
    public void updateFeesPaid(int fees){
        feesPaid+=fees;
    }



}

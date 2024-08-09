package school.management.system;

/**
 * this class helps keeping details of teacher
 * name,id and salary
 */

public class Teachers {
    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new teacher object
     * @param id for the teacher
     * @param name for the teacher
     * @param salary for the teacher as it will differ as per experience and other factors
     */

    public Teachers(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    /**
     *Getters---> during getter function we don't need to
     *  add arguments but to set we need to have some argument
     * @return the id
     * we can also write this.id will works same
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */

    public int getSalary() {
        return salary;
    }


}

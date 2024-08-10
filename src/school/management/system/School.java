package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * As there will be multiple teachers as well as students therefore we will use list
 *
 */

public class School {
    private List<Teachers> teachers=new ArrayList<>();
    private List<Student> students=new ArrayList<>();
    private static int   totalMoneyEarned;
    private static int  totalMoneySpent;

    public School(List<Teachers> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;

    }

    /**
     *
     * @param teacher adds a teacher to the school
     */
    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @param student adding student in the list
     */
    public void setStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @param MoneyEarned total money earned by school
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @param MoneySpent money that is spent by the schol
     * which is only going to be the salary of the teachers
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned-=MoneySpent;
    }


    /**
     *
     * @return list of teachers in the school
     */
    public List<Teachers> getTeachers() {
        return teachers;
    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @return amount of money earned on school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     *
     * @return amount of money spent on school
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


}

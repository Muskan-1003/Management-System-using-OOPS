package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teachers lizzy = new Teachers(1,"Lizzy",500,0);
        Teachers mellisa = new Teachers(2,"Mellisa",700,0);
        Teachers vanderhorn = new Teachers(3,"Vanderhorn",600,0);

        List<Teachers> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith Vasudev",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);




        School ghs = new School(teacherList,studentList);

        Teachers megan = new Teachers(6,"Megan", 900,0);

        ghs.addTeacher(megan);


        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("----making School pay salary----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);





    }
}
package company;

import java.util.Scanner;

public abstract class Worker {

    Scanner scanner = new Scanner(System.in);
    String name;
    String surname;
    int age;
    boolean gender;

    int hoursWeek;

    int contr;

    int dayL4=0;
    double salaryHour=0;

    Worker(String name, String surname,int age, boolean gender, int contr){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
        this.contr=contr;
    }

    public int getL4(){
        System.out.println("Enter the number of days off: ");
        dayL4=scanner.nextInt();
        return dayL4;
    };

    public double salary(){
        double salaryMonth=hoursWeek*salaryHour;
        return salaryMonth;
    };
    public double afterL4(){
        double salary=salary()-getL4()*hoursWeek*0.7;
        return salary;
    }
}

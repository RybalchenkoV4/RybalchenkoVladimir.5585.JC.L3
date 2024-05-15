import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.Year.now;

public class Employee {

    private String name;

    private String middleName;

    private String surName;

    private String phoneNumber;

    private String position;

    private int salary;

    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public int getAge() {
        int nowYear = now().getValue();
        return nowYear - yearOfBirth;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String middleName, String surName, String phoneNumber, String position, int salary, int yearOfBirth) {
        this.name = name;
        this.middleName = middleName;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
    }

    public void increaseSalary(int amount){
        this.salary += amount;
    }

    public static void increaser(Employee[] emp, int age, int increment){
        for (Employee employee : emp) {
            if (employee.getAge() > age) {
                employee.increaseSalary(increment);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("""
                        Employee{
                        name = '%s',
                        midName = '%s',
                        surName = '%s'\
                        ,
                        position = '%s',
                        phone = '%s'\
                        ,
                        salary = %d,
                        age = %d
                        }""",
                name, middleName, surName, position, phoneNumber, salary, getAge());
    }

    private static float averageSalary(Employee[] emp){
        float result = 0;
        for (Employee employee : emp) {
            result += employee.getSalary();
        }
        return result / emp.length;
    }

    private static float averageAge(Employee[] emp){
        float result = 0;
        for (Employee employee : emp) {
            result += employee.getAge();
        }
        return result / emp.length;
    }

    public static void comparator(String firstDate, String secondDate){

        LocalDate date0 = LocalDate.parse(firstDate);
        LocalDate date1 = LocalDate.parse(secondDate);

        long differenceInDays = ChronoUnit.DAYS.between(date0, date1);
        long differenceInMonths = ChronoUnit.MONTHS.between(date0, date1);
        long differenceInYears = ChronoUnit.YEARS.between(date0, date1);

        System.out.println("Разница в днях: " + differenceInDays);
        System.out.println("Разница в месяцах: " + differenceInMonths);
        System.out.println("Разница в годах: " + differenceInYears);
    }

}

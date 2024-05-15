public class Supervisor extends Employee{
    public Supervisor(String name, String middleName, String surName, String phoneNumber, String position, int salary, int yearOfBirth) {
        super(name, middleName, surName, phoneNumber, position, salary, yearOfBirth);
    }

    public static void increaser(Employee[] emp, int age, int increment){
        for (int i = 0; i < emp.length; i++) {
            if(emp[i].getAge() > age){
                if(!(emp[i] instanceof Supervisor)) {
                    emp[i].increaseSalary(increment);
                }
            }
        }
    }
}

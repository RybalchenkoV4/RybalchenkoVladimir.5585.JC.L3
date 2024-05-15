public class Program {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985);
        Employee andrey = new Employee("Andrey", "Viktorovich",
                "Bezrukov", "8(495)111-22-33",
                "fitter", 52000, 1973);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963);
        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990);
        Employee tatiana = new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983);

        Supervisor aristarh = new Supervisor("Arictarh", "Aristarhovich",
                "Bogatov", "8(495)332-53-44",
                "top manager", 500000, 1960);

        Employee[] company = {ivan, andrey, evgeniy, natalia, tatiana, aristarh};

        System.out.println("До повышения");

        for(Employee emp : company){
            System.out.println(emp.getName() + ' ' + emp.getSalary());
        }

        Supervisor.increaser(company, 35, 5000);

        System.out.println("После повышения");

        for(Employee emp : company){
            System.out.println(emp.getName() + ' ' + emp.getSalary());
        }
        String firstDate = "2022-11-05";
        String secondDate = "2023-01-01";
        
        Employee.comparator(firstDate, secondDate);
    }
}
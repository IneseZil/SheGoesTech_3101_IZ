package oop.membersTask;

public class JobClassCalling {
    public static void main(String[] args) {
        Employee employeeA = new Employee();
        employeeA.name = "Anna";
        employeeA.age = 31;
        employeeA.address = "Riga, Bikernieku 150";
        employeeA.phoneNumber = "29877535";
        employeeA.salary = 30293736;
        employeeA.specialisation = "Level God";
        employeeA.printSalary();

        Manager managerA = new Manager();
        managerA.name = "Renars";
        managerA.age = 45;
        managerA.address = "Riga, Uku 16";
        managerA.phoneNumber = "28373366";
        managerA.salary = 292828;
        managerA.department = "Useless";
        managerA.printSalary();

    }
}

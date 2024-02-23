public class Employee {
    //Required variables
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;

    //This constructor takes required variables.
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //This method calculates amount of tax according to employee's salary.
    public double taxAmount(double salary) {
        double tax = 0;
        if (salary > 1000) {
            return tax = salary * 0.03;
        } else {
            return tax;
        }

    }

    //This method calculates amount of bonus according to employee's working hours.
    public int bonusAmount(int workHours) {
        int bonus = 0;
        if (workHours > 40) {
            return bonus = (workHours - 40) * 30;
        } else {
            return bonus;
        }
    }

    //This method calculates raise of salary according to employee's hiring year and salary.
    public double raiseSalary(int hireYear, double salary) {
        int thisYear = 2021;
        double raise = 0;
        if (thisYear - hireYear < 10) {
            return raise = salary * 0.05;
        } else if (thisYear - hireYear <= 10 && thisYear - hireYear < 20) {
            return raise = salary * 0.10;
        } else {
            return raise = salary * 0.15;
        }
    }

    //This method prints employee's informations: name,salary,working hours, hire year, tax, bonus, salary raise,
    //salary with tax and bonus and total salary.
    public void information() {
        double tax = taxAmount(salary);
        int bonus = bonusAmount(workHours);
        double raise = raiseSalary(hireYear, salary);
        double salaryTaxBonus = salary - tax + bonus;
        double totalSalary = salaryTaxBonus + raise;
        System.out.println("Name: " + name +
                "\nSalary: " + salary +
                "\nWorking hours: " + workHours +
                "\nHire year: " + hireYear +
                "\nTax: " + tax +
                "\nBonus: " + bonus +
                "\nSalary raise: " + raise +
                "\nSalary with Tax and Bonus: " + salaryTaxBonus +
                "\nTotal Salary: " + totalSalary);
    }
}

package OOP;

public class Employee {
    String firstName;
    String lastName;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String firstName, String lastName, int salary, int workHours, int hireYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public int tax() {
        int tax1 = 0;
        if (this.salary > 1000) {
            tax1 = (this.salary * 3 / 100);
        }
        return tax1;
    }

    public int bonus() {
        if (this.workHours >= 40) {
            int sumhours = this.workHours - 40;
            return sumhours * 30;
        } else
            return 0;
    }

    public int raisSalary() {
        int operationTime = 2021-this.hireYear ;
        if (operationTime > 19) {
            return (this.salary * 15 / 100);
        } else if (operationTime > 9 && operationTime <= 19) {
            return (this.salary * 10 / 100);
        } else if (operationTime <= 9) {
            return (this.salary + 5 / 100);
        } else
            return 0;

    }

    public int vergiVeBonuslarlaMaas(){
        return this.salary-tax()+bonus();
    }

    public int sumMaas(){
        return vergiVeBonuslarlaMaas()+raisSalary();
    }

    public void toWorker(){
        System.out.println("adi : "+this.firstName);
        System.out.println("soy adi : "+this.lastName);
        System.out.println("maasi : "+this.salary);
        System.out.println("calisma saati : "+this.workHours);
        System.out.println("baslangic yili : "+this.hireYear);
        System.out.println("vergi : "+tax());
        System.out.println("bonus : "+bonus());
        System.out.println("maas artisi : "+raisSalary());
        System.out.println("vergi ve bonuslarla birlikte maas : "+vergiVeBonuslarlaMaas());
        System.out.println("toplam maas : "+sumMaas());

    }



}

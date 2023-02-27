public class Administrator extends Person implements isalary{

    protected double bounes;
    protected double tax;

    public Administrator(String name, int age, String department, double salary) {
        super(name, age, department, salary);
    }

    @Override
    public void print() {
        System.out.println("Administrator: "+ "\n" +"Name = " + name + "\n" +"Age = " + getAge() + "\n" + "Department = " + department + "\n" + "Salary = " + salary + "\n" + "Bounes = " + getBounes() + "\n" + "Tax = " + gettax() +"\n" + "Fullsalary = " + getFullSalary());
    }

    @Override
    public double getBounes() {
        

        if(salary > 100000){
            return bounes = salary * 0.6;
        }
        if(salary < 100000){
            return bounes = salary * 0.4;
        }
        return bounes;
    }

    @Override
    public double getFullSalary() {
        return (getsalary()  + getBounes()) - gettax();
    }
    
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public double gettax() {
        if(getsalary() > 10000){
            return tax = getsalary()  * 0.2;
        }
        if(getsalary()  < 10000){
            return tax = getsalary()  * 0.1;
        }
        return tax;
    }
}
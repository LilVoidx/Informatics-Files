public class Worker extends Person implements isalary {

    protected double bounes;
    protected double tax;

    public Worker(String name, int age, String department, double salary) {
        super(name, age, department, salary);
    }

    @Override
    public void print() {
        System.out.println("Worker: "+ "\n" +"Name = " + name + "\n" +"Age = " + getAge() + "\n" + "Department = " + department + "\n" + "Salary = " + salary + "\n" + "Bounes = " + getBounes() + "\n" + "Tax = " + gettax() +"\n" + "Fullsalary = " + getFullSalary());
    }

    @Override
    public double getBounes() {

        if(getsalary() > 10000){
            return bounes = getsalary()  * 0.3;
        }
        if(getsalary()  < 10000){
            return bounes = getsalary()  * 0.2;
        }
        return bounes;
    }

    @Override
    public double getFullSalary() {
        return (getsalary()  + getBounes()) -gettax();
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
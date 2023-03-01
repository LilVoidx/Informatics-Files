public class Engineer extends Person implements isalary{

    protected double bounes;
    protected double tax;

    public Engineer(String name, int age, String department, double salary) {
        super(name, age, department, salary);
    }

    @Override
    public void print() {
        System.out.println("Engineer: "+ "\n" +"Name = " + name + "\n" +"Age = " + getAge() + "\n" + "Department = " + department + "\n" + "Salary = " + salary + "\n" + "Bounes = " + getBounes() + "\n" + "Tax = " + gettax() +"\n" + "Fullsalary = " + getFullSalary());
    }

    @Override
    public double getBounes() {
        

        if(salary > 50000){
            return bounes = salary * 0.5;
        }
        if(salary < 50000){
            return bounes = salary * 0.3;
        }
        return bounes;
    }

    @Override
    public double getFullSalary() {
        return (getsalary()  + getBounes()) - gettax();
    }
    
    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
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

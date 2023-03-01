public abstract class Person implements Comparable {

    protected String name;
    protected String department;
    protected double salary;
    private int age;
 
    public Person() {
    }
 
    public Person(String name, int age, String department, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.department = department;           
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Person [name=" + name +", age=" + age + ", department=" + department + ", salary=" + salary + "]";
    }
    
    public abstract void  print();
    
    
    @Override
    public double compareTo(Person person){
        double firstsalary = getsalary();
        double secondsalary = person.getsalary();
        return Double.compare(firstsalary,secondsalary);
    }

}





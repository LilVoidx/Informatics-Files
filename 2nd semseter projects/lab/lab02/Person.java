package lab.lab02;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private boolean married;

    public Person() {
    }

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    @Override
    public String toString() {
        return  name + ", " + age + ", " + married;
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

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public int compareTo(Person o){
        return name.compareTo(((Person)o).name);
//        if(this.age == ((Person)o).age)
//            return 0;
//        if(this.age < ((Person)o).age)
//            return -1;
//        return 1;
    }

}





public class Main {
    public static void main(String[] args) {
        
        Worker worker = new Worker("Magdy", 24 ,"Cleaning", 18506);
        worker.print();
        System.out.println("===========================");

        Engineer engineer = new Engineer("Kareem", 30 ,"Electrical engineering", 506546);
        engineer.print();
        System.out.println("===========================");

        Administrator administrator = new Administrator("Youssef", 20 ,"CEO", 167506);
        administrator.print();
        System.out.println("===========================");

        Person[] people = {
            worker,
            administrator,
            engineer,
            new Worker("Mohab", 23 ,"Cleaning", 18506),
            new Worker("Guinevere", 60 ,"head of cleaning", 23455),
            new Engineer("Peter", 45 ,"Chemical engineering", 38506),
        };
        
        //===============================================================================================
        
        //1==============================================================================================
        System.out.println("1)");
        double avg = 0.0;
        for (int i = 0; i < people.length; i ++){
            avg += people [i].getsalary();
        }
        System.out.println("THE Average salary = "+ avg/6);
        System.out.println("==================================================");
        //===============================================================================================


        //2==============================================================================================
        System.out.println("2)");
        int oldest = 0;
        for (int i = 0; i < people.length; i ++){
            if (people[i].getAge() > people[oldest].getAge()){
                oldest = i;
            }
        }
        System.out.println("The oldest person :"+people[oldest].getName());
        System.out.println();
        System.out.println("==================================================");
        //===============================================================================================

    }

}

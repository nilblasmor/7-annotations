package annotations.level1.exercises1and2;


public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Worker olw1 = new OnlineWorker("Anna", "Hopkins", 15);
        Worker osw1 = new OnSiteWorker("Daniel", "Roberts", 15);

        //Override test (ex1)
        System.out.println(olw1.calculateSalary(160));
        System.out.println(osw1.calculateSalary(160));

        //Deprecated test (ex2)
        OnlineWorker.deprecatedMethod();


    }

}

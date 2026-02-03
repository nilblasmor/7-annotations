package annotations.level1.exercises1and2;

public class OnSiteWorker extends Worker {

    private static double gasCost = 20.0;

    public OnSiteWorker(String name, String surname, double hourlySalary) {
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(double hoursWorked) {
        return ((getHourlySalary() * hoursWorked) + gasCost);
    }

}

package annotations.level1.exercises1and2;

class OnlineWorker extends Worker {

    private double internetFlatRate = 5.0;

    public OnlineWorker(String name, String surname, double hourlySalary) {
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(double hoursWorked) {
        return ((getHourlySalary() * hoursWorked) + internetFlatRate);
    }

    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method.");
    }

}

package annotations.level1.exercises1and2;

class Worker {

    private String name;
    private String surname;
    private double hourlySalary;

    public Worker(String name, String surname, double hourlySalary) {
        this.name = name;
        this.surname = surname;
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public double calculateSalary(double hoursWorked) {
        return (hoursWorked * hourlySalary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hourlySalary=" + hourlySalary +
                '}';
    }

}

public class ComissionEmployee extends Employee implements IPayRollCalculator {
    private double salary;
    private double sales;
    
    public ComissionEmployee(int id, String nome, double salary, double sales){
    super(id, nome);
    this.salary = salary;
    this.sales = sales;
    }

    @Override
    public double calculatePayRoll() {
    return salary + 0.20 * sales;
    }
    @Override
    public String toString() {
    return super.toString() + ", Base Salary: " + salary + ", Sales: " + sales;
    }
}
import java.math.BigDecimal;

public class Work {
    private String position;
    private BigDecimal salary;
    private String Company;

    public Work() {
    }

    public Work(String position, BigDecimal salary, String company) {
        this.position = position;
        this.salary = salary;
        Company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    @Override
    public String toString() {
        return "Work{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", Company='" + Company + '\'' +
                '}';
    }
}

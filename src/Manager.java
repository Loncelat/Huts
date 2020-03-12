import java.util.*;
public class Manager implements Comparable<Manager> {
    int company;
    int bonus;
    int x = -1;
    int y = -1;

    public Manager(String company, int bonus) {
        this.company = company.hashCode();
        this.bonus = bonus;
    }

    @Override
    public int compareTo(Manager employee) {
        return company == employee.company ? Integer.compare(bonus, employee.bonus) : Integer.compare(company, employee.company);
    }
}

import java.util.*;
public class Manager {
    int company;
    int bonus;
    int x = -1;
    int y = -1;

    public Manager(String company, int bonus) {
        this.company = company.hashCode();
        this.bonus = bonus;
    }
}

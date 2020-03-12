public class Manager {
    int company;
    int bonus;

    public Manager(String company, int bonus) {
        this.company = company.hashCode();
        this.bonus = bonus;
    }
}

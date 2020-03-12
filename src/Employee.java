class Employee implements Comparable<Employee> {
    int company;
    int bonus;
    int[] skills;
    int x = -1;
    int y = -1;

    public Employee(String company, int bonus, String[] skillsstring) {
        this.company = company.hashCode();
        this.bonus = bonus;
        skills = new int[skillsstring.length];
        for (int i = 0; i < skills.length; i++) {
            skills[i] = skillsstring[i].hashCode();
        }
    }

    @Override
    public int compareTo(Employee employee) {
        return company == employee.company ? Integer.compare(bonus, employee.bonus) : Integer.compare(company, employee.company);
    }
}
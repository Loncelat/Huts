class Employee {
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
}
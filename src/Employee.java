class Employee {
    int company;
    int bonus;
    int[] skills;

    public Employee(String company, int bonus, String[] skillsstring) {
        this.company = company.hashCode();
        this.bonus = bonus;
        skills = new int[skillsstring.length];
        for (int i = 0; i < skills.length; i++) {
            skills[i] = skillsstring[i].hashCode();
        }
    }
}
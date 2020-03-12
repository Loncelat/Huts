class Developer implements Comparable<Developer> {
    String company;
    int bonus;
    int[] skills;
    int x = -1;
    int y = -1;

    public Developer(String company, int bonus, String[] skillsstring) {
        this.company = company;
        this.bonus = bonus;
        skills = new int[skillsstring.length];
        for (int i = 0; i < skills.length; i++) {
            skills[i] = skillsstring[i].hashCode();
        }
    }

    @Override
    public int compareTo(Developer employee) {
        return -Integer.compare(bonus, employee.bonus);
    }
}
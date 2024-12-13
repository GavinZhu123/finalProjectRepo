class Student {
    protected String name;
    protected int age;
    protected double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public boolean isSuitedForCollege() {
        return gpa >= 2.5;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}

class HighSchoolStudent extends Student {
    private boolean extracurricularActivities;

    public HighSchoolStudent(String name, int age, double gpa, boolean extracurricularActivities) {
        super(name, age, gpa);
        this.extracurricularActivities = extracurricularActivities;
    }

    @Override
    public boolean isSuitedForCollege() {
        return gpa >= 2.5 && extracurricularActivities;
    }
}

class InternationalStudent extends Student {
    private String englishProficiencyLevel;

    public InternationalStudent(String name, int age, double gpa, String englishProficiencyLevel) {
        super(name, age, gpa);
        this.englishProficiencyLevel = englishProficiencyLevel;
    }

    @Override
    public boolean isSuitedForCollege() {
        return gpa >= 2.5 && englishProficiencyLevel.equalsIgnoreCase("High");
    }
}

class TransferStudent extends Student {
    private int creditsCompleted;

    public TransferStudent(String name, int age, double gpa, int creditsCompleted) {
        super(name, age, gpa);
        this.creditsCompleted = creditsCompleted;
    }

    @Override
    public boolean isSuitedForCollege() {
        return gpa >= 2.5 && creditsCompleted >= 30;
    }
}

class AthleteStudent extends Student {
    private boolean meetsFitnessStandards;

    public AthleteStudent(String name, int age, double gpa, boolean meetsFitnessStandards) {
        super(name, age, gpa);
        this.meetsFitnessStandards = meetsFitnessStandards;
    }

    @Override
    public boolean isSuitedForCollege() {
        return gpa >= 2.0 && meetsFitnessStandards;
    }
}

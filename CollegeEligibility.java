import java.util.Scanner;

public class CollegeEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter student type (HighSchool, International, Transfer, Athlete): ");
            String studentType = scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();

            if (studentType.equalsIgnoreCase("HighSchool")) {
                System.out.print("Participates in extracurricular activities? (true/false): ");
                boolean activities = scanner.nextBoolean();
                scanner.nextLine();
                students.add(new HighSchoolStudent(name, age, gpa, activities));
            } else if (studentType.equalsIgnoreCase("International")) {
                System.out.print("Enter English proficiency level (High/Medium/Low): ");
                String proficiency = scanner.nextLine();
                students.add(new InternationalStudent(name, age, gpa, proficiency));
            } else if (studentType.equalsIgnoreCase("Transfer")) {
                System.out.print("Enter number of credits completed: ");
                int credits = scanner.nextInt();
                scanner.nextLine();
                students.add(new TransferStudent(name, age, gpa, credits));
            } else if (studentType.equalsIgnoreCase("Athlete")) {
                System.out.print("Meets fitness standards? (true/false): ");
                boolean fitness = scanner.nextBoolean();
                scanner.nextLine();
                students.add(new AthleteStudent(name, age, gpa, fitness));
            } else {
                System.out.println("Invalid student type.");
            }
        }

        System.out.println("\n--- Student Information and Eligibility ---");
        for (Student student : students) {
            student.displayInfo();
            if (student.isSuitedForCollege()) {
                System.out.println("The student is suited for college.\n");
            } else {
                System.out.println("The student is not suited for college.\n");
            }
        }

        scanner.close();
    }
}

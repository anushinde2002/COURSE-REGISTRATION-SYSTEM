
import java.util.*;

class Student {
    private String name;
    private List<String> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(String course) {
        courses.add(course);
    }

    public void displayRegisteredCourses() {
        System.out.println("Registered courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        Student student = new Student(studentName);

        while (true) {
            System.out.println("\n1. Register for a course");
            System.out.println("2. Display registered courses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter course name to register: ");
                    String courseName = scanner.nextLine();
                    student.registerCourse(courseName);
                    System.out.println("Course " + courseName + " registered successfully!");
                    break;
                case 2:
                    student.displayRegisteredCourses();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

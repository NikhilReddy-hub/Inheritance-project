public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "Grade 10");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("Mrs. Green", "Librarian");

        System.out.println("=== Student Details ===");
        student.displayDetails();

        System.out.println("\n=== Teacher Details ===");
        teacher.displayDetails();

        System.out.println("\n=== Staff Details ===");
        staff.displayDetails();

        // Example usage in AttendanceRecord
        AttendanceRecord.markAttendance(student.getId());
    }
}

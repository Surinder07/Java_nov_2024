package assignments.solution;

class University {
    private static String universityName;
    private static int totalStudents = 0;
    private static int totalProfessors = 0;

    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static void incrementStudentCount() {
        totalStudents++;
    }

    public static void incrementProfessorCount() {
        totalProfessors++;
    }

    public static void getStatistics() {
        System.out.println("--- University Statistics ---");
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Professors: " + totalProfessors);
    }
}

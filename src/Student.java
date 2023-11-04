public class Student extends Human {
    protected byte grade;
    protected static boolean summerVacation = true;
    protected static boolean coolBoy = false;
    protected static boolean isStudentHeteroSexual = false;

    Student() {
        super();
        setGrade((byte) 6);
    }

    Student(String name, String surname, byte grade,long egn) {
        super(name, surname,egn);
        setGrade(grade);
    }

    public void doNoHomeworkPunishment(){
        for (int i = 0; i < 40; i++) {
            System.out.println("I will not miss homework again!");
        }
    }

    public static double sumAverageGradeOfTwoGrades(double grade1, double grade2) {
        if (grade1 < 2 || grade2 < 2) {
            System.out.println("Grade can not be smaller tha 2.");
            return 0;
        } else {
            return (grade1 + grade2) / 2;
        }
    }

    public static boolean isSummerVacation() {
        return summerVacation;
    }

    public byte getGrade() {
        return grade;
    }

    public void setGrade(byte grade) {
        if (grade < 2) {
            System.out.println("Grade can not be smaller tha 2.");
        } else {
            this.grade = grade;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", EGN=" + EGN +
                '}';
    }
}

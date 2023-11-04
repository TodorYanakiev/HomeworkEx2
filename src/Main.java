public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human("Ivan", "Ivanov", 1234567890);
        Student s1 = new Student();
        Student s2 = new Student("Dimitar", "Dimitrov", (byte)5,1242626389);
        Worker w1 = new Worker();
        Worker w2 = new Worker("Petar", "Petrov", 200, (byte)8,1133567890);

        System.out.println("Number  of humans: " + Human.getNumberOfHumans());
        Human.printPartsOfTheHumanBody();
        System.out.println("The average grade is: " + Student.sumAverageGradeOfTwoGrades(5.4,3));
        System.out.println("Summer vacation:" + Student.isSummerVacation());
        System.out.println("Minimal wage:" + Worker.getMinimalWage());
        Worker.printMinimumPaidVacationDays();
    }
}
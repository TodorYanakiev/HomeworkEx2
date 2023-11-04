public class Worker extends Human {
    protected double dailyWage;
    protected byte workingHours;
    protected static int minimalWage = 900;

    Worker() {
        super();
        setDailyWage(80);
        setWorkingHours((byte) 8);
    }

    Worker(String name, String surname, double dailyWage, byte workingHours,long egn) {
        super(name, surname,egn);
        setDailyWage(dailyWage);
        setWorkingHours(workingHours);
    }

    public static int getMinimalWage() {
        return minimalWage;
    }

    public void setMinimalWage(int minimalWage) {
        if (minimalWage < 0){
            System.out.println("Minimal wage can not be negative!");
        }else{
            this.minimalWage = minimalWage;
        }
    }

    public static void printMinimumPaidVacationDays(){
        System.out.println("The minimum paid vacation days are 20.");
    }

    public void sumWagePerHour() {
        if (getDailyWage() / getWorkingHours() < getMinimalWage()) {
            System.out.println("Worker" + getName() + " is underpaid>");
        }
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        if (dailyWage < 0) {
            System.out.println("Daily wage can not be negative!");
        } else {
            this.dailyWage = dailyWage;
        }
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(byte workingHours) {
        if (workingHours < 0) {
            System.out.println("Working hours can not be negative!");
        } else {
            this.workingHours = workingHours;
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "dailyWage=" + dailyWage +
                ", workingHours=" + workingHours +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", EGN=" + EGN +
                '}';
    }
}

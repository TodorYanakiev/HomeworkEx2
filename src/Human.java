public class Human {
    protected String name;
    protected String surname;

    protected long EGN;
    protected static int numberOfHumans = 0;

    Human() {
        setName("Dimitar");
        setSurname("Dimitrov");
        setNumberOfHumans(getNumberOfHumans() + 1);
        setEGN(0000000000);
    }

    Human(String name, String surname, long egn) {
        setName(name);
        setSurname(surname);
        setNumberOfHumans(getNumberOfHumans() + 1);
        setEGN(egn);
    }

    public long getEGN() {
        return EGN;
    }

    public void setEGN(long EGN) {
        this.EGN = EGN;
    }

    public boolean verifyEGN(){
        String egn = Long.toString(getEGN());
        if (egn.length() != 10){
            return false;
        }
        return true;
    }

    public static void printPartsOfTheHumanBody(){
        System.out.println("A human body has 1 head, 1 torso, 2 arms and 2 legs.");
    }

    public static int getNumberOfHumans() {
        return numberOfHumans;
    }

    protected void setNumberOfHumans(int numberOfHumans) {
        this.numberOfHumans = numberOfHumans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", EGN=" + EGN +
                '}';
    }
}

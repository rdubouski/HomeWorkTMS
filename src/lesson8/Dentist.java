package lesson8;

public class Dentist implements Doctor{

    private final String dentistName;

    public Dentist(String name) {
        this.dentistName = name;
    }

    @Override
    public String cure(String patient) {
        return dentistName + " tears teeth " + patient;
    }
}

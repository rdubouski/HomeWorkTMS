package lesson8;

public class Surgeon implements Doctor{

    private final String surgeonName;

    public Surgeon(String doctorName) {
        this.surgeonName = doctorName;
    }

    @Override
    public String cure(String patient) {
        return surgeonName + " cut " + patient;
    }
}

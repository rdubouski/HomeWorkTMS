package lesson8;

public class Therapist implements Doctor{

    private final String therapistName;

    public Therapist(String therapistName) {
        this.therapistName = therapistName;
    }

    @Override
    public String cure(String patient) {
        return therapistName + " treating a " + patient;
    }

    public void setDoctor(Patient patient) {
        switch (patient.getTreatmentPlan()) {
            case 1: {
                Doctor doctor = new Surgeon("Surgeon");
                patient.setDoctor(doctor);
                System.out.println(doctor.cure(patient.getName()));
                break;
            }
            case 2: {
                Doctor doctor = new Dentist("Dentist");
                patient.setDoctor(doctor);
                System.out.println(doctor.cure(patient.getName()));
                break;
            }
            default: {
                Doctor doctor = new Therapist("Therapist");
                patient.setDoctor(doctor);
                System.out.println(doctor.cure(patient.getName()));
                break;
            }
        }
    }
}

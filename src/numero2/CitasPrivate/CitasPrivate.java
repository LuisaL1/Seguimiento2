package numero2.CitasPrivate;
class CitasPrivate{
    // Attributes
    private int appointmentCode;
    private String date;
    private String time;
    private String office;
    private String doctorName;
    private String patientName;
    private String medicalCenter;

    public static void main(String[] args) {
        CitasPrivate citaNueva = createAppointment(1,"1/1/22","2:00pm","104","Julian","monica","Alcázares");
        citaNueva.viewAppointmentDetails();
    }

    // Constructor
    private CitasPrivate(int appointmentCode, String date, String time, String office, String doctorName, String patientName, String medicalCenter) {
        this.appointmentCode = appointmentCode;
        this.date = date;
        this.time = time;
        this.office = office;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.medicalCenter = medicalCenter;
    }

    // Public methods

    private static CitasPrivate createAppointment(int appointmentCode, String date, String time, String office, String doctorName, String patientName, String medicalCenter) {
        CitasPrivate citasPrivate = new CitasPrivate(appointmentCode, date, time, office, doctorName, patientName, medicalCenter);
        return citasPrivate;
    }

    private void viewAppointmentDetails() {
        System.out.println("Appointment details:");
        System.out.println("Appointment Code: " + appointmentCode);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Office: " + office);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Patient: " + patientName);
        System.out.println("Medical Center: " + medicalCenter);
    }
    private void changeTime(String newTime) {
        this.time = newTime;
        System.out.println("Appointment time has been changed successfully.");
    }
}


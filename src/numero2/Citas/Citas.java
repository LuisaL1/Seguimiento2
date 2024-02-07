package numero2.Citas;

public class Citas {
    public int appointmentCode;
    public String date;
    public String time;
    public String office;
    public String doctorName;
    public String patientName;
    public String medicalCenter;

    public Citas(int appointmentCode, String date, String time, String office, String doctorName, String patientName, String medicalCenter){
        this.appointmentCode = appointmentCode;
        this.date = date;
        this.time = time;
        this.office = office;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.medicalCenter = medicalCenter;
    }

    public void viewAppointmentDetails() {
        System.out.println("Appointment details:");
        System.out.println("Appointment Code: " + appointmentCode);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Office: " + office);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Patient: " + patientName);
        System.out.println("Medical Center: " + medicalCenter);
    }
    public void changeTime(String newTime) {
        this.time = newTime;
        System.out.println("Appointment time has been changed successfully.");
    }
}

package numero2.Citas;

public class Main {
    public static void main(String[] args) {
        Citas newAppointment = createAppointment(1,"1/1/22","2:00pm","104","Julian","monica","Alcázares");
        newAppointment.viewAppointmentDetails();
        newAppointment.changeTime("5:00pm");
        newAppointment.viewAppointmentDetails();

    }

    public static Citas createAppointment(int appointmentCode, String date, String time, String office, String doctorName, String patientName, String medicalCenter){
        Citas cita = new Citas(appointmentCode, date, time, office, doctorName, patientName, medicalCenter);
        return cita;
    }
}

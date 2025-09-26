package Unidad_05;
public class MainEj9 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Mario Rossi", "OSDE");
        Profesional profesional = new Profesional("Dra. Pérez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-01", "10:30", paciente, profesional);

        System.out.println("Cita para: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
    }
}

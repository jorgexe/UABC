package tarea8.PersonalSalud;

public class PruebaPersonalDeSalud {
    public static void main(String[] args) {
        // Crear objetos de cada clase concreta
        MédicoCirujano cirujano = new MédicoCirujano("Dr. Smith", 45, "Cirugía General", "Hospital ABC");
        MédicoPediatra pediatra = new MédicoPediatra("Dra. Johnson", 38, "Pediatría", "Hospital XYZ");
        MédicoCardiólogo cardiólogo = new MédicoCardiólogo("Dr. Brown", 50, "Cardiología", "Hospital XYZ");
        MédicoPsiquiatra psiquiatra = new MédicoPsiquiatra("Dra. Davis", 42, "Psiquiatría", "Hospital ABC");
        MédicoOftalmólogo oftalmólogo = new MédicoOftalmólogo("Dr. Wilson", 48, "Oftalmología", "Hospital DEF");

        EnfermeraPediatra enfermeraPediatra = new EnfermeraPediatra("Enfermera Mary", 32, "Pediatría", "Hospital XYZ");
        EnfermeraQuirúrgica enfermeraQuirúrgica = new EnfermeraQuirúrgica("Enfermera Jane", 35, "Cirugía", "Hospital ABC");
        EnfermeraGerontológica enfermeraGerontológica = new EnfermeraGerontológica("Enfermera Susan", 40, "Gerontología", "Hospital DEF");

        // Mostrar información del personal de salud
        System.out.println("Información del Médico Cirujano:");
        System.out.println(cirujano.toString());

        System.out.println("\nInformación del Médico Pediatra:");
        System.out.println(pediatra.toString());

        System.out.println("\nInformación del Médico Cardiólogo:");
        System.out.println(cardiólogo.toString());

        System.out.println("\nInformación del Médico Psiquiatra:");
        System.out.println(psiquiatra.toString());

        System.out.println("\nInformación del Médico Oftalmólogo:");
        System.out.println(oftalmólogo.toString());

        System.out.println("\nInformación de la Enfermera Pediatra:");
        System.out.println(enfermeraPediatra.toString());

        System.out.println("\nInformación de la Enfermera Quirúrgica:");
        System.out.println(enfermeraQuirúrgica.toString());

        System.out.println("\nInformación de la Enfermera Gerontológica:");
        System.out.println(enfermeraGerontológica.toString());
    }
}

// Clase para demostrar la creación de instancias de Persona
public class ObjetosDePersona {
    public static void main(String[] args) {
        // Creación de instancias de diferentes tipos de Persona
        Estudiante estudiante = new Estudiante("Mateo", 19, "Masculino", "EST001");
        Docente docente = new Docente("María", 35, "Femenino", "DOC001");
        Administrativo admin = new Administrativo("Pedro", 25, "Masculino", "ADM001");

        // Accediendo a métodos específicos de cada instancia
        estudiante.imprimirInformacion();
        estudiante.realizarTarea();
        estudiante.asistir();

        docente.imprimirInformacion();
        docente.realizarTarea();
        docente.asistir();

        admin.imprimirInformacion();
        admin.realizarTarea();
        admin.asistir();
    }
}

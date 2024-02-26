// Definición de la clase Persona
class Persona {
    // Propiedades
    String nombre;
    int edad;
    String genero;
    String ocupacion;
    String id;

    // Constructor
    public Persona(String nombre, int edad, String genero, String ocupacion, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.id = id;
    }

    // Método 1: Imprimir información básica de la persona
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("ID: " + id);
    }

    // Método 2: Método específico de la clase Persona
    public void realizarTarea() {
        System.out.println(nombre + " está realizando una tarea genérica.");
    }

    // Método 3: Método polimórfico, implementado de manera diferente en clases hijas
    public void asistir() {
        System.out.println(nombre + " está asistiendo a sus responsabilidades.");
    }
}

// Definición de la clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    // Constructor
    public Estudiante(String nombre, int edad, String genero, String id) {
        super(nombre, edad, genero, "Estudiante", id);
    }

    // Método polimórfico
    @Override
    public void asistir() {
        System.out.println(nombre + " está asistiendo a sus clases como estudiante.");
    }
}

// Definición de la clase Docente que hereda de Persona
class Docente extends Persona {
    // Constructor
    public Docente(String nombre, int edad, String genero, String id) {
        super(nombre, edad, genero, "Docente", id);
    }

    // Método polimórfico
    @Override
    public void asistir() {
        System.out.println(nombre + " está dictando clase como docente.");
    }
}

// Definición de la clase Administrativo que hereda de Persona
class Administrativo extends Persona {
    // Constructor
    public Administrativo(String nombre, int edad, String genero, String id) {
        super(nombre, edad, genero, "Administrativo", id);
    }

    // Método polimórfico
    @Override
    public void asistir() {
        System.out.println(nombre + " está asistiendo a su turno como personal administrativo.");
    }
}


















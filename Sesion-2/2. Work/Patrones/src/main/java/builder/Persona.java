package builder;

public class Persona {
    private String nombre, apellidoPaterno, apellidoMaterno;
    private int edad;
    private String direccion;
    private String estadoCivil;
    private String genero;

    // Demasiadas llamadas a constructores, demasiada redundancia, este codigo es poco mantenible
/*    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String estadoCivil) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.estadoCivil = estadoCivil;
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String estadoCivil, int edad) {
        // Se manda a llamar con sobrecarga usando this
        this(nombre, apellidoPaterno, apellidoMaterno, estadoCivil);
        this.edad = edad;
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String calle, String codigoPostal, String municipio, String estado, String estadoCivil) {
        // Se manda a llamar con sobrecarga usando this
        this(nombre, apellidoPaterno, apellidoMaterno, estadoCivil, edad);
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.estado = estado;
    }*/

    public Persona (PersonaBuilder builder){
        this.nombre = builder.getNombre();
        this.apellidoPaterno = builder.getApellidoPaterno();
        this.apellidoMaterno = builder.getApellidoMaterno();
        this.edad = builder.getEdad();
        this.direccion = builder.getDireccion();
        this.estadoCivil = builder.getEstadoCivil();
        this.genero = builder.getGenero();
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Paterno: " + apellidoPaterno + ", Materno: " + apellidoMaterno + " Edad: "
                + edad + ", Direccion: " + direccion + ", Estado Civil: " + estadoCivil + ", Genero: " + genero;
    }
}

package sobrecarga.constructores;


public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    private Persona() { // Constructor vacío privado
        // super (); se manda a llamar de manera automática de la clase padre (object)
        this.idPersona = ++contadorPersonas;
    }

    // Cosntructor completo = sobrecarga
    public Persona(String nombre, int edad) {
        this(); // llamamos al constructor vacío privado de la misma clase, this debe ser la primer línea
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + " idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}

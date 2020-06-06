package herencia;

// Clase Padre - Hereda de Object
public class Persona {

    // 1. Definimos atributos privados
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;

    // 2. Agregamos Constructor vacío
    public Persona() {

    }

    // 3. Agregamos Constructor con un argumento
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // 4. Agregamos Constructor con todos los argumentos
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // 5. Agregamos getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    

}

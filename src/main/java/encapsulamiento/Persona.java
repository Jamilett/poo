package encapsulamiento;


public class Persona {

// 1. Asignamos atributos privados
    private String nombre;
    private double sueldo;
    private boolean eliminado;

// 2. Constructor con los mismos argumentos que los atributos
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

// 3. Creamos métodos getters (obtener valor) y setters (modificar valor) por cada atributo   
    public String getNombre() { // Prefijo get (lCC) regresará el nombre (tipo String)
        return this.nombre; // this.nombre es buena practica para saber que nos referimos a los atributos de la clase
    }

    // Prefijo set (lCC) NO REGRESA VALOR, solo es para modificar un valor
    public void setNombre(String nombre) { // Lleva como argumento el tipo de dato que va a recibir y el nombre
        this.nombre = nombre; // Asignamos el valor ingresado a nuestro atributo global        
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { // En lugar de get se utiliza is SOLO EN TIPO BOOLEAN
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
// 4. Creamos un método que nos regrese todos los datos de los atributos en un String // toString    
    public String toString (){ 
        return "nombre: " + nombre + ", sueldo: " + sueldo + ", eliminado? " + eliminado; // concatenamos valores
    }

}

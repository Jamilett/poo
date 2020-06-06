package sobrecarga.constructores;


public class Empleado extends Persona {

    private double sueldo; // característica particular de la clase Empleado

    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }

    // Constructor sobrecargado
    public Empleado(String nombre, int edad, double sueldo) {
        this(nombre, edad); // llamamos al constructor de la clase Empleado que a su vez llama al constructor de la clase Persona
        // super (nombre, edad); también podríamos usar super para llamar directamente al constructor de la clase Persona
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado{" + " sueldo=" + sueldo + '}';
    }

}

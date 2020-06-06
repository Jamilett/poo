package herencia;

// Empleado hereda de Persona
// Podemos acceder a todos los atributos, metodos y constructores publicos de la clase Persona

public class Empleado extends Persona {

// Agregamos características especiales de la clase Empleado    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; // Para contabilizar objetos de tipo Empleado

    // Agregamos constructor con nombre y sueldo
    public Empleado(String nombre, double sueldo) {
        super(nombre); // Debe ser la primer linea. Agrgamos constructor con un argumento de la clase Persona
        this.idEmpleado = ++contadorEmpleado; // Agregamos contador automático
        this.sueldo = sueldo; // Inicializamos el atributo sueldo

    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }
    
// Agregamos método to String accediendo con super al método de la clase padre y concatenamos el método toString de la clase Empleado

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

}

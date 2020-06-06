package contexto.estatico;


public class ContadorPersonas {
// 1. Creamos atributos mediante encapsulamiento    

    private int idPersona; // almacenará el valor del id que le asignaremos al objeto cada que se cree uno nuevo
    private String nombre; // se asocia con un objeto (instancia)
    private static int contadorPersonas; // static: Se asocia con la clase y NO con los objetos, si los objetos acceden al atributo estatico, todos los objetos accederán al MISMO VALOR, ya que se asocia con la clase (plantilla) 

// 2. Agregamos un constructor para ingresar el nombre
    public ContadorPersonas(String nombre) {

// 3. Asignamos un nuevo valor de forma automática al atributo de idPersona
        this.idPersona = ++contadorPersonas; // ++ pre incremento. Cada que se cree un nuevo objeto y se use el constructor, por medio el atributo static contadorPersonas, asignamos un nuevo valor
        this.nombre = nombre; // Inicializamos mediante this, el nombre ingresado en el constructor
    }
// 4. Creamos métodos get

    public int getIdPersona() {
        return this.idPersona;
    }

// El método setIdPersona NO LO USAREMOS, ya que no permitiremos la modificación  del valor idPersona directamente, se modificará a traves del constructor unicamente.
//    public void setIdPersona(int idPersona) {
//        this.idPersona = idPersona;
//    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

// 5. Creamos un método static para getContadorPersonas, para obtener el valor modificado del atributo de la clase    
// No usaremos set contadorPersonas porque se modificará el valor a traves del constructor
    public static int getContadorPersonas() { // metodo de tipo static que regresa un int (como el atributo)
        return contadorPersonas; // no podemos usar this, ya que es un método static
    }

// 6. Creamos método toString
    @Override
    public String toString() {
        return "idPersona: " + idPersona + ", nombre: " + nombre + ", contador personas: " + contadorPersonas;
    }
}

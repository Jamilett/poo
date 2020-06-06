package constructores;

public class ConstructorDefault {

    // No lleva ningún tipo de dato porque no regresa ningun dato
    // El constructor default se agrega de manera automatica por el compilador
    // si definimos un constructor con args, nosotros somos responsables de agregar el constructor vacío
    
    public ConstructorDefault() {
        System.out.println("Ejecutando Constructor Vacío");

    }

    public String nombre;

}

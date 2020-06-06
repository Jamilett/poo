package paso.referencia;


public class PasoPorReferencia {

    public static void main(String[] args) {

// Creamos un objeto de tipo persona, el constructor será por default vacío:
        Persona persona = new Persona();
// Llamamos el método cambiarNombre y asignamos un nuevo valor:        
        persona.cambiarNombre("Juan");
// Imprimimos el valor del nombre mediante el método definido en la clase Persona = .obtenerNombre:
        System.out.println("valor nombre = " + persona.obtenerNombre());

        // PASO POR REFERENCIA:
// Definimos un metodo modificarPersona (persona) y nos ayudamos del IDE para crearlo
        modificarPersona(persona);
        
// Imprimimos el valor nuevamente mandando a llamar el mpetodo obtenerNombre        
        System.out.println("nombre modificado: " + persona.obtenerNombre());

    }

// Se crea el siguiente método mediante el cual podremos acceder a los atributos de nuestra clase
    // El valor que recibirá personaArg será la referencia al objeto creado persona
   
    private static void modificarPersona(Persona personaArg) {

// Cambiamos el valor de personaArg accediendo al metodo cambiarNombre        
        personaArg.cambiarNombre("Carlos");
    }

// El programa imprimirá: 
    
// valor nombre = juan (metodo main con metodo .cambiarNombre)
// nombre modificado: carlos (metodo modificarPersona)

// NOTAS: 
    
// Una vez que termine el metodo modificarPersona, el valor de la variable nombre será "Carlos" ya que no se modifica su referencia y la dirección de memoria apunta al mismo objeto.
// La unica forma de perder la referencia es asignar el valor null o una nueva referencia (new Persona).
}

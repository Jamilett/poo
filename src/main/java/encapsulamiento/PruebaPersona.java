package encapsulamiento;


import encapsulamiento.Persona;


public class PruebaPersona {

    public static void main(String[] args) {

// Creamos un objeto persona de tipo Persona, usando el constructor con los 3 atributos:
        Persona persona = new Persona("Jamilett", 5000, false);

// Accedemos e imprimimos a los atributos mediante los métodos get e is
        System.out.println("Nombre Persona estado 1: " + persona.getNombre());
        System.out.println("Sueldo estado 1: " + persona.getSueldo());
        System.out.println("Persona Borrada? estado 1 " + persona.isEliminado());

// Podemos modificar los valores de los atributos mediante el método set
        persona.setNombre("Andres");
        persona.setSueldo(3000);
        persona.setEliminado(true);
// Buena practica: Accedemos al método toString para imprimir todos los valores y evitar la impresion por c/linea.
        System.out.println("persona estado 2: " + persona.toString()); 
// podemos omitir la llamada al método toString, el metodo println lo trae implícito:
// System.out.println("persona estado 2: " + persona); // daría el mismo resultado


    }
}

package palabra.thiss;


public class PalabraThis {
// 1. Agregamos un metodo main para ejecutar

    public static void main(String[] args) {
// 10. Creamos un obj de tipo Persona y usamos el constructor para asignar el valor de Juan
         Persona persona = new Persona("Juan");
// No es necesario llamar cada método aquí porque el cuerpo del constructor contiene todas las referencias que se harán para ejecutar el programa
    }

}
// 2. Agregamos una clase Persona con un atributo de tipo String llamado nombre

class Persona {

    String nombre;
// 3. Agregamos un constructor que reciba un valor String llamado nombre    

    Persona(String nombre) {
        this.nombre = nombre; // en este momento this apunta a la variable global nombre (tipo Persona) y recibirá el valor del constructor
        System.out.println("Impresión del operador this dentro de la clase Persona: " + this);

// 8. Creamos un objeto de tipo Imprimir        
        Imprimir imprimir = new Imprimir();
// 9. Mandamos a llamar el método Imprimir mediante la variable imprimir:
        imprimir.imprimir(this); // en este momento this contiene una referencia al obj Persona (Persona p)
// (Cuando se ejecute el resto del método imprimir, this apuntará a un obj de tipo Imprimir, ya que está dentro de la clase Imprimir a la q hace referencia
    }

}
// 4. Agregamos una clase Imprimir

class Imprimir {
// 5. Definimos un método llamado imprimir que no regrese ningún valor, que recibirá un arg de tipo Persona

    public void imprimir(Persona p) {
// 6. Imprimimos el argumento de tipo persona que vamos a recibir
        System.out.println("Impresion del arg persona: " + p); // en este momento valor del obj persona
// 7. Imprimimos el operador this
        System.out.println("Impresión del obj actual (this): " + this); // en este momento this apunta a un obj de tipo imprimir, ya que estamos en la clase imprimir
    }
}

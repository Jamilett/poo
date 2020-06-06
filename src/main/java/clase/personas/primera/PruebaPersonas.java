package clase.personas.primera;


import clase.personas.primera.Persona;


public class PruebaPersonas {

    public static void main(String[] args) {

// Creación de un objeto de tipo persona
// Declarar variable de tipo persona // Como si usaramos int, double, String...
// Sin asignar valor
        Persona persona1;

        // Instanciando(creando) un objeto de la clase Persona
        // new Persona(); // Aun no podemos usar este objeto porque no está asignado o no apunta al objeto que se creó
        persona1 = new Persona(); // Ya podríamos acceder porque le damos valor a la variable de tipo Persona

        // Accedemos al objeto persona y llamamos al metodo desplegar nombres 
        // escribimos la variable persona1. (aqui se despliegan los atributos que definimos en la clase y métodos
        persona1.desplegarNombre();
        // Aqui ejecutamos y nos imprimirá las variables y valores que definimos en la clase Persona:
        // nombre: null
        // apellido: null // El valor es null porque en la clase no definimos ningun valor

        // Modificamos los valores de los atributos del objeto persona
        persona1.nombre = "Juan"; // El valor de nombre es de tipo String (ver clase persona)
        persona1.apellido = "Perez";
        // Volvemos a imprimir valores con un salto de linea:
        System.out.println(""); // Imprime el salto
        persona1.desplegarNombre(); // Llamamos el metodo nuevamente
        // Imprimirá las variables con su respectivo valor.

        // Creacion de un segundo objeto de tipo persona:
        Persona persona2 = new Persona();
        persona2.nombre = "Carla";
        persona2.apellido = "Gomez";

        System.out.println(""); // Salto de Línea:

        persona2.desplegarNombre(); // Llamamos al método y ejecutamos para que se impriman los valores de persona2

    }

}

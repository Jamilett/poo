package clase.personas.primera;


public class Persona { // Nombre de la Clase
    // Atributos de la clase:

    String nombre; // Aún no contienen ningún valor
    String apellido;

    // Metodo de la clase (Lo usaran los objetos de esta clase)
    public void desplegarNombre() {
        // public: acceder desde otra clase a este metodo
        // void: definimos que NO regresará ningún tipo de info, sólo envía a consola los valores nombre y apellido
        // (): valores que podría recibir el método (parametros o argumentos)
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);

        // Aún no podemos ejecutar esta clase, necesitamos crear objetos y un método main para poder ejecutar el código
        // Simplemente definimos nuestra plantilla: nombre, atributos y método
    }

}

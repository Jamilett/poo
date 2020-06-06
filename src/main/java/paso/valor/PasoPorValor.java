package paso.valor;


public class PasoPorValor {

    public static void main(String[] args) {
// Definimos una variable x
        int x = 10;
        System.out.println("x = " + x);
// Agregamos un método para cambiar su valor cambiarValor (x) y en la ayuda del IDE nos mostrara la opcion de crear el metodo
        cambiarValor(x); 
// Volvemos a imprimir la variable x:        
        System.out.println("x = " + x);

    }
// Al dar clic en la ayuda, se creará un método del mismo tipo "static void" 
    private static void cambiarValor(int x) { // En esta linea se pasa/copia el valor de x (10) // podemos cambiar el nombre de la variable
        x = 20;
        // Solamente se cambiará el valor al momento de llamar el método, una vez que éste termine su función, el valor de x regresará a 10
        System.out.println("xCambiarValor = " + x);
    }
    
    // El programa imprimirá: 
    // x = 10 (metodo main)
    // xCambiarValor = 20 (metodo cambiar valor)
    // x = 10 (metodo main) porque ya termino la funcion del metodo cambiarValor

}

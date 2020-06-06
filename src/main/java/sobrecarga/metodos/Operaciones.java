package sobrecarga.metodos;


public class Operaciones {

    // Primer metodo sumar, public, static y regresa un int, recibe 2 args a y b.
    public static int sumar(int a, int b) {
        System.out.println("Metodo Sumar (int, int)");
        return a + b;
    }

    // Sobrecarga del método sumar
    // Se consideran solamente el tipo y orden de los args
    // El tipo de retorno, nombre y modificador de acceso NO SE CONSIDERAN
    public static double sumar(double a, double b) { // los args no deben ser iguales
        System.out.println("Metodo Sumar (double, double)");
        return a + b;
    }

    public static double sumar(int a, double b) {
        System.out.println("Metodo Sumar (int, double)");
        return a + b;
    }

    public static double sumar(double a, int b) {
        System.out.println("Metodo Sumar (double, int)");
        return a + b;
    }

}

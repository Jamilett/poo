package palabra.returnn;


public class PalabraReturnClases {

    public static void main(String[] args) {
// 3. Creamos el objeto de manera INDIRECTA // Lo pudimos crear directamente pero es para comprender el funcionamiento de return object

        Suma s = creaObjetoSuma(); // Regresará la referencia del objeto creado en return 
        // La variable s de tipo Suma podrá acceder a los atributos del objeto creado
        System.out.println("resultado de llamar metodo sumar: " + s.sumar());
    }

// 2. Creamos un método que regrese un objeto de tipo Suma con los valores indicados:
    private static Suma creaObjetoSuma() {
        return new Suma(4, 6); // Aquí se regresa la REFERENCIA del objeto que se está creando
        // Podría quedar así también:
        // Suma suma = new Suma (4,6);
        // return suma;

    }
}
// 1. Creamos una clase dentro del mismo archivo con la palabra reservada class
// Cuando creamos más de una clase en el mismo archivo, solo la primera será public

class Suma {

    private int a;
    private int b;

    // Constructor con dos argumentos:
    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Método Sumar
    public int sumar() {
        return this.a + this.b;
    }

}

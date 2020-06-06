package palabra.returnn;


public class PalabraReturnTiposPrimitivos {

    public static void main(String[] args) {

        sumarSinRetornarValor(3, 6); // void

        sumarRetornandoValor(4, 2); // Este metodo no imprimirá ningun valor, sólo regresa el resultado de la suma

        // Podemos también usar ese resultado en una variable nueva:
        int resultado = sumarRetornandoValor(4, 2);
        System.out.println("El resultado sumar retornando valor: " + resultado);

        sumarRetornandoCondicional(0, 0); // Metodo que usa varios return

    }

// El metodo no regresará nada, no usamos return y el programa regresará a ejecutar main
    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("el resultado de la suma sin retornar valor es: " + (a + b));
    }

// Definimos método que si nos regrese un valor int    
    private static int sumarRetornandoValor(int a, int b) {
        return a + b;
    }

// Metodo para usar varios return en un condicional:
    private static int sumarRetornandoCondicional(int a, int b) {

        if (a == 0 && b == 0) {
            System.out.println("Proporciona un valor diferente a 0");
            return 0;
        } else {
            System.out.println("La suma condicional es: " + (a + b));
            return a + b;
        }

    }
}

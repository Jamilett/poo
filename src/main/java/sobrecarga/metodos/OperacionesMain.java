package sobrecarga.metodos;


public class OperacionesMain {

    public static void main(String[] args) {
        
        System.out.println("Resultado 1: " + Operaciones.sumar(3, 4));
        
        System.out.println("Resultado 2: " + Operaciones.sumar(2.0, 4));
        
        System.out.println("Resultado 3: " + Operaciones.sumar(3, 5L)); // Long se convierte en Double 

    }
}

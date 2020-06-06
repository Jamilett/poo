package sobrecarga.constructores;


public class SobrecargaConstructoresMain {

    public static void main(String[] args) {
        
        Persona p1 = new Persona ("Jamilett", 26);
        System.out.println("p1 = " + p1);
        
        Empleado e1 = new Empleado ("Andres", 26, 4000);
        System.out.println("e1 = " + e1);

    }

}

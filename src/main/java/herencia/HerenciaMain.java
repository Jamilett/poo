package herencia;


import java.util.Date;


public class HerenciaMain {

    public static void main(String[] args) {
        
        // Creamos objeto de tipo Empleado
        Empleado empleado1 = new Empleado ("Jamilett", 5000); // Aqui se usa el constructor de la clase Empleado, la cual tiene el constructor de la clase padre (Persona)
        empleado1.setEdad(26); // Podemos acceder a los métodos publicos de la clase Padre, desde nuestro objeto Empleado
        empleado1.setDireccion("Cardenales 5");
        empleado1.setGenero('F');
        System.out.println("empleado1 = " + empleado1);
        
        // Creamos objeto de tipo Cliente usando el constructor de la clase Cliente
        Cliente cliente1 = new Cliente (new Date(), true); // importamos clase Date como Scanner y agregamos true a VIP
        cliente1.setNombre("Andres");
        cliente1.setEdad(26);
        cliente1.setGenero('M');
        cliente1.setDireccion("Betunias");
     
        System.out.println("cliente1 = " + cliente1);
        

    }

}

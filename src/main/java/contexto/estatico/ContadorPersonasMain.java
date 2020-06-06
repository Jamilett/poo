package contexto.estatico;


public class ContadorPersonasMain {

    public static void main(String[] args) {
    
        // 7. Creamos un objeto de tipo ContadorPersonas
        ContadorPersonas persona1 = new ContadorPersonas ("Jamilett");
        System.out.println(persona1); // Imprimimos la variable persona1 que ya trae implícito el método toString
        
        ContadorPersonas persona2 = new ContadorPersonas ("Andres");
        System.out.println(persona2);
        
        System.out.println("Contador Personas: " + ContadorPersonas.getContadorPersonas());

    }

}

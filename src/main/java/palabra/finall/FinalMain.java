package palabra.finall;

public class FinalMain {

    public static void main(String[] args) {
        // No es posible modificar un atributo final
        // ClaseFinal.VAR_PRIMITIVO = 20;
        int VAR_PRIMITIVO = ClaseFinal.VAR_PRIMITIVO; // Se le asigna el valor final a una nueva variable
        System.out.println("VAR_PRIMITIVO = " + VAR_PRIMITIVO);

    // Modificar la referencia de un atributo final tipo object: No es posible, solo se modificará el estado
    // ClaseFinal.VAR_PERSONA = new Encapsulamiento ();
        ClaseFinal.VAR_PERSONA.setNombre("Jam");
        System.out.println("ClaseFinal.VAR_PERSONA.getNombre = " + ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Andres"); // Solo se modifica el estado de la variable
        System.out.println("ClaseFinal.VAR_PERSONA.getNombre = " + ClaseFinal.VAR_PERSONA.getNombre());
    }

}

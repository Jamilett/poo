package palabra.finall;

public final class ClaseFinal { // Ya no puede crear clases hijas 

    // Variables final
    public final int varNumero = 10; // Se debe asignar el valor para no modificarlo posteriormente
    
    // Constante en Java: static + final
    public static final int VAR_PRIMITIVO = 15; // El nombre debe ser en mayusculas separado con _
    
    // Constante object:
    public static final Encapsulamiento VAR_PERSONA = new Encapsulamiento(); // Ya no podrá apuntar a otro objeto de tipo persona
    // Podrá modificar y acceder al estado del obj (a los atributos del objeto), pero no modificará la REFERENCIA en memoria

    // Metodo final: Sobreescritura (lo veremos después)
    public final void metodoFinal() {
    } // Si tenemos una clase hija, ya no podrá sobreescribir el comportamiento definido del método 

}

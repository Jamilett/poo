package constructores;

public class ConstructorFinal {
    
    public String nombreClase; // Se define una variable global
    
    public ConstructorFinal () { // Agregamos el constructor vacío
        
    }
    
    public ConstructorFinal (String nombre){ // Agregamos constructor con un arg y le asignamos el valor a la variable global
        nombreClase = nombre;
        
    }

}

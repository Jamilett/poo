package paso.referencia;


public class Persona {
    
// Definimos una variable global nombre:
    private String nombre;
    
// Definimos un metodo que nos regrese el nombre de la variable global:    
    public String obtenerNombre(){
        return this.nombre;
    }

// Y un método para cambiar el nombre de la variable global:    
    public void cambiarNombre (String nuevoNombre){
        this.nombre = nuevoNombre;
    }

}

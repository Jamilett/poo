/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabra.superr;

/**
 *
 * @author jamsr
 */
public class Empleado extends Persona {
    
    public int sueldo;
    
    public Empleado (String nombreEmpleado, String apellidoP, String apellidoM, int sueldo){
        super(nombreEmpleado, apellidoP, apellidoM);
        this.sueldo = sueldo;
        System.out.println("Empleado creado");
    }
    
    public int generarDinero(){
        System.out.println("Estoy generando dinero mientras programo.");
        return 5000;
    }

}

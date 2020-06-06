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
public class Main {
    
    public static void main(String[] args) {
        
//        Empleado jamPrudential = new Empleado("Jam", "Samp", "Rey", 10000);
        Programador andres = new Programador("Andr", "Ram", "Ri", 10, "JAVA");
        andres.programandoComoJunior();
        andres.generarDinero();
    }
    
}

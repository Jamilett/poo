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
public class Persona {

    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        System.out.println("Persona creada");
    }

}

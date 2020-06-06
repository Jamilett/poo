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
public class Programador extends Empleado {

    private String lenguajeDeProgramacion;

    public Programador(String name, String lastName1, String lastName2, int salary, String language) {

        super(name, lastName1, lastName2, salary);
        this.lenguajeDeProgramacion = language;
        System.out.println("Programador creado");

    }

    public void programandoComoJunior () {
        super.generarDinero();
    }

    @Override
    public int generarDinero() {
        System.out.println("Ganando como un Senior");
        return 250000;
    }
    
}

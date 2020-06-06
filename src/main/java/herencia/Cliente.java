package herencia;


import java.util.Date;

// Cliente hereda de Persona
public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro; // Usamos la clase Date con import (cómo Scanner)
    private boolean vip;
    private static int contadorClientes;

    // Agregamos constructor con dos argumentos
    // El constructor no lo llamamos explicitamente con super pero hace el mismo funcionamiento usando el constructor vacío de la clase Persona
    // Si no tuvieramos el constructor vacío en la clase padre, marcaría un error y tendríamos que usar super
    public Cliente(Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorClientes; // inicializamos idCliente con el contadorClientes (preincremento)
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    } // En memoria es un sólo objeto, con las características de otras clases

}

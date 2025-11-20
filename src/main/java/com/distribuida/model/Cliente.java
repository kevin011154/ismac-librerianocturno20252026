package com.distribuida.model;

public class Cliente {
    private int idCliente;
    private String cedula;
    private String nombre;
    private String apellido;
    private String diereccion;
    private String telefono;
    private String correo;


    //constructores
    public Cliente( ){ }

    public Cliente(int idCliente, String cedula, String nombre, String apellido, String diereccion, String telefono, String correo) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.diereccion = diereccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    //getters and setter
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDiereccion() {
        return diereccion;
    }

    public void setDiereccion(String diereccion) {
        this.diereccion = diereccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //metodo desde las librerias de java
    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", diereccion='" + diereccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}

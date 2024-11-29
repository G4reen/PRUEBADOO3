/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import bd.Conexion;
import com.sun.jdi.connect.spi.Connection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private String rut;
    private String nombre;
    private String numeroDeContacto;
    private String direccion;
    private String tipoCliente;
    List<Cliente> clientes = new ArrayList<>();

    public Cliente() {
        Conexion cx = new Conexion();
        cx.conectar();
    }
    public void agregarCliente(Cliente newCliente){
        clientes.add(newCliente);
        System.out.println("se agrego cliente");
        
        
    }
    

    public Cliente(String rut, String nombre, String numeroDeContacto, String direccion, String tipoCliente) {
        this.rut = rut;
        this.nombre = nombre;
        this.numeroDeContacto = numeroDeContacto;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeContacto() {
        return numeroDeContacto;
    }

    public void setNumeroDeContacto(String numeroDeContacto) {
        this.numeroDeContacto = numeroDeContacto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", numeroDeContacto=" + numeroDeContacto + ", direccion=" + direccion + ", tipoCliente=" + tipoCliente + ", clientes=" + clientes + '}';
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
}

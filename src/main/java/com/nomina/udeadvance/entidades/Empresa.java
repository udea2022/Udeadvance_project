package com.nomina.udeadvance.entidades;

import org.apache.catalina.User;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "Empresas")
public class Empresa {
    @Id
    @Column(name = "nit")
    public int nit;
    @Column(nullable = false, length = 50, unique = true)
    public String nombre;
    @Column(nullable = false,length = 30)
    public String telefono;
    @Column(nullable = false,length = 30)
    public String direccion;

    @ManyToOne
    @JoinColumn(name = "Empleados", referencedColumnName = "documento")
    public Empleado usuarios;

    @ManyToOne
    @JoinColumn(name = "Movimiento_Dinero", referencedColumnName = "transaccion")
    public MovimientoDinero transacciones;

    public Empresa(int nit, String nombre, String telefono, String direccion, Empleado usuarios, MovimientoDinero transacciones) {
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.usuarios = usuarios;
        this.transacciones = transacciones;
    }

    public Empresa() {
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Empleado usuarios) {
        this.usuarios = usuarios;
    }

    public MovimientoDinero getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(MovimientoDinero transacciones) {
        this.transacciones = transacciones;
    }
}

package com.nomina.udeadvance.entidades;

import javax.persistence.*;

@Entity
@Table
public class Empresa {
    @Id
    private String nombre;
    @Column(nullable = false,length = 30)
    private String direccion;
    @Column(nullable = false,length = 30)
    private String telefono;
    @Column (nullable = false, length = 30, unique = true)
    private String nit;

    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}

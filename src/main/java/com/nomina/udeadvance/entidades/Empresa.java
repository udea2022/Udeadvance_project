package com.nomina.udeadvance.entidades;

import org.apache.catalina.User;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table
public class Empresa {
    @Id
    private Long id;
    @Column(nullable = false, length = 50, unique = true)
    private String nombre;
    @Column(nullable = false, length = 30, unique = true)
    private String documento;
    @Column(nullable = false,length = 30)
    private String telefono;
    @Column(nullable = false,length = 30)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "usuarios", referencedColumnName = "empresa_id")
    private String usuarios;

    @ManyToMany
    @JoinColumn(name = "transacciones", referencedColumnName = "empresa_id")
    private String transacciones;

    @Column(nullable = false)
    private DateFormat createdAt;
    @Column(nullable = false)
    private DateFormat updateddAt;


    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nit;
    }

    public Empresa() {
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getDireccion() {
        return address;
    }

    public void setDireccion(String direccion) {
        this.address = address;
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

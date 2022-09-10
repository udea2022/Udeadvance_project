package com.nomina.udeadvance.entidades;


import javax.persistence.*;

@Entity
@Table
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column (nullable = false, length = 25, unique = true)
    private String correo;
    @Column (nullable = false, length = 15)
    private String rol;
    @Column(nullable = false, length= 50)
    public String nombre;

    @ManyToOne
    @JoinColumn(name = "empresa_id", referencedColumnName = "id")
    private Empresa empresa;

    public Empleado(int id, String correo, String rol, String nombre, Empresa empresa) {
        this.id = id;
        this.correo = correo;
        this.rol = rol;
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

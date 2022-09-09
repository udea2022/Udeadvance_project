package com.nomina.udeadvance.entidades;


import javax.persistence.*;

@Entity
@Table
public class Empleado {
    @Id
    private int documento;
    @Column(nullable = false, length= 50)
    private String nombre;
    @Column (nullable = false, length = 25, unique = true)
    private String correo;
    @ManyToOne
    @JoinColumn(name = "empresa_nombre")
    private Empresa empresa;
    @Column (nullable = false, length = 15)
    private String rol;

    public Empleado(int documento, String nombre, String correo, Empresa empresa, String rol) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public Empleado() {
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
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

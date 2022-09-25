package com.nomina.udeadvance.entidades;


import javax.persistence.*;

@Entity
@Table(name="Empleados")
public class Empleado {
    @Id
    @Column(name="documento", nullable = false, length = 30, unique = true)
    public int documento;
    @Column(nullable = false, length= 50)
    public String nombre;
    @Column (nullable = false, length = 25, unique = true)
    public String correo;
    @Column (nullable = false, length = 15)
    public String rol;

    @ManyToOne
    @JoinColumn(name = "Empresas", referencedColumnName = "nit")
    public Empresa empresa;

    public Empleado(int documento, String nombre, String correo, String rol,  Empresa empresa) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.empresa = empresa;
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

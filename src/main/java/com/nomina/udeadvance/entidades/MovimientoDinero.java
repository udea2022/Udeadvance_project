package com.nomina.udeadvance.entidades;

import javax.persistence.*;

@Entity
@Table(name="Movimiento_Dinero")
public class MovimientoDinero {
    @Id
    private long codigo;
    @Column(name="monto",nullable = false)
    private double monto;
    @Column(nullable = false,length = 30)
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "documento")
    private Empleado usuario;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public MovimientoDinero(long codigo, double monto, String concepto, Empleado usuario, Empresa empresa) {
        this.codigo = codigo;
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
        this.empresa = empresa;
    }

    public MovimientoDinero() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }
}

package com.nomina.udeadvance.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="Movimiento_Dinero")
public class MovimientoDinero {
    @Id
    @Column(name = "transaccion")
    @GeneratedValue(strategy = AUTO)
    public long id;
    @Column(length = 30,nullable = false)
    public String concepto;
    @Column(name="monto", nullable = false)
    public double monto;

    @ManyToOne
    @JoinColumn(name = "Empleados", referencedColumnName = "documento")
    public Empleado usuario;
    @ManyToOne
    @JoinColumn(name = "Empresas", referencedColumnName = "nit")
    public Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public MovimientoDinero(long id, double monto, String concepto, Empleado usuario, Empresa empresa) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
        this.empresa = empresa;
    }

    public MovimientoDinero() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

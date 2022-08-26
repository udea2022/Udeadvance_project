public class MovimientoDinero {
    private double monto;
    private String concepto;
    private Empleado usuario;
    public MovimientoDinero(int monto, String concepto, String usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }
    public MovimientoDinero () {
    }

    public int getMonto() {return monto;}

    public void setMonto(int monto) {this.monto = monto;}

    public void getConcepto() {return concepto;}

    public void setConcepto(String concepto) {this.concepto = concepto;}

    public void setUsuario(String usuario) {this.usuario = usuario;}
}

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefon;
    private String NIT;

    public Empresa(String nombre, String direccion, String telefon, String NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefon = telefon;
        this.NIT = NIT;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}

public class Usuario {
    private String nombre;
    private String contraseña;
    private double dinero;

    public Usuario(String nombre, String contraseña, double dinero) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}

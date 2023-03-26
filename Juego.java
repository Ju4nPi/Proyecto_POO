public class Juego {
    String nombre;
    String tipoconsola;
    private double precio;
    int cantidad;
    
    
    public Juego (String nombre, String tipoconsola, double precio, int cantidad){
        this.nombre = nombre;
        this.tipoconsola = tipoconsola;
        this.precio = precio;
        this.cantidad= cantidad; 
    
    }
  
  public double getPrecio(){
      return this.precio;
    }
    public void setPrecio(double precio){
      this.precio = precio;
    }

    
}

package Comida;

public class Comida { //Se maneja los datos obtenidos para entregarlos con un toString
    private String nombre = "";
    private double cantidad = 0;

    public Comida() {}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public double getCantidad() {return cantidad;}

    public void setCantidad(double cantidad) {this.cantidad = cantidad;}

    @Override
    public String toString() {
        return "La comida que usted eligio es: " + getNombre() +
                ", y la cantidad = " + getCantidad() + ". \nSu pedido llegara en breve";
    }
}

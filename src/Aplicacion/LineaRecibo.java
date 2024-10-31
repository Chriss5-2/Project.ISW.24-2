package Aplicacion;

public class LineaRecibo {
    private int cantidad;
    private int precio;

    public LineaRecibo(int cantidad, int precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double subtotal(){
        return (double) cantidad*precio;
    }
}

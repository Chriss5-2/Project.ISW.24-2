package Producto;

import java.util.Date;

public class Vino extends Bebida{
    private double anejamiento;
    private String tipoUva;

    public Vino(int idProduct, String descripcion, String nombre, double precio, int stock, double volumen, String origen, Date fechaProducción, double anejamiento, String tipoUva) {
        super(idProduct, descripcion, nombre, precio, stock, volumen, origen, fechaProducción);
        this.anejamiento = anejamiento;
        this.tipoUva = tipoUva;
    }

    public double getAñejamiento() {
        return anejamiento;
    }

    public void setAñejamiento(double añejamiento) {
        this.anejamiento = añejamiento;
    }

    public String getTipoUva() {
        return tipoUva;
    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }
}

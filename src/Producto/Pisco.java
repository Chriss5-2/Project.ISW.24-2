package Producto;

import java.util.Date;

public class Pisco extends Bebida{
    private double anejamiento;
    private String tipoUva;

    public Pisco(int idProduct, String descripcion, String nombre, double precio, int stock, double volumen, String origen, Date fechaCosecha, double anejamiento, String tipoUva) {
        super(idProduct, descripcion, nombre, precio, stock, volumen, origen, fechaCosecha);
        this.anejamiento = anejamiento;
        this.tipoUva = tipoUva;
    }

    public double getAnejamiento() {
        return anejamiento;
    }

    public void setAnejamiento(double anejamiento) {
        this.anejamiento = anejamiento;
    }

    public String getTipoUva() {
        return tipoUva;
    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }
}

package Producto;

import java.util.Date;

public class Bebida extends Producto{
    private double volumen;
    private String origen;
    private Date fechaProducción;

    public Bebida(int idProduct, String descripcion, String nombre, double precio, int stock, double volumen, String origen, Date fechaProducción) {
        super(idProduct, descripcion, nombre, precio, stock);
        this.volumen = volumen;
        this.origen = origen;
        this.fechaProducción = fechaProducción;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public Date getFechaProducción() {
        return fechaProducción;
    }

    public void setFechaProducción(Date fechaProducción) {
        this.fechaProducción = fechaProducción;
    }
}

package Aplicacion.Entity;

import java.sql.Timestamp;

public class ComprobantePago {
    private Timestamp fecha;
    private double monto;
    private int nroComprobante;


    public ComprobantePago(Timestamp fecha, double monto, int nroComprobante) {
        this.fecha = fecha;
        this.monto = monto;
        this.nroComprobante = nroComprobante;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }


}

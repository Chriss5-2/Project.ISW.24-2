package Aplicacion;

import java.sql.Timestamp;

public class SolicitudCompra {
    private Timestamp fecha;

    public SolicitudCompra(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public boolean registrarSolicitud(){
        return true;
    }
}

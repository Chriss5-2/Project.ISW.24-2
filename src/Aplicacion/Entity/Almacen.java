package Aplicacion.Entity;

public class Almacen {
    public Almacen() {
    }

    public int mostrarStock(Producto producto){
        return producto.getStock();
    }
}

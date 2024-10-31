package Producto;

public class Producto {
    private int idProduct;
    private String descripcion;
    private String nombre;
    private double precio;
    private int stock;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarDetalle(Producto producto) {
        System.out.println("Nombre del producto "+nombre);
        System.out.println("Precio del producto "+precio);
        System.out.println("Stock del producto "+stock);
        System.out.println("Stock del producto "+stock);
    }

    public void solicitarProducto(Producto producto){
        if(producto != null){
            System.out.println("Producto solicitado");
        }else{
            System.out.println("Ingrese producto");
        }
    }

    public int showStockProduct(Producto producto){
        return stock;
    }

    public boolean registrarProducto(Producto producto){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String buscarProducto(Producto producto){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

package Aplicacion;

public class Proveedor {
    private String numEmpresa;
    private int ruc;

    public Proveedor(String numEmpresa, int ruc) {
        this.numEmpresa = numEmpresa;
        this.ruc = ruc;
    }

    public String getNumEmpresa() {
        return numEmpresa;
    }

    public void setNumEmpresa(String numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }
}

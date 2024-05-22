public class Elegante extends Zapato {
    private boolean tieneHebilla;

    public Elegante(String marca, String modelo, String material, int talla, double precio, boolean tieneHebilla) {
        super(marca, modelo, material, talla, precio);
        this.tieneHebilla = tieneHebilla;
    }
    
    @Override
    public String toString() {
        return "Elegante: " +
            "Marca: " + getMarca() +
            ", Modelo " + getModelo() +
            ", Material: " + getMaterial() +
            ", talla: " + getTalla() +
            ", precio: " + getPrecio() + 
            " tieneHebilla='" + isTieneHebilla() +
            "}";

}


public boolean isTieneHebilla() {
    return this.tieneHebilla;
}

public boolean getTieneHebilla() {
    return this.tieneHebilla;
}

public void setTieneHebilla(boolean tieneHebilla) {
    this.tieneHebilla = tieneHebilla;
}

}

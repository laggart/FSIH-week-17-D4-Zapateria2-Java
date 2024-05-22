public class Zapato {
    private String marca;
    private String modelo;
    private String material;
    private int talla; 
    private double precio;


    public Zapato(String marca, String modelo, String material, int talla, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.material = material;
        this.talla = talla;
        this.precio = precio;
    }


    public Zapato() {
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTalla() {
        return this.talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", material='" + getMaterial() + "'" +
            ", talla='" + getTalla() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }

    
}




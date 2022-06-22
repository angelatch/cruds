
package Entidad;

public class Marca {
    int marca_id;
    String marca_nombre;

    public Marca() {
    }

    public Marca( String marca_nombre) {
        this.marca_nombre= marca_nombre;
    }

    public int getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(int marca_id) {
        this.marca_id = marca_id;
    }

    public String getMarca_nombre() {
        return marca_nombre;
    }

    public void setMarca_nombre(String marca_nombre) {
        this.marca_nombre = marca_nombre;
    }
    
}

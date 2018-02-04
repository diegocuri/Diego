
package unach.edu.ec.veterinaria.Entidades;

public class Veterinario {
    private int codigo_vet;
    private String nombre;
    public Veterinario() {
    }

    public Veterinario(int codigo_vet, String nombre) {
        this.codigo_vet = codigo_vet;
        this.nombre = nombre;
    }

    public int getCodigo_vet() {
        return codigo_vet;
    }

    public void setCodigo_vet(int codigo_vet) {
        this.codigo_vet = codigo_vet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    } 
}
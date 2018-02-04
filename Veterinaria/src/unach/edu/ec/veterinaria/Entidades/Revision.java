
package unach.edu.ec.veterinaria.Entidades;

public class Revision {
    private int codigo_rev;
    private Mascota mascota;
    private Veterinario veterinario;
    private String descripcion;

    public Revision() {
    }

    public Revision(int codigo_rev, Mascota mascota, Veterinario veterinario, String descripcion) {
        this.codigo_rev = codigo_rev;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.descripcion = descripcion;
    }

    public int getCodigo_rev() {
        return codigo_rev;
    }

    public void setCodigo_rev(int codigo_rev) {
        this.codigo_rev = codigo_rev;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
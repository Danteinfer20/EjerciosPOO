
package equipodefutbol;

public class Tecnico extends Persona {
    int aniosExperiencia;
    boolean nacional ;

    public Tecnico(int id, int edad, String nombre, String apellido, int aniosExperiencia, boolean nacional) {
        super(id, edad, nombre, apellido);
        this.aniosExperiencia = aniosExperiencia;
        this.nacional = nacional;
        
    }

    public int getAnioExperiencia() {
        return aniosExperiencia;
    }

    public void setAnioExperiencia(int anioExperiencia) {
        this.aniosExperiencia = anioExperiencia;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}

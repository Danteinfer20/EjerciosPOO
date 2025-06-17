
package equipodefutbol;

public class Delanteros extends Persona{
    boolean Titular;
    int golesAnotados;

    public Delanteros(boolean Titular, int golesAnotados, int id, int edad, String nombre, String apellido) {
        super(id, edad, nombre, apellido);
        this.Titular = Titular;
        this.golesAnotados = golesAnotados;
    }

    public boolean isTitular() {
        return Titular;
    }

    public void setTitular(boolean Titular) {
        this.Titular = Titular;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
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

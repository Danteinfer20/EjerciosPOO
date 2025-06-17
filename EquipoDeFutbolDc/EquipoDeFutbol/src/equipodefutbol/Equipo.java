
package equipodefutbol;

import java.util.ArrayList;

public class Equipo {
    int id ;
    String nombre, pais;
    Tecnico Tecnico;
    Portero Portero;
    ArrayList<Delanteros> delantero;
    ArrayList<MedioCampo> mediocampo;
    ArrayList<Defensas> defensa;

    public Equipo(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        defensa = new ArrayList<Defensas>();
        mediocampo = new ArrayList<MedioCampo>();
        delantero = new ArrayList<Delanteros>();

    }

    public Equipo(int id, String nombre, String pais, Tecnico Tecnico, Portero Portero, ArrayList<Delanteros> delantero, ArrayList<MedioCampo> mediocampo, ArrayList<Defensas> Defensa) {
        this(id, nombre, pais);
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.Tecnico = Tecnico;
        this.Portero = Portero;
        this.delantero = delantero;
        this.mediocampo = mediocampo;
        this.defensa = defensa;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Tecnico getTecnico() {
        return Tecnico;
    }

    public void setTecnico(Tecnico Tecnico) {
        this.Tecnico = Tecnico;
    }

    public Portero getPortero() {
        return Portero;
    }

    public void setPortero(Portero Portero) {
        this.Portero = Portero;
    }

    public ArrayList<Delanteros> getDelantero() {
        return delantero;
    }

    public void setDelantero(ArrayList<Delanteros> delantero) {
        this.delantero = delantero;
    }

    public ArrayList<MedioCampo> getMediocampo() {
        return mediocampo;
    }

    public void setMediocampo(ArrayList<MedioCampo> mediocampo) {
        this.mediocampo = mediocampo;
    }

    public ArrayList<Defensas> getDefensa() {
        return defensa;
    }

    public void setDefensa(ArrayList<Defensas> defensa) {
        this.defensa = defensa;
    }
    
    
}

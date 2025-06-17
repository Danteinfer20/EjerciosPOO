package equipodefutbol;

import java.util.ArrayList;

public class EquipoDeFutbol {
    public static void main(String[] args) {
        
        
        ArrayList<Defensas> defensas = new ArrayList<Defensas>();
        ArrayList<MedioCampo> medioCampos = new ArrayList<MedioCampo>();
        
        
        ArrayList<Delanteros> delanteros = new ArrayList<Delanteros>();
       
        Tecnico tecnico = new Tecnico(1, 50, "Carlos", "Ramírez", 50, true);
        Portero portero = new Portero(1, 28, "Luis", "Pérez", true, 13);
       
        defensas.add(new Defensas(true, 1, 20, "José", "López"));
        defensas.add(new Defensas(true, 2, 27, "Mario", "Garcia"));
        defensas.add(new Defensas(true, 3, 24, "Juan", "Fernandez"));
        defensas.add(new Defensas(true, 4, 26, "Pedro", "Sanchez"));
       
        medioCampos.add(new MedioCampo(1, 23, "Andres", "Martinez", true, 25));
        medioCampos.add(new MedioCampo(2, 22, "Carlos", "Diaz", false, 15));
        medioCampos.add(new MedioCampo(3, 21, "Manuel", "Ruiz", true, 2));
        medioCampos.add(new MedioCampo(4, 24, "Luis", "Castro", true, 42));
       
        delanteros.add(new Delanteros(true, 23, 1, 29, "Enrique", "Nuñez"));
        delanteros.add(new Delanteros(true, 14, 2, 30, "Sergio", "Ortega"));
      
        Equipo equipo = new Equipo(1, "Leones FC", "México", tecnico, portero, delanteros, medioCampos, defensas);
        System.out.println("=== EQUIPO ===");
        System.out.println("Nombre: " + equipo.nombre);
        System.out.println("País: " + equipo.pais);

        System.out.println("--- Técnico ---");
        System.out.println("Nombre: " + tecnico.getNombre() + " " + tecnico.getApellido());
        System.out.println("Edad: " + tecnico.getEdad());
        System.out.println("Experiencia: " + tecnico.getAnioExperiencia() + " años");
        System.out.println("Es Nacional?: " + tecnico.isNacional());

        System.out.println("--- Portero ---");
        System.out.println("Nombre: " + portero.getNombre() + " " + portero.getApellido());
        System.out.println("Edad: " + portero.getEdad());
        System.out.println("Goles recibidos: " + portero.getGolesRecibidos());
        System.out.println("Es titular?: " + portero.isTitular());

        System.out.println("--- Defensas ---");
        for (Defensas d : defensas) {
            System.out.println("Nombre: " + d.getNombre() + " " + d.getApellido() +
                               ", Edad: " + d.getEdad() +
                               ", Es titular?: " + d.isTitular());
        }
       
        System.out.println("--- MedioCampos ---");
        for (MedioCampo m : medioCampos) {
            System.out.println("Nombre: " + m.getNombre() + " " + m.getApellido() +
                               ", Edad: " + m.getEdad() +
                               ", Disponible: " + m.isTitular());
        }

        System.out.println("--- Delanteros ---");
        for (Delanteros d : delanteros) {
            System.out.println("Nombre: " + d.getNombre() + " " + d.getApellido() +
                               ", Edad: " + d.getEdad() +
                               ", Goles anotados: " + d.getGolesAnotados() + ", Es titular?: " + d.isTitular());
        }
    }  
}
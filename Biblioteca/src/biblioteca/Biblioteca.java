
package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
 public static void main(String[] args) {
       
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(new Libre(
            "Cien años de soledad", 
            "Gabriel García Márquez", 
            "García Márquez, G. (1967)", 
            "Novela Latinoamericana", 
            "1967", 
            "Sudamericana")
        
        );

        
        publicaciones.add(new Revista(
            "National Geographic", 
            "Mensual", 
            "Estados Unidos", 
            "Edición de Abril", 
            "2025", 
            "NatGeo")
        );
        for (Publicacion publicacioness : publicaciones) {
            System.out.println("------ Publicacion ------");
            System.out.println("Título: " + publicacioness.getTitulo());
            System.out.println("Año: " + publicacioness.getAnioPublicacion());
            System.out.println("Editorial: " + publicacioness.getEditorial());
            if (publicacioness instanceof Libre) {
                Libre libro = (Libre) publicacioness;
                System.out.println("Tipo: Libro");
                System.out.println("Nombre: " + libro.getNombrelibro());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Referencia: " + libro.getReferencia_bibliografica());
            } else if (publicacioness instanceof Revista) {
                Revista revista = (Revista) publicacioness;
                System.out.println("Tipo: Revista");
                System.out.println("Nombre: " + revista.getNombreRevista());
                System.out.println("Periodicidad: " + revista.getPeriodicidad());
                System.out.println("País: " + revista.getPais());
            }

            System.out.println("-------------------------");
        }
    }
}



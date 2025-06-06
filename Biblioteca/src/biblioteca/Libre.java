
package biblioteca;


public class Libre extends  Publicacion {
    String nombrelibro;
    String autor;
    String referencia_bibliografica;

    public Libre(String nombrelibro, String autor, String referencia_bibliografica, String titulo, String anioPublicacion, String editorial) {
        super(titulo, anioPublicacion, editorial);
        this.nombrelibro = nombrelibro;
        this.autor = autor;
        this.referencia_bibliografica = referencia_bibliografica;
        
    }

    public String getNombrelibro() {
        return nombrelibro;
    }

    public void setNombrelibro(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getReferencia_bibliografica() {
        return referencia_bibliografica;
    }

    public void setReferencia_bibliografica(String referencia_bibliografica) {
        this.referencia_bibliografica = referencia_bibliografica;
    }

    }
    

    
    
    


    

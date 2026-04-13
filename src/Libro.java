
public class Libro {
    String titulo;
    String autor;
    int año;

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    void mostrarInformacion(){
        System.out.println("Ejercicio: Libro");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicacion: "+ año);
        System.out.println("------------------------------------");
    }
}

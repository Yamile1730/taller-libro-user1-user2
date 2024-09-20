package gestionbiblioteca;

public class GestionLibros{
    public static void main(String[] args) {

        Libro libro1 = new Libro ("El Principito", "Antoine de Saint-Exupéry", 96, 1943);
        Libro libro2 = new Libro ("Cien años de soledad", "Gabriel García Márquez", 417, 1967);

        System.out.println("Libro 1:");
        libro1.mostrarInformacion();

        System.out.println("Libro 2:");
        libro2.mostrarInformacion();

        System.out.println("Modificando número de páginas del libro 1...");
        libro1.setNumeroPaginas(100);

        System.out.println("Libro 1 actualizado el numero de paginas:");
        libro1.mostrarInformacion();
    }
}
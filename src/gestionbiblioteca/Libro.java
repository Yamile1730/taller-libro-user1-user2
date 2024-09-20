package gestionbiblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int anoPublicacion;

    public Libro(String titulo, String autor, int numeroPaginas, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion = anoPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas (int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public int getAnoPublicacion() {
        return anoPublicacion;
    }
    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numeropaginas: " + numeroPaginas);
        System.out.println("Anopublicación: " + anoPublicacion);
        System.out.println();
    }
}

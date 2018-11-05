package boletin7;

public class Libro {

    private String titulo;
    private String autor;
    private int exemplares;
    private int exPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int exemplares, int exPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.exemplares = exemplares;
        this.exPrestados = exPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExPrestados(int exPrestados) {
        this.exPrestados = exPrestados;
    }

    public int getExPrestados() {
        return exPrestados;
    }

    public boolean facerPrestamo() {
        boolean prestamo = true;
        if (exPrestados < exemplares) {
            exPrestados++;
        } else {
            prestamo = false;
        }
        return prestamo;
    }

    public boolean facerDevolucion() {
        boolean devolucion = true;
        if (exPrestados == 0) {
            devolucion = false;
        } else {
            exPrestados--;
        }
        return devolucion;
    }

    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nNúmero de exemplares: "
                + exemplares + "\nExemplares prestados: " + exPrestados;
    }
}

public class Livro {
    private String titulo;
    private String autor;
    private int npag;
    private int anopubl;

    public Livro(String tit, String autor, int npag, int anopubl) {
        this.titulo = tit;
        this.autor = autor;
        this.npag = npag;
        this.anopubl = anopubl;
    }

    public String toString() {
        return "Livro\n\nTitulo: " + titulo + "\nAutor: " + autor + "\nPaginas" + npag + "\nAno da Publicação" + anopubl
                + "\n";
    }

    public boolean isOlder() {
        if (anopubl < 1970) {
            return true;
        }
        return false;
    }

}
public class LivroLivraria extends Livro {
    private float preco;
    private int estoque;

    public LivroLivraria(String tit, String autor, int npag, int anopubl, float preco, int estoque) {
        super(tit, autor, npag, anopubl);
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean isAvaliable() {
        if (estoque == 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Preço: " + preco + "\n";
    }

    public void sell() {
        if (isAvaliable()) {
            System.out.println(toString());
        }
        System.out.println("Não foi possivel efetuar a venda!!");
    }
}
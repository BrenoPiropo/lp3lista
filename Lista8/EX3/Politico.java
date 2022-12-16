public class Politico extends Pessoa{
    private String sigla;
    private int numeroPartido;

    public Politico(String n, long id, Data d, String sigla, int numeroPartido){
        super(n, id, d);
        this.sigla = sigla;
        this.numeroPartido = numeroPartido;
    }

    public String getSigla(){
        return sigla;
    }
    public int getNumeroPartido(){
        return numeroPartido;
    }

    public void setSigla(String s){
        this.sigla = s;
    }
    public void setNumeroPartido(int np){
        this.numeroPartido = np;
    }

    @Override
    public String toString(){
        return "Sigla: " + sigla + "\nNumero de Partido: " + numeroPartido + "\n";
    }
}
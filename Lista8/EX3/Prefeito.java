public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String n, long id, Data d, String sigla, int numeroPartido, String cidade){
        super(n, id, d, sigla, numeroPartido);
        this.cidade = cidade;
    }

    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return "Cidade: " + cidade + "\n";
    }
}
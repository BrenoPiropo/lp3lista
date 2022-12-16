public class Pessoa{
    private String nome;
    private String endereco;
    private Data nascimento;
    private String email;

    public Pessoa(String nome, String e, Data nascimento, String email){
        this.nome = nome;
        this.endereco = e;
        this.nascimento = nascimento;
        this.email = email;
        if(!verificaDados()){
            System.out.println("Erro dados invalidos!!");
        }
    }

    public String getNome(){
        return nome;
    }

    public long getEndereco(){
        return endereco;
    }

    public Data getNascimento(){
        return nascimento;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setEndereco(String e){
        endereco = e;
    }

    public void setDate(Data d){
        nascimento = d;
    }

    public void setEmail(String em){
        email = em;
    }

    private boolean verificaDados(){
        if(nome == null){
            return false;
        }
        if(id < 999){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nEndereco: " + endereco + "\nData de nascimento: " + nascimento.toString() + "\n";
    }
}
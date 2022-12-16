public class PessoaJuridica extends Pessoa{
    private String CNPJ;
    private float faturamento;

    public PessoaJuridica(String nome, String e, Data nascimento, String email, String cnpj){
        super(nome, e, nascimento, email);
            this.CNPJ = cnpj;
    }

    public String getCNPJ(){
        return CNPJ;
    }
    public void setCNPJ(String cnpj){
        this.CNPJ = cnpj;
    }

    public String getFaturamento(){
        return faturamento;
    }
    public void setFaturamento(String fatura){
        this.faturamento = fatura;
    }
    
    @Override
    public String toString(){
        return "CNPJ: " + CNPJ + "\nFaturamento: " + faturamento +"\n";
    }
}
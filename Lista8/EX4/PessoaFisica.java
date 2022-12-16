public class PessoaFisica extends Pessoa{
    private String CPF;
    final private static int cpfcompleto = 14;
    final private static int cpfresto = 11;

    public PessoaFisica(String nome, String e, Data nascimento, String email, String cpf){
        super(nome, e, nascimento, email);
        if(validaCPF(cpf)){
            this.CPF = cpf;
        }else{
            System.out.printf("CPF errado");
        }
    }

    public String getCPF(){
        return CPF;
    }
    public void setCPF(String cpf){
        this.CPF = cpf;
    }
    
    private boolean validaCPF(String cpf){
        return cpf.length() == cpfcompleto || cpf.length() == cpfresto;
      }
    
      @Override
      public String toString(){
          return "CPF: " + CPF + "\nFaturamento: " + faturamento +"\n";
      }
}
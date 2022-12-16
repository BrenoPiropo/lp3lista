public class Main{
    public static void main(String[] args){
        Data data = new Data(26, 9, 2002);
        Pessoa pessoa = new Pessoa("lion", 5434, data);

        System.out.println(pessoa.toString());

        //Data da = new Data(22, 5, 2000);
        //Funcionario f = new Funcionario("falcon", 56754, data, da, 800);
        //System.out.println(f.toString());
    }
}
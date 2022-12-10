import entities.Contato;

public class Main1 {
    public static void main(String[] args) {
        Contato contato1 = new Contato("JOAO", "Teste@gmailcom",
                "739888888", 11, 2, 2010);
        Contato contato2 = new Contato("maria", "Teste2@gmailcom",
                "7398888888", 12, 12, 2001);

        System.out.println("O contato 1 é " + contato1.toString());
        System.out.println("O contato 2 é " + contato2.toString());

    }
}
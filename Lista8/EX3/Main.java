public class Main{
    public static void main(String[]args){
        Politico politico = new Politico("ladrao", 123456, 29,9, 1999, "L", 13);
        Prefeito prefeito = new Prefeito("maluco", 123456, 29, 9, 2003, "B", 22, "lalala");
        Governador gov = new Governador("burro", 123456, 29, 9, 2003, "POVO", 23, "kkkkk");

        System.out.println(politico.toString());
        System.out.println(prefeito.toString());
        System.out.println(gov.toString());
    }
}
package lp3lista.Lista0;

import java.util.Scanner;

/* Uma equipe de manuntenção eletrica deve determinar se o multimetro disponivel opera corretamente.Para isto devem realizar 10 medições  de voltagem
 * em um circuito de corrente direta criado para testes.Em seguida devem calculara a média e o desvio padrão das leituras.
 * Se o desvio padrão for superior a 10% do valor medio, o multimetro está com problemas e não pode ser utlizado.Crie um programa em java quer processe
 * os dados de leitura  e informe se o multimetro encontra-se operacional.Seu programa deve imprimir no final todas as leituras, o valor medio, o desvio padrão
 * e uma mensagem informando a situação do dispositivo. 
 *  */
//Desvio padrao é a raiz quadrada da variancia;
public class multimetro {

    public static void main(String[] args) {
		int i=0;
		double[] guardaValor ;
		double total=0;
		double mediaA=0;
		double soma=0;
		double aux=0;
		double resultados=0;
		double variancia =0;
		double desvioPadrao=0;
		guardaValor=new double[10];
		Scanner sc = new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.println("Digite a voltagem da corrente ");
			aux=sc.nextDouble();
			guardaValor[i]=aux;
			total+=aux;
		}
		mediaA=total/10; // faz a media aritmetica do array
		System.out.println("A media é "+mediaA);
		//calcula a variancia = E(x-m)2 / n ; Primeira formula
		for(i=0;i<3;i++) {
			soma+= Math.pow(mediaA-guardaValor[i],2) ;

		}
		
		 resultados = soma /10;
		//Calcular o desvio padrao
			variancia = resultados;
			desvioPadrao=Math.sqrt(variancia);
			System.out.println("O desvio padrão é "+desvioPadrao);
			if(desvioPadrao>resultados*0.1) {
				System.out.println("o multimetro está quebrado");
			}
			else {
				System.out.println("O multimetro está funcionando corretamente");
			}

package entities;

import java.util.*;

public class Contato {
    // Atributos
    private String nome, email, telefone;
    private int dia, mes, ano;
    private static int contador = 0;

    // Construtor
    public Contato(String nome, String email, String telefone, int dia, int mes, int ano) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDate(dia, mes, ano);
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        contador++;
    }

    public Contato() {
        this("TESTE", null, "99999999999", 11, 12, 2001);
    }

    public Contato(String name, String phone, int day, int month, int year) {
        this(name, null, phone, day, month, year);
    }

    public int getContador() {
        return this.contador;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace("-", "");
        telefone = telefone.replace(" ", "");
        this.telefone = telefone;
    }

    public void setDate(int day, int month, int year) {
        Data date = new Data();

        date.setDate(day, month, year);
        this.dia = date.getDay();
        this.mes = date.getMonth();
        this.ano = date.getYear();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void printContact() {
        System.out.printf("Name: %s\n", getNome());
        System.out.printf("Email: %s\n", getEmail());
        System.out.printf("Phone: %s\n", getTelefone());
        System.out.printf("Birth date: %02d/%02d/%02d\n", getDia(), getMes(), getAno());
    }

    public int calculaIdade() {
        Calendar data = new GregorianCalendar();
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int mes = data.get(Calendar.MONTH);
        int ano = data.get(Calendar.YEAR);
        int idade = ano - this.ano;

        if (this.mes <= mes) {
            if (this.dia <= dia) {
                return idade;
            }
        }
        return (idade - 1);
    }

    public String toString() {
        return getNome() + ", " + getEmail() + ", " + getTelefone() + ", " + getDia() + "/" + getMes() + "/" + getAno()
                + "\n";
    }
}
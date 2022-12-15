public class Data{
    //Atributos
    private int dia, mes, ano;

    //Construtor
    public Data(int dia, int mes, int ano){
        setDate(dia, mes, ano);
    }

    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(Data date){
        this(date.getDia(), date.getMes(), date.getAno());
    }

    //Retorna verdadeiro se a data passada por paramentro é anterior a data do objeto
    public boolean isPrevious(Data outraData){
        if(outraData.getAno() < this.ano){
            return true;
        }else if(outraData.getAno() > this.ano){
            return false;
        }else{
            if(outraData.getMes() < this.mes){
                return true;
            }else if(outraData.getMes() > this.mes){
                return false;
            }else{
                if(outraData.getDia() < this.dia){
                    return true;
                }
                return false;
            }
        }
    }

    public boolean isPrevious(int dia, int mes, int ano){
        if(ano < this.ano){
            return true;
        }else if(ano > this.ano){
            return false;
        }else{
            if(mes < this.mes){
                return true;
            }else if(mes > this.mes){
                return false;
            }else{
                if(dia < this.dia){
                    return true;
                }
                return false;
            }
        }
    }

    //Retorna a quantidade de dias até uma data
    public int howManyDays(Data outraData){
        return this.howManyDays(outraData.getDia(), outraData.getMes(), outraData.getAno());
    }
    
    public int howManyDays(int dia, int mes, int ano){
        if(isPrevious(dia, mes, ano)){
            float difAnos = (float)mode(ano - this.ano) - 1;
            float difMes1 = 12.0f - mes;
            float difMes2 = this.mes - 1.0f + 1;
            float dias = (difAnos * 365.25f) + ((difMes1 + difMes2) * 365.25f / 12);
            return (int)(-dias);
        }else{
            float difAnos = (float)mode(ano - this.ano) - 1;
            float difMes1 = 12.0f - this.mes;
            float difMes2 = mes - 1.0f + 1;
            float dias = (difAnos * 365.25f) + ((difMes1 + difMes2) * 365.25f / 12);
            return (int)dias;
        }
    }

    //Retorna o valor absoluto de um número
    private int mode(int n){
        if(n < 0){
            return (-1 * n);
        }
        return n;
    }

    //Retorna o dia da semana
    public String dayOfWeek(Data date){
        int d = date.getDia();
        int m = date.getMes();
        int y = date.getAno();
        int k = 0;
        String[] diasSemana = {"Sabado", "Domingo","Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};

        if(m == 1){
            k = d + 2 * 13 + (3 * (13 + 1) / 5) + (y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + 2;
        }else if(m == 2){
            k = d + 2 * 14 + (3 * (14 + 1) / 5) + (y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + 2;
        }else{
            k = d + 2 * m + (3 * (m + 1) / 5) + y + (y / 4) - (y / 100) + (y / 400) + 2;
        }

        return diasSemana[k % 7];
    }

    //Atualiza a data
    public void setDate(int dia, int mes, int ano){
        if(dateVerification(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.printf("Invalid Date!\n");
            System.exit(-1);
        }
    }

    //Retorna o dia
    public int getDia(){
        return this.dia;
    }

    //Retorna o mês
    public int getMes(){
        return this.mes;
    }

    //Retorna o ano
    public int getAno(){
        return this.ano;
    }

    //Verifica se a data está correta
    private boolean dateVerification(int dia, int mes, int ano){
        if((mes >= 1) && (mes  <= 12)){
            if(mes == 2){
                if((dia >= 1) && (dia <= 29) && (isLeapYear(ano))){
                    return true;
                }else if((dia >= 1) && (dia <= 28)){
                    return true;
                }
                return false;
            }else if((dia >= 1) && (dia <= 30) && ((mes % 2 == 0) && (mes != 8))){
                return true;
            }else if((dia >= 1) && (dia <= 31)){
                return true;
            }
        }
        return false;
    }

    //Verifica se o ano é bissexto
    private boolean isLeapYear(int ano){
        if((ano % 4 == 0) && ((ano % 100 == 0) && (ano % 400 == 0))){
            return true;
        }
        return false;
    }

    //Inicializa o dia, mês e ano com valores padrão
    public void initializeDate(){
        this.dia = getDia();
        this.mes = getMes();
        this.ano = getAno();
    }

    //Imprime data
    public void imprimeData(){
        System.out.printf("%d/%d/%d\n", dia, mes, ano);
    }

    //Imprime data por extenso
    public void imprimeDataExt(){
        String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.printf("%d de %s de %d\n", this.dia, m[getMes() - 1], this.ano);
    }
}
public class Governador extends Politico{
    private String estado;

    public Governador(String n, long id, Data d, String sigla, int numeroPartido, String estado){
        super(n, id, d, sigla, numeroPartido);
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    @Override
    public String toString(){
        return "Estado: " + estado + "\n";
    }
}
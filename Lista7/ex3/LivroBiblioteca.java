import java.util.Calendar;
import java.util.GregorianCalendar;

public class LivroBiblioteca extends Livro {
    private boolean emprestado;
    private Data dataDevolvido;

    public LivroBiblioteca(String tit, String autor, int npag, int anopubl, boolean emprestado, Data dDev) {
        super(tit, autor, npag, anopubl);
        this.emprestado = emprestado;
        this.dataDevolvido = dDev;
    }

    public boolean isAvaliable() {
        Calendar c = new GregorianCalendar();
        int d = c.get(Calendar.DAY_OF_MONTH);
        int m = c.get(Calendar.MONTH);
        int y = c.get(Calendar.YEAR);
        Data dt = new Data(d, m, y);

        if (emprestado && dataDevolvido.isPrevious(dt)) {
            return false;
        }
        return true;
    }

    public void borrow() {
        if (isAvaliable()) {
            System.out.println("Livros emprestado com seucesso!!\n");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Emprestado: " + emprestado + "\nData de devolução: " + dataDevolvido.toString();
    }

}
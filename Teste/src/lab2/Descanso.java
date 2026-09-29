package lab2;

public class Descanso {

    private int horasDescanso;
    private final int HORASDESCANSADO = 26;
    private int numerosDeSemana;

    public void defineHorasDescanso (int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas (int valor) {
        this.numerosDeSemana = valor;
    }

    public String getStatusGeral() {
        if (this.horasDescanso != 0 && this.horasDescanso >= this.HORASDESCANSADO*this.numerosDeSemana){
            return "descansado";
        }
        else{
            return "cansado";
        }
    }

}
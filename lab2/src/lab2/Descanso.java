package lab2;

/**
 * Representação da rotina de descanso do aluno.
 *
 * @author Pedro Augusto Alexandrino Santos
 */
public class Descanso {

    /**
     * Horas que foram descansadas.
     */
    private int horasDescanso;

    /**
     * Numero de semanas no total
     */
    private int numerosDeSemana;

    /**
     * Constroi a representação do descanso do aluno.
     *
     */
    public Descanso (){
           this.horasDescanso = 0;
           this.numerosDeSemana = 0;
    }

    /**
     * Define o valor de horas de descanso do aluno.
     *
     * @param valor O valor que será definido como horas de descanso do aluno.
     */
    public void defineHorasDescanso (int valor) {
        this.horasDescanso = valor;
    }

    /**
     * Define o numero de semanas com base no valor passado.
     *
     * @param valor O numero de semanas a ser definido.
     */
    public void defineNumeroSemanas (int valor) {
        this.numerosDeSemana = valor;
    }

    /**
     * Retorna descansado ou cansado com base no Status.
     *
     * @return Retorna "descansado" ou "cansado" com base no Status.
     */
    public String getStatusGeral() {
        /**
         * Constante que representa o tanto que deve ter descansado no minimo para não estar cansado.
         */
        int HORASDESCANSADO = 26;
        if (this.horasDescanso != 0 && this.horasDescanso >= HORASDESCANSADO *this.numerosDeSemana){
            return "descansado";
        }
        else{
            return "cansado";
        }
    }

}
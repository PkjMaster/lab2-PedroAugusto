package lab2;

/**
 * Representação do registro de tempo online responsável pro controlar o tempo online usado.
 *
 * @author Pedro Augusto Alexandrino Santos
 */
public class RegistroTempoOnline {

    /**
     * O nome da disciplina.
     */
    private String nome;

    /**
     * O tempo investido na disciplina.
     */
    private int tempoInvestido;

    /**
     * O tempo esperado de estudo na discplina.
     */
    private int tempoEsperado;

    /**
     * Constrói um registro a partir do nome da disciplina.
     * Inicia com tempo esperado de 120 e tempo investido 0.
     *
     * @param nomeDisciplina o nome da disciplina.
     */
    public RegistroTempoOnline (String nomeDisciplina) {
        this.nome = nomeDisciplina;
        this.tempoEsperado = 120;
        this.tempoInvestido = 0;
    }

    /**
     * Constrói um registro a partir do nome da disciplina e tempo online esperado.
     * Inicia com tempo esperado de 120 e tempo investido 0.
     *
     * @param nomeDisciplina o nome da disciplina.
     * @param tempoOnlineEsperado o tempo online esperado.
     */
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nome = nomeDisciplina;
        this.tempoEsperado = tempoOnlineEsperado;
        this.tempoInvestido = 0;
    }

    /**
     * Adiciona tempo online ao registro
     *
     * @param tempo tempo online que será adicionado
     */
    public void adicionaTempoOnline (int tempo) {
        this.tempoInvestido += tempo;
    }

    /**
     * Retorna se foi ou não atingida a meta
     *
     * @return um boolean representando se a meta foi ou não atingida
     */
    public boolean atingiuMetaTempoOnline() {
        return (tempoInvestido >= tempoEsperado);
    }

    /**
     * Retorna a String que representa o registro de tempo online da disciplina
     * A representação segue o formato “NOME_DISCIPLINA TEMPOINVESTIDO/TEMPOESPERADO”.
     *
     * @return a representação em String de um registro.
     */
    @Override
    public String toString() {
        return this.nome + " " + tempoInvestido + "/" + tempoEsperado;
    }

}
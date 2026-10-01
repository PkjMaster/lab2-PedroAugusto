package lab2;

public class RegistroTempoOnline {

    private String nome;

    private int tempoInvestido;

    private int tempoEsperado;

    public RegistroTempoOnline (String nomeDisciplina) {
        this.nome = nomeDisciplina;
        this.tempoEsperado = 120;
        this.tempoInvestido = 0;
    }

    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nome = nomeDisciplina;
        this.tempoEsperado = tempoOnlineEsperado;
        this.tempoInvestido = 0;
    }

    public void adicionaTempoOnline (int tempo) {
        this.tempoInvestido += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return (tempoInvestido >= tempoEsperado);
    }

    public String toString() {
        return this.nome + " " + tempoInvestido + "/" + tempoEsperado;
    }

}
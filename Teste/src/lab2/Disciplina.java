package lab2;

public class Disciplina {

    private String nome;

    private int horasDeEstudo;

    private double[] notas;
    private final int MAX_NOTAS = 4;


    public Disciplina(String nomeDisciplina) {
        this.nome = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[MAX_NOTAS];
    }

    public void cadastraHoras (int horas) {
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
        }

    private double calcMedia(){
        double media = 0;
        for (double nota : this.notas){
            media += nota;
        }
        return media/this.MAX_NOTAS;
    }
    public boolean aprovado() {
        double media = calcMedia();
        return (media >= 7.0);
    }

    public String toString() {
        //PROGRAMACAO 2 4 7.0 [5.0, 6.0, 7.0, 10.0]
        String out = this.nome;
        out += " " + this.horasDeEstudo + " " + calcMedia();
        out += "[";
        for (int i = 0; i < 4; i++){
            if (i != 0){
                out += ", ";
            }
            out += this.notas[i];
        }
        return out;
    }

}
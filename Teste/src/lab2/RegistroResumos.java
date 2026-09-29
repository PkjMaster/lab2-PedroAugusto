package lab2;

public class RegistroResumos {

    private String[][] resumos;
    private int iResumos;
    private int max_resumos;
    private boolean chegouNoMax;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new String[numeroDeResumos][2];
        this.iResumos = 0;
        this.max_resumos = numeroDeResumos;
        this.chegouNoMax = false;
    }

    public void adiciona (String tema, String conteudo) {
        if (this.iResumos == this.max_resumos) {
            this.iResumos = 0;
            this.chegouNoMax = true;
        }
        this.resumos[this.iResumos][0] = tema;
        this.resumos[this.iResumos][1] = conteudo;
        this.chegouNoMax = false;
    }

    public String[] pegaResumos() {
        int len;
        if (this.chegouNoMax){
            len = this.max_resumos;
        }
        else{
            len = this.iResumos;
        }
        String[] out = new String[len];
        for(int i = 0; i < len; i++){
            out[i] = this.resumos[i][0] + ": " + this.resumos[i][1];
        }
        return out;
    }

    public String imprimeResumos() {
        int len = this.conta();
        String out = "";
        out += "- " + len + " resumo(s) cadastrado(s)\n";
        out += "- ";
        for (int i = 0; i < len; i++){
            if (i != 0){out += "| ";}
            out += this.resumos[i][0];
        }
        return out;
    }

    public int conta() {
        int len;
        if (this.chegouNoMax){
            len = this.max_resumos;
        }
        else{
            len = this.iResumos;
        }
        return len;
    }

    public boolean temResumo(String tema) {
        int len = conta();
        for (int i = 0; i < len; i++) {
            if (this.resumos[i][0].equals(tema)) return true;

        }
        return false;
    }

}
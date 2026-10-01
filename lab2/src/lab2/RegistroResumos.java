package lab2;

public class RegistroResumos {

    private Resumo[] resumos;
    private int iResumos;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.iResumos = 0;
    }

    public void adiciona (String tema, String conteudo) {
        this.resumos[this.iResumos%this.resumos.length] = new Resumo(tema, conteudo);
        this.iResumos++;
    }

    public String[] pegaResumos() {
        int len = this.conta();
        String[] out = new String[len];
        for(int i = 0; i < len; i++){
            out[i] = this.resumos[i].toString();
        }
        return out;
    }

    public String imprimeResumos() {
        int len = this.conta();
        String out = "";
        out += "- " + len + " resumo(s) cadastrado(s)\n";
        out += "- ";
        for (int i = 0; i < len; i++){
            if (i != 0){out += " | ";}
            out += this.resumos[i].getTema();
        }
        return out;
    }

    public int conta() {
        int len;
        if (this.iResumos >= this.resumos.length){
            len = this.resumos.length;
        }
        else{
            len = this.iResumos;
        }
        return len;
    }

    public boolean temResumo(String tema) {
        int len = conta();
        for (int i = 0; i < len; i++) {
            if (this.resumos[i].getTema().equals(tema)) return true;

        }
        return false;
    }

}
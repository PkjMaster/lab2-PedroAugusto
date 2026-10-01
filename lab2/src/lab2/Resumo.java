package lab2;

import java.util.Objects;

public class Resumo {

    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getTema(){
        return this.tema;
    }

    public String getConteudo(){
        return this.conteudo;
    }


    @Override
    public String toString(){
        return this.getTema() + ": " + this.getConteudo();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Resumo resumo = (Resumo) o;
        return Objects.equals(tema, resumo.tema) && Objects.equals(conteudo, resumo.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tema, conteudo);
    }
}

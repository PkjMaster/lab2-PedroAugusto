package lab2;

import java.util.Objects;

/**
 * Representação de cada resumo com tema e conteudo.
 *
 * @author Pedro Augusto Alexandrino Santos
 */
public class Resumo {

    /**
     * O tema do resumo.
     */
    private String tema;
    /**
     * O conteudo do resumo.
     */
    private String conteudo;

    /**
     * Constrói um resumo a partir de um tema e seu conteudo.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteudo do resumo
     */
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna uma String contendo o tema.
     *
     * @return o tema.
     */
    public String getTema(){
        return this.tema;
    }

    /**
     * Retorna uma String contendo o conteudo.
     *
     * @return o conteudo.
     */
    public String getConteudo(){
        return this.conteudo;
    }


    /**
     * Retorna a String que representa o resumo. A representação segue o formato “TEMA: Conteudo”.
     *
     * @return a representação em String de um resumo.
     */
    @Override
    public String toString(){
        return this.getTema() + ": " + this.getConteudo();
    }

    /**
     * Compara se dois resumos são iguais.
     *
     * @return um boolean representando se são ou não iguais.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Resumo resumo = (Resumo) o;
        return Objects.equals(tema, resumo.tema);
    }

    /**
     * Retorna um numero inteiro que representa a identidade do resumo
     *
     * @return um numero inteiro que representa a identidade do resumo.
     */
    @Override
    public int hashCode() {
        return Objects.hash(tema, conteudo);
    }
}

public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        // verifica se o texto recebido é nulo ou então vazio,
        // ou seja, sem nenhum caractere, lançando exceção.
        // armazena o texto recebido em this.texto.
        if (texto == "" || texto == null)
            throw new Exception("Texto inválido!");

        this.texto = texto;
    }

    public int getQuantidade (char letra)
    {
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
        int qtd = 0;

        for (int i = 0; i < this.texto.length(); i++)
        {
            if (this.texto.charAt(i) == letra)
                qtd++;
        }

        return qtd;
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.
        int aparicao = 0;

        for (int pos = 0; pos < this.texto.length(); pos++)
        {
            if (this.texto.charAt(pos) == letra)
                aparicao++;

            if (aparicao == i + 1)
                return pos;
        }

        throw new Exception("Posição de ocorrência inválida!");
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj) //tem que ser object para poder ser reinplementado
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        if(this == obj) return true;
        if(obj == null) return false;

        if(obj.getClass() != Palavra.Class) return false;

        Palavra palavra = (Palavra) obj;
        if(this.texto != palavra.texto) return false;

        return true;

    }

    public int hashCode ()
    {
        int ret = 9;

        ret = 11 * 9 + texto.hashCode();

        if (ret < 0)
            ret = -ret;

        return ret;
    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}

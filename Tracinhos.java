public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        // verifica se qtd não é positiva, lançando uma exceção.
        // instancia this.texto com um vetor com tamanho igual qtd.
        // preenche this.texto com underlines (_).

        if (qtd < 0)
            throw new Exception ("Quantidade inválida");

        this.texto = new char[qtd];
        for (int pos = 0; pos < this.texto.length; pos++)
            this.texto[pos] = '_';
    }

    public void revele (int posicao, char letra) throws Exception
    {
        // verifica se posicao é negativa ou então igual ou maior
        // do que this.texto.length, lançando uma exceção.
        // armazena a letra fornecida na posicao tambem fornecida
        // do vetor this.texto
        if (posicao < 0 || posicao >= this.texto.length)
            throw new Exception("Posição inválida!");

        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos ()
    {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
        for (int i = 0; i < this.texto.length; i++)
        {
            if (this.texto[i] == '_')
                return true;
        }

        return false;
    }

    public String toString ()
    {
        // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
        String ret = "";

        for (int i = 0; i < this.texto.length; i++)
        {
            ret += " " + this.texto[i] + " ";
        }

        return ret;
    }

    public boolean equals (Tracinhos obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        for (int i = 0; i < this.texto.length; i++)
        {
            if (!(this.texto[i] == obj.texto[i])) // Se o que estiver naquela posicao de this e de obj for diferente, retornamos false
                return false;
        }

        return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 19;

        ret = 21 * ret + this.texto.hashCode(); //ret = ret * 13 + Arrays.hashCode(this.texto);

        if (ret < 0)
            ret = -ret;

        return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copiar o conteúdo de t.texto para this.texto
        this.texto = new char[t.texto.length];

        for (int pos = 0; pos < t.texto.length; pos++)
            this.texto[pos] = t.texto[pos];
    }

    public Object clone ()
    {
        // retornar uma copia de this
        Tracinhos ret = null;

        try
        {
            ret = new Tracinhos(this);
        }
        catch (Exception erro)
        {}

        return ret;
    }
}

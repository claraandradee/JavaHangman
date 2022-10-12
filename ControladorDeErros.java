public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
		// verifica se qtdMax fornecida n�o � positiva, lan�ando
		// uma exce��o.
		// armazena qtdMax fornecida em this.qtdMax.
        if(qtdMax < 0)
            throw new Exception("Quantidade Invalida!");
        else
            this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception    
    {
        // verifica se this.qtdErr ja � igual a this.qtdMax,
        // lan�ando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
        if(this.qtdErr >= this.qtdMax)
            throw new Exception("Quantidade de erros já é igual a quantidade Máxima"); //lançando caso positivo

        this.qtdErr++; //incrementando em caso negativo
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou ent�o false, caso contrario.
        if(this.qtdErr == this.qtdMax) //se for igual retorna true
            return true;
        else
            return false; //se for diferente retorna false
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (ControladorDeErros obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
        if(this == obj)
            return true;

        if(obj == null)
            return false;

        if(this.qtdErr == obj.qtdErr && this.qtdMax == obj.qtdMax)
            return true;
            
        return false;
    }

    @Override
    public int hashCode() 
    {
        // calcular e retornar o hashcode de this
        int ret = 999;

        ret = ret + 13 * Integer.valueOf(this.qtdErr).hashCode();  //ret = 13 * ret + new Integer (this.qtdErr).hashCode();
        ret = ret + 13 * Integer.valueOf(this.qtdMax).hashCode();  //ret = 13 * ret + new Integer (this.qtdMax).hashCode();

        if(ret < 0)
            ret = -ret;

        return ret;
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de c�pia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
        if(c == null)
            throw new Exception("Erro!");

        this.qtdMax = c.qtdMax;
        this.qtdErr = c.qtdErr;
    }

    public Object clone ()
    {
        // returnar uma c�pia de this
        ControladorDeErros copia = null;

        try
        {
            copia = new ControladorDeErros(this);
        }
        catch(Exception erro) //nenhuma exeção vai acontecer
	    {}

	    return copia;
    }
}

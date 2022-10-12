public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra) 
    {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
        if(this.letrasJaDigitadas != "")
        {
            for(int contador = 0; contador < this.letrasJaDigitadas.length(); contador++){
                if (this.letrasJaDigitadas.charAt(contador)== letra)
                    return true;
            }
        }
        
        return false;
    }

    public void registre (char letra) throws Exception
    {
		// verifica se a letra fornecida ja foi digitada (pode usar
		// o m�todo this.isJaDigitada, para isso), lancando uma exce��o
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
        if(isJaDigitada(letra) == true)
            throw new Exception("Letra já digitada!");
        
            this.letrasJaDigitadas += letra; //concatena a letra fornecidade
        
    }

    @Override
    public String toString ()
    {
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por v�rgula (,).
        String ret = "";

        for (int pos = 0; pos < this.letrasJaDigitadas.length(); pos++)
		    ret += this.letrasJaDigitadas.charAt(pos) + ",";

        return ret;
    }

    public boolean equals (ControladorDeLetrasJaDigitadas obj)   
    {
        // verificar se this e obj s�o iguais
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.letrasJaDigitadas == obj.letrasJaDigitadas)
            return true;
        
        return false;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 999;

        ret = ret + 13 * String.valueOf(this.letrasJaDigitadas).hashCode();  //ret = 7*ret + new String(this.letrasJaDigitadas).hashCode();

        if(ret < 0)
            ret = -ret;

        return ret;
    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de c�pia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        if(controladorDeLetrasJaDigitadas == null)
            throw new Exception("Erro!");

        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    public Object clone ()
    {
        // criar uma c�pia do this com o construtor de c�pia e retornar
        ControladorDeLetrasJaDigitadas copia = null;

        try
        {
            copia = new ControladorDeLetrasJaDigitadas(this);
        }
        catch(Exception erro) //nenhuma exeção vai acontecer
	    {}

	    return copia;
    }
}

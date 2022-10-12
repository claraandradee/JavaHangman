
public class Main
{
	public static void main(String[] args) {

        BancoDePalavras b = new BancoDePalavras();
        
        // Testando o método getPalavraSorteada
        for (int contador = 0; contador < 12; contador++)
        {
            System.out.println(b.getPalavraSorteada());
        }

	}
}

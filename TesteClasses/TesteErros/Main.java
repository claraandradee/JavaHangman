public class Main
{
    public static void main(String[] args)
    {
        try
        {
            //teste do construtor
            ControladorDeErros teste = new ControladorDeErros(5);
            
            //teste no isAtingidoMaximoDeErros
            System.out.println(teste.isAtingidoMaximoDeErros());
            
            //teste no toString
            System.out.println(teste.toString());
            
            //teste no equals
            ControladorDeErros teste1 = new ControladorDeErros(5);
            System.out.println(teste.equals(teste1));


            ControladorDeErros teste2 = new ControladorDeErros(7);
            System.out.println(teste.equals(teste2));
            
            //teste no hashCode
            System.out.println(teste.hashCode());

            ControladorDeErros teste3 = new ControladorDeErros(5);
            System.out.println(teste3.hashCode());

            ControladorDeErros teste4 = new ControladorDeErros(7);
            System.out.println(teste4.hashCode());
        }
        catch(Exception erro)
        {
             System.out.println(erro.getMessage());
        }
    }
}
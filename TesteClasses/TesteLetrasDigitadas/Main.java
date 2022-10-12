public class Main
{
    public static void main(String[] args)
    {
        try
        {
            //teste do construtor
            ControladorDeLetrasJaDigitadas teste = new ControladorDeLetrasJaDigitadas();
            
            //teste no isJaDigitada
            System.out.println(teste.isJaDigitada('A'));
            
            //teste no toString
            System.out.println(teste.toString());
            
            //teste no equals
            ControladorDeLetrasJaDigitadas teste1 = new ControladorDeLetrasJaDigitadas();
            System.out.println(teste.equals(teste1));


            ControladorDeLetrasJaDigitadas teste2 = new ControladorDeLetrasJaDigitadas();
            System.out.println(teste.equals(teste2));
            
            //teste no hashCode
            System.out.println(teste.hashCode());

            ControladorDeLetrasJaDigitadas teste3 = new ControladorDeLetrasJaDigitadas();
            System.out.println(teste3.hashCode());

            ControladorDeLetrasJaDigitadas teste4 = new ControladorDeLetrasJaDigitadas();
            System.out.println(teste4.hashCode());
        }
        catch(Exception erro)
        {
             System.out.println(erro.getMessage());
        }
    }
}


public class Main
{
    public static void main(String[] args)
    {
        try
        {
            // Teste no construtor
            Palavra p = new Palavra("COMPUTADOR");


            // Teste no método getQuantidade
            System.out.println(p.getQuantidade('O'));


            // Teste no método getPosicaoDaIezimaOcorrencia
            System.out.println(p.getPosicaoDaIezimaOcorrencia(0, 'O'));


            // Teste no método getTamanho
            System.out.println(p.getTamanho());


            // Teste no método toString
            System.out.println(p.toString());


            // Teste no método equals
            Palavra p1 = new Palavra("MESA");
            System.out.println(p.equals(p1));


            Palavra p2 = new Palavra("COMPUTADORA");
            System.out.println(p.equals(p2));


            // Teste no método hashCode
            System.out.println(p.hashCode());

            Palavra p3 = new Palavra("COMPUTADOR");
            System.out.println(p3.hashCode());

            Palavra p4 = new Palavra("MESA");
            System.out.println(p4.hashCode());


            // Teste no método compareTo
            Palavra p5 = new Palavra("MESA");
            System.out.println(p.compareTo(p5));
            if (p.compareTo(p5) < 0)
                System.out.println("Diferente");
            else if (p.compareTo(p5) == 0)
                System.out.println("Igual");


            Palavra p6 = new Palavra("COMPUTADOR");
            System.out.println(p.compareTo(p6));
            if (p.compareTo(p6) < 0)
                System.out.println("Diferente");
            else if (p.compareTo(p6) == 0)
                System.out.println("Igual");

        }
        catch (Exception erro)
        {
            System.out.println(erro.getMessage());
        }
    }
}
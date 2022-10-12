
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            // Teste no construtor
            Tracinhos t = new Tracinhos(10);

            // Teste no método revele
            t.revele(0,'C');

            // Teste no método isAindaComTracinhos
            System.out.println(t.isAindaComTracinhos());

            // Teste no método toString
            System.out.println(t.toString());

            t.revele(1,'O');
            t.revele(3,'P');
            t.revele(5,'T');
            t.revele(6,'A');

            System.out.println(t.toString());
            System.out.println(t.isAindaComTracinhos());


            // Teste no método equals
            Tracinhos t2 = new Tracinhos(10);

            t2.revele(0,'C');
            t2.revele(1,'O');
            t2.revele(3,'P');
            t2.revele(5,'T');
            t2.revele(6,'A');

            System.out.println(t.equals(t2));


            Tracinhos t3 = t;
            System.out.println(t.equals(t3));


            // Teste no método hashCode
            System.out.println(t.hashCode());

            Tracinhos t4 = new Tracinhos(11);
            System.out.println(t4.hashCode());


            // Teste no Construtor de cópia
            Tracinhos t5 = new Tracinhos (t);
            System.out.println(t);
            System.out.println(t5);

            // Teste no método Clone
            Tracinhos t6 = (Tracinhos) t.clone();
            System.out.println(t);
            System.out.println(t6);

        }
        catch (Exception erro)
        {
            System.out.println(erro.getMessage());
        }
    }
}
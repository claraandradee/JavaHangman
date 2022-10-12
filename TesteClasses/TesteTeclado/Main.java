
public class Main
{
	public static void main(String[] args) 
	{
	    try
	    {
    		System.out.println("String: ");
    		System.out.println(Teclado.getUmString());
    		
    		System.out.println("Byte: ");
    		System.out.println(Teclado.getUmByte());
    		
    		System.out.println("Short: ");
    		System.out.println(Teclado.getUmShort());
    		
    		System.out.println("Int: ");
    		System.out.println(Teclado.getUmInt());
    		
    		System.out.println("Long: ");
    		System.out.println(Teclado.getUmLong());
    		
    		System.out.println("Float: ");
    		System.out.println(Teclado.getUmFloat());
    		
    		System.out.println("Double: ");
    		System.out.println(Teclado.getUmDouble());
    		
    		System.out.println("Char: ");
    		System.out.println(Teclado.getUmChar());
    		
    		System.out.println("Boolean: ");
    		System.out.println(Teclado.getUmBoolean());
	    }
	    catch (Exception erro)
	    {
	        System.out.println(erro.getMessage());
	    }
		
	}
}

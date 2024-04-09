package holamundojava;

public class TiposPrimitivos {

        public static void main(String args[]) {
            /*
                tipos primitivos enteros: byte, short, char, int, long
            */
            byte numeroByte = 10;
            System.out.println("numeroByte = " + numeroByte);
            System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
            System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
            
            short numeroShort = 15;
            System.out.println("numeroShort = " + numeroShort);
            System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
            System.out.println("Valor maximo de short: " + Short.MAX_VALUE);
            
            char caracterChar = 'a';
            System.out.println("caracterChar = " + caracterChar);
            System.out.println("Valor minimo de char: " + Character.MIN_VALUE);
            System.out.println("Valor maximo de char: " + Character.MAX_VALUE);
            
            int numeroInt = 20;
            System.out.println("numeroInt = " + numeroInt);
            System.out.println("Valor minimo de int " + Integer.MIN_VALUE);
            System.out.println("Valor maximo de int " + Integer.MAX_VALUE);
            
            long numeroLong = 30;
            System.out.println("numeroLong = " + numeroLong);
            System.out.println("Valor minimo de long " + Long.MIN_VALUE);
            System.out.println("Valor maximo de long " + Long.MAX_VALUE);
            
            //Tipos primitivos tipo flotante
            float numertoFloat = (float) 5.5;
            System.out.println("numertoFloat = " + numertoFloat);
    }
}

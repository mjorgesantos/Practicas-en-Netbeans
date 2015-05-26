import java.util.Scanner;
public class cosina 
{
    public static void main (String []args)
    {
        String opcion;
        Scanner leer = new Scanner (System.in);
        do {
            System.out.println("1: consome");
            System.out.println("2: sopa");
            System.out.println("3: postre");
            System.out.println("4: Bebida");
            System.out.println("5: salir");
            opcion = leer.nextLine();
            if(opcion.equals("1"))
            {
                System.out.println("1: pollo");
                System.out.println("2: borrego");
                System.out.println("3: res");
                System.out.println("4: ninguno");
                opcion = leer.nextLine();
                if(opcion.equals("1"))
                {
                    System.out.println("mmmmmmm pollo");
                }
                else if (opcion.equals("2"))
                {
                    System.out.println("Falta la barbacoa");
                }
                else if (opcion.equals("3"))
                {
                    System.out.println("molito de olla");
                }
            }
            if(opcion.equals("2"))
            {
                System.out.println("1: pspaguetti");
                System.out.println("2: fideos");
                System.out.println("3: arroz");
                System.out.println("4: ninguno");
                opcion = leer.nextLine();
                if(opcion.equals("1"))
                {
                    System.out.println("mmammma mia");
                }
                else if (opcion.equals("2"))
                {
                    System.out.println("Fideitos");
                }
                else if (opcion.equals("3"))
                {
                    System.out.println("molito de molito");
                }
            }
             if(opcion.equals("3"))
            {
                System.out.println("1:gelatinaa");
                System.out.println("2: fresas con crema ");
                System.out.println("3: fruta");
                System.out.println("4: ninguno");
                opcion = leer.nextLine();
                if(opcion.equals("1"))
                {
                    System.out.println("hace falta arroz");
                }
                else if (opcion.equals("2"))
                {
                    System.out.println("mmmmmmmm rico");
                }
                else if (opcion.equals("3"))
                {
                    System.out.println("yea res");
                }
            }
            if(opcion.equals("4"))
            {
                System.out.println("1: agua natural");
                System.out.println("2: Refresco");
                System.out.println("3: Cafe");
                System.out.println("4: ninguno");
                if(opcion.equals("1"))
                {
                    System.out.println("que bien");
                }
                else if (opcion.equals("2"))
                {
                    System.out.println("buna opcion");
                }
                else if (opcion.equals("3"))
                {
                    System.out.println("un refresco por  favor");
                }
            }
        }while(opcion.equals("s") || opcion.equals("S"));
    }
}
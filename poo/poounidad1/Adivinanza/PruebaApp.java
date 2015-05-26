public class PruebaApp {
 
    public static void main(String[] args) {
 
        int num1=50;
        int num2=120;
 
        System.out.println("Números generados entre 0 y 20, con decimales");
        for (int i=0;i<1000;i++){
            double numAleatorio=Math.random()*20;
            System.out.println(numAleatorio);
        }
 
        System.out.println("Números generados entre 5 y 20, con decimales");
        for (int i=0;i<1000;i++){
            double numAleatorio=Math.random()*(20-5)+5;
            System.out.println(numAleatorio);
        }
 
        System.out.println("Números generados entre 50 y 120, sin decimales");
        for (int i=0;i<1000;i++){
            int numAleatorio=(int)Math.floor(Math.random()*(num2-num1)+num1);
            System.out.println("terminado"+numAleatorio);
        }
    }
 
}
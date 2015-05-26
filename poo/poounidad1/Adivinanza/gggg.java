import java . AWT . evento . ActionEvent ; 
import java . AWT . evento . ActionListener ; 
import java . util . aleatoria ;



público  de clase  TimerExample  { 
    Random rand =  nueva  Random (); 
    estático  int currRand ;

    TimerExample ()  { 
        currRand = rand . nextInt ( 99 ); 
        ActionListener actionListener =  new  ActionListener ()  { 
            public  void actionPerformed ( ActionEvent actionEvent )  { 
                currRand = rand . nextInt ( 99 ); 
            } 
        }; 
        Timer timer =  new  Timer ( 2000 , actionListener ); 
        timer . start (); 
    }

    public  static  void main ( String args [])  throws  InterruptedException  { 
        TimerExample te =  new  TimerExample (); 
        while (  true  )  { 
            Thread . currentThread (). sleep ( 500 ); 
            System . out . println ( "current valor: "  + currRand ); 
        } 
    } 
}
import java . util . Timer ; 
import java . util . TimerTask ;

público  de clase TimerClass { 
    públicas  estáticas  void principales ( Cadena [ ] args )  {

    Timer timer =   nueva Timer ( ) ;

    int HoraInicio = 10000 ;  / / milisegundo 10 segundos = 10000 
    int delayTime = 1,000 ;  / / milisegundo 1 segundo 
     temporizador . horario ( nueva TimerTask ( ) 
       { 
        público  void run ( )  { 
         System . cabo . println ( "instrucción repeat Timer" ) ; 
        } 
      } , HoraInicio , delayTime ) ;

    } 
}
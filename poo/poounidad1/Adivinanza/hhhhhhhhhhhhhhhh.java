import java . util . Timer ; 
import java . util . TimerTask ;

p�blico  de clase TimerClass { 
    p�blicas  est�ticas  void principales ( Cadena [ ] args )  {

    Timer timer =   nueva Timer ( ) ;

    int HoraInicio = 10000 ;  / / milisegundo 10 segundos = 10000 
    int delayTime = 1,000 ;  / / milisegundo 1 segundo 
     temporizador . horario ( nueva TimerTask ( ) 
       { 
        p�blico  void run ( )  { 
         System . cabo . println ( "instrucci�n repeat Timer" ) ; 
        } 
      } , HoraInicio , delayTime ) ;

    } 
}
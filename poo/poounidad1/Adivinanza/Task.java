público  de clase  Prueba1  { 
    static  Timer temporizador =  nueva  Timer ();

    static  class  Task  extends  TimerTask  { 
        @Override 
        public  void run ()  { 
            int delay =  ( 5  +  new  Random (). nextInt ( 5 ))  *  1000 ; 
            timer . schedule ( new  Task (), delay ); 
            System . out . println ( new  Date ()); 
        }

    }

    públicas  estáticas  void principales ( Cadena [] args )  lanza  la excepción  { 
        nueva  tarea (). correr (); 
    } 
}
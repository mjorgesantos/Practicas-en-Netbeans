
import java.util.concurrent.Executors;
 import java.util.concurrent.ScheduledExecutorService;
 import java.util.concurrent.ScheduledFuture;
 import java.util.concurrent.TimeUnit;

p�blico  �ltima  clase AlarmClock {
  
  / ** Ejecute el ejemplo. * / 
  p�blico  est�tico  vac�o principal (String. .. aArgs) tiros InterruptedException {
    log ( "empez� principal." );
    AlarmClock despertador = nueva AlarmClock ( 3 , 1 , 20 );
    alarmClock.activateAlarmThenStop ();
    / *
    Para iniciar la alarma a una fecha espec�fica en el futuro, el retraso inicial
    debe ser calculada con respecto a la hora actual, como en: 
    Fecha futureDate = ...
    largo horaInicio = futureDate.getTime () - System.currentTimeMillis ();
    Alarm = new AlarmClock (horaInicio, 1, 20);
    Esto s�lo funciona si el reloj del sistema no se restablece.
    * / 
    log ( "termin� principal." );
  }
  
  AlarmClock ( largo aInitialDelay, largas aDelayBetweenBeeps, larga aStopAfter) {
    fInitialDelay = aInitialDelay;
    fDelayBetweenRuns = aDelayBetweenBeeps;
    fShutdownAfter = aStopAfter;
    fScheduler = Executors.newScheduledThreadPool (NUM_THREADS);    
  }
  
  / ** Haga sonar la alarma durante unos segundos, y luego se detiene. * / 
  void activateAlarmThenStop () {
    Ejecutable soundAlarmTask = nueva SoundAlarmTask ();
    ScheduledFuture <?> SoundAlarmFuture = fScheduler.scheduleWithFixedDelay (
      soundAlarmTask, fInitialDelay, fDelayBetweenRuns, TimeUnit.SECONDS
    );
    StopAlarm Ejecutable = nueva StopAlarmTask (soundAlarmFuture);
    fScheduler.schedule (stopAlarm, fShutdownAfter, TimeUnit.SECONDS);
  }

  / / PRIVADA 
   privado  definitiva ScheduledExecutorService fScheduler;
   private  final  long fInitialDelay;
   private  final  long fDelayBetweenRuns;
   private  final  long fShutdownAfter;
  
  privada  est�tica  void log (String amsg) {
    System.out.println (amsg);
  }

  / ** Si invocaciones podr�an solaparse, se puede especificar m�s de un solo hilo * /.  
  privadas  est�ticas  finales  int NUM_THREADS = 1 ;
   privada  est�tica  �ltima  boolean DONT_INTERRUPT_IF_RUNNING = false ;
  
  privada  est�tica  �ltima  clase SoundAlarmTask implementa Ejecutable {
     @ Override  p�blico  void run () {
      + + FCOUNT;
      log ( "bip" + FCOUNT);
    }
    privada  int FCOUNT;
  }
  
  privada  �ltima  clase StopAlarmTask implementa Ejecutable {
    StopAlarmTask (ScheduledFuture <?> ASchedFuture) {
      fSchedFuture = aSchedFuture;
    }
    @ Override  p�blico  void run () {
      log ( "Detenci�n de la alarma." );
      fSchedFuture.cancel (DONT_INTERRUPT_IF_RUNNING);
      / * 
       Tenga en cuenta que esta tarea tambi�n se realiza la limpieza, pidiendo al 
       planificador para apagar con gracia. 
      * /
      fScheduler.shutdown ();
    }
    privado ScheduledFuture fSchedFuture <>;
  }
} 


import java.util.concurrent.Executors;
 import java.util.concurrent.ScheduledExecutorService;
 import java.util.concurrent.ScheduledFuture;
 import java.util.concurrent.TimeUnit;

público  última  clase AlarmClock {
  
  / ** Ejecute el ejemplo. * / 
  público  estático  vacío principal (String. .. aArgs) tiros InterruptedException {
    log ( "empezó principal." );
    AlarmClock despertador = nueva AlarmClock ( 3 , 1 , 20 );
    alarmClock.activateAlarmThenStop ();
    / *
    Para iniciar la alarma a una fecha específica en el futuro, el retraso inicial
    debe ser calculada con respecto a la hora actual, como en: 
    Fecha futureDate = ...
    largo horaInicio = futureDate.getTime () - System.currentTimeMillis ();
    Alarm = new AlarmClock (horaInicio, 1, 20);
    Esto sólo funciona si el reloj del sistema no se restablece.
    * / 
    log ( "terminó principal." );
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
  
  privada  estática  void log (String amsg) {
    System.out.println (amsg);
  }

  / ** Si invocaciones podrían solaparse, se puede especificar más de un solo hilo * /.  
  privadas  estáticas  finales  int NUM_THREADS = 1 ;
   privada  estática  última  boolean DONT_INTERRUPT_IF_RUNNING = false ;
  
  privada  estática  última  clase SoundAlarmTask implementa Ejecutable {
     @ Override  público  void run () {
      + + FCOUNT;
      log ( "bip" + FCOUNT);
    }
    privada  int FCOUNT;
  }
  
  privada  última  clase StopAlarmTask implementa Ejecutable {
    StopAlarmTask (ScheduledFuture <?> ASchedFuture) {
      fSchedFuture = aSchedFuture;
    }
    @ Override  público  void run () {
      log ( "Detención de la alarma." );
      fSchedFuture.cancel (DONT_INTERRUPT_IF_RUNNING);
      / * 
       Tenga en cuenta que esta tarea también se realiza la limpieza, pidiendo al 
       planificador para apagar con gracia. 
      * /
      fScheduler.shutdown ();
    }
    privado ScheduledFuture fSchedFuture <>;
  }
} 

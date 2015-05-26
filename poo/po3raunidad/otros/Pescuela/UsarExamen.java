 

public class UsarExamen{


    public static void main(String[] args) {
   Carrera lis= new Carrera();
   lis.setCvecarrera("OII444");
   lis.setNombcarrera("COMPUTACION");

   Materia prog= new Materia();
   prog.setCveMateria("LLL2222");
   prog.setNombMateria("POO");

   lis.setMateria(prog);

   Alumno alum1= new Alumno("2010mgmm","Rafael","Montero Rojas");

   prog.setAlumno(alum1);

   Extraordinario ex= new Extraordinario();
   ex.setMaestro("Jorge"); 
   ex.setAula("CC5"); 
   ex.setFechaInsc(28022010);
   ex.setFechaEx(15032010);
   ex.setHora("10:30");

   System.out.println("*******Examen Extraudinario*******");

   System.out.println("ALUMNO:"+alum1.getNombre()+alum1.getApellidos());
   System.out.println("CARRERA:"+lis.getNombcarrera());
   System.out.println("MATERIA:"+prog.getNombMateria()+"CLAVE MATERIA"+prog.getNombMateria());

   System.out.println("HORA:"+ex.getHora());
   System.out.println("FECHA DE INSCRIPCION A EXAMEN:"+ex.getFechaInsc());
   System.out.println("FECHA PRESENTACION DE EXAMEN:"+ex.getFechaEx());
   System.out.println("AULA:"+ex.getHora());
   System.out.println("MAESTRO QUE APLICA EL EXAMEN:"+ex.getMaestro());
System.out.println("Trabajo Echo por Jorge Santos Marquez  y Garcia Juarez Julian");



  }
}

 







public class Alumno {

  private String matricula;
  private String nombre;
  private String apellidos;
  private Materia materia;
  private Carrera carrera;
 public Alumno(){}

 public Alumno(String mat, String nomb, String apes){
    matricula= mat; nombre= nomb;apellidos=apes;
}
  public String getMatricula(){return matricula;}

  public void setMatricula(String matricula){this.matricula= matricula;}

  public String getNombre(){return nombre;}

  public void setNombre(String nombre){this.nombre= nombre;}


  public String getApellidos(){return apellidos;}

  public void setApellidos(String apellidos){this.apellidos= apellidos;}

  public Materia getMateria(){ return materia;}

  public void setMateria(Materia materia){this.materia= materia;}

  public Carrera getCarrera(){return carrera;}

  public void setCarrera(Carrera carrera){this.carrera= carrera;}




}
public class Operacion
{
    float valor1, valor2, resultado;
    String operacion;
  //-------------------------------------
  //Se inician metodos predefinidos
    public Operacion(float valor1, float valor2, String operacion)
    {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacion = operacion;
    }    
    public void setValor1(float nuevoValor1)
    {
        valor1 = nuevoValor1;
    }
    public float getValor1()
    {
        return valor1;
    }
    public void setValor2(float nuevoValor2)
    {
        valor2 = nuevoValor2;
    }
    public float getValor2()
    {
        return valor2;
    }
    public void setOperacion(String nuevaOperacion)
    {
        operacion = nuevaOperacion;
    }
    public String getOperacion()
    {
        return operacion;
    } 
  //Inician los metodos asociados a las operaciones  
    public float suma()
    {
        resultado = valor1 + valor2;
        return resultado;
    }
    public float resta()
    {
        resultado = valor1 - valor2;
        return resultado;
    }
}

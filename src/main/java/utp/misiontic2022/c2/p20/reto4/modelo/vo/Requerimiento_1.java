package utp.misiontic2022.c2.p20.reto4.modelo.vo;

public class Requerimiento_1 {
    // Mi código
    //Nombre, Primer_Apellido ,Segundo_Apellido ,Salario
    private String Nombre;
    private String Primer_Apellido;
    private String Segundo_Apellido;
    private Integer Salario;

    public Requerimiento_1(){
    }
    public Requerimiento_1(String nombre,String primer_Apellido,
    String segundo_Apellido,Integer salario ){  
        this.Nombre=nombre;
        this.Primer_Apellido=primer_Apellido;
        this.Segundo_Apellido=segundo_Apellido;
        this.Salario=salario;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }
    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido) {
        Segundo_Apellido = segundo_Apellido;
    }
    public Integer getSalario() {
        return Salario;
    }
    public void setSalario(Integer salario) {
        Salario = salario;
    }
  
        
}  

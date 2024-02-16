
import java.util.Date;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Michael Martínez
 */
public class empleado extends usuarios  {
    String carrera, puestoLaboral;
    int añosTrabajando;

    public empleado(String carrera, String puestoLaboral, int añosTrabajando, String nombre, String apellido, String contraseña, String sexo, String departamento, String identidad, Date nacimiento) {
        super(nombre, apellido, contraseña, sexo, departamento, identidad, nacimiento);
        this.identidad=setIdentidad();
        this.carrera = carrera;
        this.puestoLaboral = puestoLaboral;
        this.añosTrabajando = añosTrabajando;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public int getAñosTrabajando() {
        return añosTrabajando;
    }

    public void setAñosTrabajando(int añosTrabajando) {
        this.añosTrabajando = añosTrabajando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public String setIdentidad() {
        this.identidad = id();
        return this.identidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "empleado{" + "carrera=" + carrera + ", puestoLaboral=" + puestoLaboral + ", a\u00f1osTrabajando=" + añosTrabajando + '}';
    }

    @Override
    String id() {
        Random random=new Random();
        String id="";
        if (departamento.equalsIgnoreCase("Francisco Morazán")) {
            int numero1=random.nextInt(0,3);
            id+="01"+numero1;
            int numero2=random.nextInt(0,10);
            id+=numero2+"-";
        }else if(departamento.equalsIgnoreCase("Comayagua")){
            int numero1=random.nextInt(0,3);
            id+="03"+numero1;
            int numero2=random.nextInt(0,2);
            id+=numero2+"-";
        }else if(departamento.equalsIgnoreCase("Cortés")){
            int numero1=random.nextInt(0,2);
            id+="02"+numero1;
            int numero2=random.nextInt(0,3);
            id+=numero2+"-";
        }else{
            id="0000-";
        }
        id+=nacimiento.getYear()+"-";
        double ultimo=random.nextDouble(10000,40000);
        id+=ultimo;
        return id;
    }
    
    
    

    
    
}

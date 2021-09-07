package stable_matching_grupo02_esd115;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 * 
 */
/**
Esta es la clase Estudiante. La que nos servirá como estructura para crear 
los conjuntos del tipo Estudiante. Creamos los atributos de lo que caracteriza
una empresa y los metodos para manejar la informacion de sus propiedades.
Acá hemos creado además de los métodos Getters y Setters unos métodos adicionales
que permitirán controlar o mejor dicho, elegir, la empresa , solo el nombre, las preferencias las tienen
que elegir dependiendo de sus gustos, la forma de elegir es diferente a la de la empresa. 
NOTA: NO CONFUNDIR CON EL METODO EJECUTAR ASIGNACION CON EL DE LA CLASE
STABLE_MATCHING, PORQUE ESE HARÁ EL EMPAREJAMIENTO TOMANDO EN CUENTA LAS PREFERENCIAS
DE AMBOS CONJUNTOS, Y EL DE ESTA CLASE SOLO AGREGA LAS PREFERENCIAS AL ATRIBUTO DE 
LA MISMA CLASE "ESTUDIANTE" QUE INICIALMENTE ESTÁ VACÍO.
Dicho esto entonces procedo a documentar cada metodo.
*/

public class ESTUDIANTE {
    
    //*********Atributos*********
    
    private String nombre;
    private String carnet;
    private String carrera;
    private Boolean experiencia;
    private ArrayList<String> preferencias;
    private String telefono ;
    private String direccion;
    private int edad;
    private float cum;
    
    
    //*********Constructor*********
    
    public ESTUDIANTE(String nom, String due, String carr, Boolean expe,float cum,String tel,String dir,int Edad){
        
        this.nombre = nom;
        this.carnet = due;
        this.carrera = carr;
        this.experiencia = expe;
        this.telefono = tel;
        this.direccion = dir;
        this.edad = Edad;
        this.cum = cum;
    
    }
      
    //*********Getters & Setters*********

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Boolean getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Boolean experiencia) {
        this.experiencia = experiencia;
    }

    public ArrayList<String> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(ArrayList<String> preferencias) {
        this.preferencias = preferencias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getCum() {
        return cum;
    }

    public void setCum(float cum) {
        this.cum = cum;
    }

    public void setEdad(int Edad) {
        this.edad =  Edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //*********Metodos de la clase********* 
        
     public ArrayList<String> agregarPreferencias(ArrayList<EMPRESA> empresas){
          ArrayList<String> pref = new ArrayList<>();
          int p = (int) (Math.random() * 8) + 0;
          for (int i = 0, k = 0; (i < empresas.size()) && k<3 ; i++) {
              if (p >=0 && p <=16) {
                  if(empresas.get(i).getDireccion().equals(this.direccion)){
                   
                        pref.add(k,empresas.get(i).getNombre());
                        k++;
                        if (p==0) {
                          p++;
                        }
                        p--;
                  }  
                  
              }
                  
                                         
         }                   
         return pref;
     }
    
    
}

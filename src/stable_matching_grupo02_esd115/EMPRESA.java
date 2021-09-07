
package stable_matching_grupo02_esd115;
//import algoritmoshapley.pruebaimple1.ESTUDIANTE;
import java.util.ArrayList;

/**
Esta es la clase Empresa. La que nos servirá como estructura para crear 
los conjuntos del tipo Empresa. Creamos los atributos de lo que caracteriza
una empresa y los metodos para manejar la informacion de sus propiedades.
Acá hemos creado además de los métodos Getters y Setters unos métodos adicionales
que permitirán controlar o mejor dicho, elegir, el mejor estudiante para cada empresa
es decir, las preferencias las tienen que elegir dependiendo de sus condiciones o
exigencias. NOTA: NO CONFUNDIR CON EL METODO EJECUTAR ASIGNACION CON EL DE LA CLASE
STABLE_MATCHING, PORQUE ESE HARÁ EL EMPAREJAMIENTO TOMANDO EN CUENTA LAS PREFERENCIAS
DE AMBOS CONJUNTOS, Y EL DE ESTA CLASE SOLO AGREGA LAS PREFERENCIAS AL ATRIBUTO DE 
LA MISMA CLASE "EMPRESA" QUE INICIALMENTE ESTÁ VACÍO.
Dicho esto entonces procedo a documentar cada metodo.
*/


public class EMPRESA {
     private String nombre;
     private String profesionRequerida; //Atributo que guarda la profesion que necesitan aceptar en la practica
     private Boolean plazaDisponible; //Devuelve si ya aceptaron o no a uno. Se usará al momento de hacer las parejas
     private Boolean experienciaRequerida;
     private int edadReq;
     private ArrayList<String> preferencias; //Guarda los alumnos de su preferencia (una lista que haremos que solo reciba 3. Solo guardará los nombres porque será más facil trabajar la seleccion así
     private String telefono;
     private String direccion;
   
    //Constructor
    public EMPRESA(String nom,String profesionReque, Boolean plazaDis,Boolean expReq, String tel,String dir, int edadRequerida){
        
        this.nombre = nom;
        this.profesionRequerida = profesionReque;        
        this.plazaDisponible = plazaDis;
        this.experienciaRequerida = expReq;
        this.direccion = dir;
        this.telefono = tel;
        this.edadReq = edadRequerida;
         
    }

    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesionRequerida() {
        return profesionRequerida;
    }

    public void setProfesionRequerida(String profesionRequerida) {
        this.profesionRequerida = profesionRequerida;
    }

    public Boolean getPlazaDisponible() {
        return plazaDisponible;
    }

    public void setPlazaDisponible(Boolean plazaDisponible) {
        this.plazaDisponible = plazaDisponible;
    }

    public Boolean getExperienciaRequerida() {
        return experienciaRequerida;
    }

    public void setExperienciaRequerida(Boolean experienciaRequerida) {
        this.experienciaRequerida = experienciaRequerida;
    }

    public int getEdadReq() {
        return edadReq;
    }

    public void setEdadReq(int edadReq) {
        this.edadReq = edadReq;
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
   
    
    
    //*********Metodos de la clase*******
 
    //Metodo que hace la seleccion del nombre del estudiante del cual ha pasado todas las exigencias de la empresa.  
    
    //AVISO DE EDICION HORA: 8:33 AM
    //Man, creo que no podemos hacer que las empresas elijan diferente. Es que los criterios están más que obvios. Creo
    //que lo que podemos hacer es que las preferencias de los alumnos sean random, para que no sean los mismos "caminos"
    //Eso creo que vamos a tener que editar, te lo envío hasta acá porque ya en 3 minutos vence el internet. Buxo. 
    //Mas tarde me conecto
     public ArrayList<String> agregarPreferencias(ArrayList<ESTUDIANTE> estudiantes, int edadReq){
        ArrayList<String> pref = new ArrayList<>();
        
         for (int i = 0, k = 0; (i < estudiantes.size()) && k<3 ; i++) {
             
              if(estudiantes.get(i).getCarrera().equals(getProfesionRequerida())){
                  if(estudiantes.get(i).getExperiencia().equals(this.getExperienciaRequerida())){
                      if (estudiantes.get(i).getEdad()==edadReq) {
                          pref.add(k,estudiantes.get(i).getNombre());
                          k++;
                      }
                  }
                  else{
                      if (estudiantes.get(i).getEdad() >= 25 || estudiantes.get(i).getDireccion().equals(this.getDireccion())) {
                          pref.add(k,estudiantes.get(i).getNombre());
                          k++;
                      }
                  }
                  
              }                          
         }  
    
        return pref; 
     }
           
}

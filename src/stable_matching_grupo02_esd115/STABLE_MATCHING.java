/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * 
 */
package stable_matching_grupo02_esd115;

import java.util.Arrays;

/**

 * @author W7LBL   
 */
import java.util.ArrayList;


public class STABLE_MATCHING {
    /**
    //ESTUDIANTE(nombre,carrera, exp, cum, numero, lugar, añoNac)
    //EMPRESA( nombre, tipo , plaza, requExp, numero, lugar)
   */    
    //*********Conjuntos********* 
    
    ArrayList <ESTUDIANTE> estd = new ArrayList<ESTUDIANTE>();
    ArrayList <EMPRESA> emp = new ArrayList<EMPRESA>();
    int[][] matrizAdy; //Matriz de Adyacencia

    
        
    public STABLE_MATCHING(){
             
    //*********Creando los objetos del conjunto ESTUDIANTE*********
    
    estd.add( new ESTUDIANTE("Juan", "JL08001", "Ing. de Sistemas Informaticos",true,8.1f,"61756366","Quezaltepeque",generarEdad()));//SISTEMAS1
    estd.add( new ESTUDIANTE("Marcos","MD09128","Ing. Electrica",false,7.1f,"6309-1234","San Salvador",generarEdad()));//ELECTRICA1
    estd.add( new ESTUDIANTE("Luis","LS12011","Ing. Civil",true,7.9f,"7106-1245","Soyapango",generarEdad()));//CIVIL1
    estd.add( new ESTUDIANTE("Iliana","JP10002","Ing. Industrial",false,7.3f,"7356-8932","Santa Tecla",generarEdad()));//INDUSTRIAL1
    estd.add( new ESTUDIANTE("Carlos","CG11894","Ing. de Sistemas Informaticos",true,6.2f,"7412-5693","Quezaltepeque",generarEdad()));//SISTEMAS2
    estd.add( new ESTUDIANTE("Diego","SL12001","Ing. Industrial",false,8.4f,"7812-3452","Santa Tecla",generarEdad()));//INDUSTRIAL2
    estd.add( new ESTUDIANTE("Karla","PQ10013","Ing. Electrica",true,8.9f,"7644-8195","Soyapango",generarEdad()));//ELECTRICA2
    estd.add( new ESTUDIANTE("Marta","BR09123","Ing. Industrial",false,7.1f,"7154-3421","San Jacinto",generarEdad()));//INDUSTRIAL3
    estd.add( new ESTUDIANTE("Mario","TL09024","Ing. Civil",true,7.6f,"6245-8745","San Jacinto",generarEdad()));//CIVIL2
    estd.add( new ESTUDIANTE("Liliana","LB09002","Ing. Industrial",false,9.2f,"7705-7447","Soyapango",generarEdad()));//INDUSTRIAL4
    estd.add( new ESTUDIANTE("Kelvin","PM12006","Ing. Electrica",true,7.1f,"6206-8774","Ilopango",generarEdad()));//ELECTRICA3
    estd.add( new ESTUDIANTE("Lesly","HE10003","Ing. de Sistemas Informaticos",false,7.4f,"7734-5445","Quezaltepeque",generarEdad()));//SISTEMAS3 
    estd.add( new ESTUDIANTE("Maria","CO10006","Ing. Electrica",true,9.3f,"7434-8545","San Salvador",generarEdad()));//ELECTRICA4
    estd.add( new ESTUDIANTE("Andrés","LL12075","Ing. Civil",false,8.1f,"7718-1402","San Salvador",generarEdad()));//CIVIL3
    estd.add( new ESTUDIANTE("Karyna","LP09007","Ing. de Sistemas Informaticos",true,9.8f,"7424-4430","San Salvador",generarEdad()));//SISTEMAS4
    estd.add( new ESTUDIANTE("Alexander","PB09007","Ing. Civil",false,8.7f,"6995-4554","San Jacinto",generarEdad()));

               
       
    //*********Creando los objetos del conjunto Empresas********* 
    
    emp.add( new EMPRESA("Motores Montoya","Ing. Civil",true,true,"2318-6778","San Jacinto", generarEdadRequerida())); //CIVIL1
    emp.add( new EMPRESA("solaris","Ing. Civil",true,false,"2355-1409","San Salvador", generarEdadRequerida()));//CIVIL2
    emp.add( new EMPRESA("Blue Steel","Ing. Industrial",true,true,"2583-0978","Santa Ana", generarEdadRequerida()));//INDUSTRIAL1
    emp.add( new EMPRESA("Paleta","Ing. Industrial",true,false,"2265-7403","Santa Tecla", generarEdadRequerida()));//INDUSTRIAL2
    emp.add( new EMPRESA("Actomatic Motors","Ing. Civil",true,true,"2295-3456","San Salvador", generarEdadRequerida()));//CIVIL3
    emp.add( new EMPRESA("CSS","Ing. de Sistemas Informaticos",true,false,"2208-6725","Soyapango", generarEdadRequerida()));//SISTEMAS1
    emp.add( new EMPRESA("Develop Service","Ing. Industrial",true,true,"2589-7645","San Salvador", generarEdadRequerida()));//INDUSTRIAL3
    emp.add( new EMPRESA("Asistencias S.A de C.V","Ing. Electrica",true,false,"2312-3465","Quezaltepeque", generarEdadRequerida()));//ELECTRICA1
    emp.add( new EMPRESA("San Salvador Games","Ing. de Sistemas Informaticos",true,true,"2345-9783","San Salvador", generarEdadRequerida()));//SISTEMAS2
    emp.add( new EMPRESA("Salva Jobs","Ing. Industrial",true,false,"2312-3102","San Salvador", generarEdadRequerida()));//INDUSTRIAL4
    emp.add( new EMPRESA("Safety Web","Ing. Electrica",true,true,"2267-9878","Santa Tecla", generarEdadRequerida()));//ELECTRICA2
    emp.add( new EMPRESA("Life Code","Ing. de Sistemas Informaticos",true,false,"2209-1234","Santa Tecla", generarEdadRequerida()));//SISTEMAS3
    emp.add( new EMPRESA("Business Tech S.A","Ing. Electrica",true,true,"2391-0763","San Salvador", generarEdadRequerida()));//ELECTRICA3
    emp.add( new EMPRESA("MK Electrical","Ing. Electrica",true,false,"2279-6845","San Jacinto", generarEdadRequerida()));//ELECTRICA4 
    emp.add( new EMPRESA("E-Web","Ing. de Sistemas Informaticos",true,false,"2589-0678","San Salvador", generarEdadRequerida()));//SISTEMAS4
    emp.add( new EMPRESA("UQ Holder","Ing. Civil",true,false,"2312-1561","San Salvador", generarEdadRequerida()));//CIVIL4
    
    //*********Generando preferencias para ambos conjuntos*********
    
    ArrayList <String> Temp = new ArrayList<String>();
        for (int i = 0; i < estd.size(); i++) {
            Temp = estd.get(i).agregarPreferencias(emp);
           estd.get(i).setPreferencias(Temp);
        }    
        for (int i = 0; i < emp.size(); i++) {
            Temp = emp.get(i).agregarPreferencias(estd, emp.get(i).getEdadReq());
            emp.get(i).setPreferencias(Temp);
        } 
        
        
        
    //Creando la matriz de adyacencia.
    matrizAdy = new int[16][16];
    for (int i = 0; i < 16; i++) {
        for(int j = 0; j < 16; j++) {
            //Guardando caminos.
            matrizAdy[i][j] = enviarPreferencias(estd.get(i).getPreferencias(), emp.get(j).getPreferencias()); 
            }            
        }  
    }
    //Generando la edad del estudiante aleatoriamente
    public int generarEdad(){
        //Random rnd = new Random();
        //int Edad = (int)(rnd.nextDouble() * 35 + 25);
        int Edad = (int) (Math.random() * 27) + 25;
        while (Edad >= 28) {
            Edad = (int) (Math.random() * 27) + 25;
        }
        return Edad;
    }
    public int generarEdadRequerida(){
        //Random rnd = new Random();
        //int Edad = (int)(rnd.nextDouble() * 35 + 25);
        int Edad = (int) (Math.random() * 27) + 25;
        while (Edad >= 26) {
            Edad = (int) (Math.random() * 27) + 25;
        }
        return Edad;
    }
    
    //*******Getters & Setter********

    public ArrayList<ESTUDIANTE> getEstd() {
        return estd;
    }

    public void setEstd(ArrayList<ESTUDIANTE> estd) {
        this.estd = estd;
    }

    public ArrayList<EMPRESA> getEmp() {
        return emp;
    }

    public void setEmp(ArrayList<EMPRESA> emp) {
        this.emp = emp;
    }

    public int[][] getMatrizAdy() {
        return matrizAdy;
    }

    public void setMatrizAdy(int[][] matrizAdy) {
        this.matrizAdy = matrizAdy;
    }

    
    
    //******Metodos de la clase*****
    
    //Imprime los valor dela Matriz de Adyacencia
    public String imprimirMatriz(){
         String info = "";
         
            for (int[] matrizAdy1 : matrizAdy) {
             info = (Arrays.toString(matrizAdy1) );
            
              }
            return info; 
    }
    
   /**public void imprimirMatrizVoid(JTextArea areaTexto){
      //Estos dos metodos quedaron desafados, pero estarán aqui por si se necesitaran mas adelante
            for(int i=0;i<matrizAdy.length;i++){
                for(int j=0;j<matrizAdy.length;j++){
                    System.out.println(matrizAdy[i][j]+" ");
                    areaTexto.append(String.valueOf(matrizAdy[i][j] + "\n"));
                }
                System.out.println("\n");
            }
    }
  
     public void imprimirPreferenciasEstudiantes(JTextArea areaTexto){
        
            for(int i=0;i<estd.size();i++){
                for (int j = 0; j < 3; j++) {
                    System.out.println(estd.get(i).getPreferencias().get(j)+" ");
                    areaTexto.append(String.valueOf(estd.get(i)+ "\n"));
                    System.out.println("\n");
                }
                
            }
    }
    */
    
     //Este metodo si funciona. No tocarlo para nada
    public static int enviarPreferencias(ArrayList<String> esd, ArrayList<String> emp){
        int enlace = 0;
        String estudiante, empresa;
        try{
            for (int i = 0; (i < 3) && enlace == 0 ; i++) {
                estudiante  = esd.get(i);
                empresa = emp.get(i);
                for (int j = 0; j < 3; j++) {
                    if ( estudiante.equals(empresa)){
                        enlace = 1;  
                        continue;
                    }
                    if (enlace == 1) {
                       continue;
                    }
                }
                break;
            }
        
            
        }catch(Exception ex){
            
        }
           return enlace; 
    }
   
  
    
}
        
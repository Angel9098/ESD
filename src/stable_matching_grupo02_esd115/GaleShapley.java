/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stable_matching_grupo02_esd115;

/**
 *
 * @author HP
 */
public class GaleShapley
{
    private int N, comprometidoCuenta;
    private String[][] estudiantePref;
    private String[][] empresaPref;
    private String[] estudiante;
    private String[] empresa;
    private String[] empresacompanero;
    private boolean[] estudiantecompromiso;
 
    /** Constructor **/
    /*public GaleShapley(String[] m, String[] w, String[][] mp, String[][] wp)
    {
        N = mp.length;
        comprometidoCuenta = 0;
        estudiante = m;
        empresa = w;
        estudiantePref = mp;
        empresaPref = wp;
        estudiantecompromiso = new boolean[N];
        empresacompanero = new String[N];
        calcMatches();
    }
    /** function to calculate all matches **/
    private void calcMatches()
    {
        while (comprometidoCuenta< N)
        {
            int free;
            for (free = 0; free < N; free++)
                if (!estudiantecompromiso[free])
                    break;
 
            for (int i = 0; i < N && !estudiantecompromiso[free]; i++)
            {
                int index = womenIndexOf(estudiantePref[free][i]);
                if (empresacompanero[index] == null)
                {
                    empresacompanero[index] = estudiante[free];
                    estudiantecompromiso[free] = true;
                    comprometidoCuenta++;
                }
                else
                {
                    String currentPartner = empresacompanero[index];
                    if (morePreference(currentPartner, estudiante[free], index))
                    {
                       empresacompanero[index] = estudiante[free];
                        estudiantecompromiso[free] = true;
                       estudiantecompromiso[menIndexOf(currentPartner)] = false;
                    }
                }
            }            
        }
        printCouples();
    }
    /** function to check if women prefers new partner over old assigned partner **/
    private boolean morePreference(String curPartner, String newPartner, int index)
    {
        for (int i = 0; i < N; i++)
        {
            if (empresaPref[index][i].equals(newPartner))
                return true;
            if (empresaPref[index][i].equals(curPartner))
                return false;
        }
        return false;
    }
    /** get men index **/
    private int menIndexOf(String str)
    {
        for (int i = 0; i < N; i++)
            if (estudiante[i].equals(str))
                return i;
        return -1;
    }
    /** get women index **/
    private int womenIndexOf(String str)
    {
        for (int i = 0; i < N; i++)
            if (empresa[i].equals(str))
                return i;
        return -1;
    }
    /** print couples **/
    public void printCouples()
    {
        System.out.println("Couples are : ");
        for (int i = 0; i < N; i++)
        {
            System.out.println(empresacompanero[i] +" "+ empresa[i]);
        }
    }
    /** main function **/
    public static void main(String[] args) 
    {
        System.out.println("Gale Shapley Marriage Algorithm\n");
        /** list of men **/
        /*String[] m = {"M1", "M2", "M3", "M4", "M5"};
        /** list of women **/
       /* String[] w = {"W1", "W2", "W3", "W4", "W5"};
 */
        /** men preference **/
       /* String[][] mp = {{"W5", "W2", "W3", "W4", "W1"}, 
                         {"W2", "W5", "W1", "W3", "W4"}, 
                         {"W4", "W3", "W2", "W1", "W5"}, 
                         {"W1", "W2", "W3", "W4", "W5"},
                         {"W5", "W2", "W3", "W4", "W1"}};
        /** women preference **/                      
       /* String[][] wp = {{"M5", "M3", "M4", "M1", "M2"}, 
                         {"M1", "M2", "M3", "M5", "M4"}, 
                         {"M4", "M5", "M3", "M2", "M1"},
                         {"M5", "M2", "M1", "M4", "M3"}, 
                         {"M2", "M1", "M4", "M3", "M5"}};
 */
       String[][] estudianteP={  
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""},
           {"","",""}};                            
      
          String[] empresa = new String[16];
         String[] estudiante = new String[16];
         String[] prefEmpresa = new String[100];
         String[] prefEstudiante = new String[100];
         
      STABLE_MATCHING datos = new STABLE_MATCHING();
    
      
        for (int i = 0; i < 16; i++) {
            empresa[i] = datos.emp.get(i).getNombre();
            System.out.print(empresa[i]+"\n");
        }
  for (int i = 0; i < 16; i++) {
            estudiante[i] = datos.estd.get(i).getNombre();
            System.out.print(estudiante[i]+"\n");
        }
   
       
       // GaleShapley gs = new GaleShapley(estudiante, empresa, mp, wp);                        
    }
    /*public String mostrar(){
        
  
        return "";
    }*/
}

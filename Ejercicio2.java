import java.util.ArrayList;
public class Ejercicio2
{
    public static int [] tamanoVector(int n, String [] vec, int s){
      if (s > n){
      return null;  
    }
    return tamanoVector(n, vec, s);
    }
    public static void vectorGenerado(String [] vec, int x, String ini, ArrayList<String> convinacion){
        if(x < vec.length){
            String nCad = ini + vec[x];
            convinacion.add(nCad);
            vectorGenerado(vec, x + 1, nCad, convinacion);
            vectorGenerado(vec, x + 1, ini, convinacion);
        }
    }
    public static boolean puedoGenerar(String[] a, String x){
        ArrayList<String> convinacion = new ArrayList<String>();
        vectorGenerado(a, 0, "", convinacion);
        System.out.println(convinacion);
        return convinacion.contains(x);
    }
    public static void main(){
        String [] ejemplo1 = new String[]{"1","1","2"};
        boolean generar =  puedoGenerar(ejemplo1,  "112");
        System.out.println(generar);
        //vectorGenerado(ejemplo1, 0, "",);
    
    }
    
        
}

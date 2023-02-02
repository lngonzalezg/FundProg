package scripts;

public class ScriptFeb1 {

	/**
	 * Calcula el número de horas según créditos
	 * @param pCred
	 * @param pHoras
	 * @return
	 */
    public int darHorasDedicacion(int pCred, int pHoras)
    {
        int horasCred = pHoras * pCred;
        return horasCred;
    }
	
    /**
     * Calcula el semestre según créditos
     * @param pCred
     * @return
     */
    public double darSemestreSegunCreditos(int pCred)
    {
        return pCred/17.0;
    }
    
 
    /**
     * Calcula el promedio de 5 notas con igual peso
     * @param nota1
     * @param nota2
     * @param nota3
     * @param nota4
     * @param nota5
     * @return
     */
    public double darPromedioNota(double nota1, double nota2, double nota3, double nota4, double nota5)
    {
        return (nota1+nota2+nota3+nota4+nota5)/5.0;
    }
    
    /**
     * Calcula el promedio de 9 notas con pesos
     * @return
     */
    public double darPromedioNotaPesos1()
    {
        double nota1 = 5;
        double nota2 = 4.5;
        double nota3 = 5;
        double nota4 = 4.5;
        double nota5 = 5;
        double nota6 = 4.5;
        double nota7 = 5;
        double nota8 = 4.5;
        double nota9 = 5;
        
        return (nota1+nota2)*0.25 + (nota3+nota4+nota5)*0.1 + (nota6+nota7+nota8+nota9)*0.05;
    }
    
    /**
     * Calcula el promedio de 9 notas con pesos
     * @return
     */
    public double darPromedioNotaPesos2(double nota1, double nota2, double nota3, double nota4, double nota5, double nota6, double nota7, double nota8, double nota9)
    {
        return (nota1+nota2)*0.25 + (nota3+nota4+nota5)*0.1 + (nota6+nota7+nota8+nota9)*0.05;
    }
	
    public static void main(String[] args) 
	{
    	//Crear una instancia de la clase
		 ScriptFeb1 instance = new ScriptFeb1();
		 
		 int horasDedicacionCred = instance.darHorasDedicacion(16, 3);
		 System.out.println("Las horas de dedicación para 16 créditos son: " + horasDedicacionCred);
	     System.out.println("El semestre según 100 créditos es: " + instance.darSemestreSegunCreditos(100));
	     System.out.println("El promedio de notas es: " + instance.darPromedioNota(4.5, 5, 3.7, 4.9, 2));
	     System.out.println("El promedio de notas es: " + instance.darPromedioNotaPesos1());
	     System.out.println("El promedio de notas es: " + instance.darPromedioNotaPesos2( 5, 3.7, 4.9, 2,4.5, 5, 3.7,4,5));

		 
	}

}

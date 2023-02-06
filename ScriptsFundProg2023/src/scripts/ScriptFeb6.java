package scripts;

public class ScriptFeb6 
{

	/*
     * ----------- Atributos -----------
     */
	private String mensaje;
	private String fecha;
	private int sexo;
	
	/*
     * ----------- Constructora -----------
     */
	public ScriptFeb6(String pMensaje, String pFecha, int pSexo)
	{
		mensaje = pMensaje;
		fecha = pFecha;
		sexo = pSexo;
	}
	
	
	/*
     * ----------- Métodos -----------
     */
	public String darMensaje()
	{
		return mensaje;
	}
	
	public String darFecha()
	{
		return fecha;
	}
	
	public int darSexo()
	{
		return sexo;
	}
	
	public void cambiarMensaje(String pMensaje)
	{
		mensaje = pMensaje;
	}
	
	public void cambiarFecha(String pFecha)
	{
		fecha = pFecha;
	}
	
	public void cambiarSexo(int pSexo)
	{
		sexo = pSexo;
	}
	
	public int contarCaracteres()
    {
    	int rta = mensaje.length();
    	return rta;
    }
	
	public int contarCaracteresTrim()
    {
    	String newMsj = mensaje.trim();
    	return newMsj.length();
    }
	
	 public int darPosicion(char letra)
	 {
	    	return mensaje.indexOf(letra);
	 }
	 
	 public char darLetraPos(int pos)
	 {
	    	return mensaje.charAt(pos);
	 }
	 
	 public String darSubsecuencia(int posi, int posf)
	 {
	    	return mensaje.substring(posi, posf);
	 }
	 
	 public String[] dividirMensaje(String divisor)
	 {
	    	return mensaje.split(divisor);
	 }
	 
   public String reemplazarCadena(String oldCh, String newCh)
    {
    	return mensaje.replace(oldCh, newCh);
    }
   
   
	/*
     * ----------- Main -----------
     */
	public static void main(String[] args) 
	{
		String msj = " Hola mundo, soy Laura ";
		String msj2 = "Hola mundo, soy Laurx";
		
		ScriptFeb6 instance = new ScriptFeb6(msj, "Feb 6", 0);
		ScriptFeb6 instance2 = new ScriptFeb6(msj2, "Feb 4", 1);
		
		//System.out.println(instance.darMensaje() + " " + instance.darFecha() + " " + instance.darSexo());
		//System.out.println(instance.contarCaracteres());
		//System.out.println(instance.contarCaracteresTrim());
		
		System.out.println(instance2.darMensaje() + " " + instance2.darFecha() + " " + instance2.darSexo());
		System.out.println(instance2.contarCaracteres());
		System.out.println(instance2.darPosicion('m'));
		System.out.println(instance2.darLetraPos(instance2.contarCaracteres()-1));
		System.out.println(instance2.darSubsecuencia(0, 3));
		System.out.println(instance2.dividirMensaje("o")[3]);
		System.out.println(instance2.reemplazarCadena("o", "oxo"));
	}

}

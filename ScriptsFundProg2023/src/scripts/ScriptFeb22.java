package scripts;

public class ScriptFeb22 
{

	private int vendidos;
	
	private String mensaje;
	
	
	public ScriptFeb22()
	{
		vendidos = 0;
		mensaje = "Hoy hay paro de taxis";
	}
	
	public String heVendido()
	{		
		if (vendidos > 0)
		{
			return "Si";
		}
		else
		{
			return "No";
		}
		
	}
	
	public String vender(int valor)
	{
		if(valor==1)
		{
			vendidos ++;
			return "sume 1, ahora tengo " + vendidos;
		}
		else if(valor >1)
		{
			vendidos += valor;
			return "sume más de 1, ahora tengo " + vendidos;
		}
		else
		{
			return "no sumé nada, tengo " + vendidos;
		}
		
	}
	
	public String heVendidoRango(int menor, int mayor)
	{
		if(vendidos >= menor && vendidos <= mayor)
		{
			return "He vendido entre " + menor + " y " + mayor;
		}
		else if((vendidos >0 && vendidos <5) || vendidos >10 )
		{
			return "vendi";
		}
		else
		{
			return "No he vendido entre " + menor + " y " + mayor;
		}
		
	}
	
	public String tengoCaracter(String caracter)
	{
		if(mensaje != null)
		{
		
			if(mensaje.indexOf(caracter)>=0)
			{
				return "Si está el texto";
			}
			else
			{
				return "No está";
			}
		}
		else
		{
			return "No hay mensaje";
		}
	}
	
	public boolean esMensaje(String texto)
	{
		if(mensaje.equalsIgnoreCase(texto))
		{
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		ScriptFeb22 instance = new ScriptFeb22();
		
		System.out.println(instance.heVendido());
		
		System.out.println(instance.vender(0));
		System.out.println(instance.vender(1));
		System.out.println(instance.vender(2));
		
		System.out.println(instance.heVendido());
		
		System.out.println(instance.heVendidoRango(4, 8));
		

		
	}

}

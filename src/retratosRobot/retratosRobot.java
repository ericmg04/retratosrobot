package retratosRobot;

public class retratosRobot {

	public static void main(String[] args) {
		
		int pelo= Integer.parseInt(IO.readln("introduce estilo de pelo: "));
		
		String primera= "WWWWWWWWW";
		String segunda= "\\\\\\//////";
		String tercera= "|||||||";
		String cuarta= "|||||||||";
		
		
		
		int ojos= Integer.parseInt(IO.readln("Introduce estilo de ojos: "));
		String primeraOjo= "| o o |";
		String segundaOjo= "|-(· ·)-|";
		String terceraOjo= "|-(o o)-|";
		String cuartaOjo=  "| \\ / |";
		
		
		
		int orejasNariz= Integer.parseInt(IO.readln("Introduce estilo de orejas y nariz: "));
		String primeraON= "@ J @";
		String SegundaON= "{  }";
		String terceraON= "[ j ]";
		String cuartaON=  "< - >";
		
		

		int boca= Integer.parseInt(IO.readln("Introduce estilo de boca: "));
		String boca1= "| === |";
		String boca2= "| - |";
		String boca3=  "| ___ |";
		String boca4=  "| --- |";
		
		int barbilla= Integer.parseInt(IO.readln("Introduce estilo de barbilla: "));
		String barbilla1=  "\\_______/";
		String barbilla2=  "\\,,,,,,,/";
		String barbilla3=  "\\......./";
		String barbilla4=  "\\mmmmmmm/";
				
				
				
				
				
				
		System.out.println(pelo + ojos +orejasNariz + boca + barbilla);
		
		
	}

}

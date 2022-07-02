package AulaLogica;
import java.util.Random;
import java.util.Calendar;
public class MathOperacao {

	public static void main(String[] args) {
		
//		
//		double PI = Math.PI;
//		System.out.println(PI);
//		
//		
//		System.out.println(Math.pow(4,2));
//		System.out.println(Math.sqrt(15));
//		System.out.println(Math.cbrt(6));
//		
//		System.out.println(Math.floor(2.48));
//		double num = 3.01;
//		System.out.println(Math.ceil(num));
//		
//		double num2 = 2.49;
//		double arredonda = Math.round(num2);
//		System.out.println(arredonda);
		
		
//		double random = Math.random();
//		System.out.println(random);
//		double multiplica = random *5;
//		System.out.println(multiplica);
//		
//		int  numInt = (int) multiplica;
//		System.out.println(numInt);
		
		// Instaciando obj do tipo random
		
		
//		Random rand = new Random ();
//		
//		double num = rand.nextDouble();
//		System.out.println(num);
//		
//		boolean teste = rand.nextBoolean();
//		System.out.println(teste);
		
		//Sortear intervalo 
		
		
//		String str = "Miguel melhor do mundo receba";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		
//		System.out.println("");
		
//		int tamanhostr = str.length();
//		System.out.println(tamanhostr);
//		for (int i =0; i <= 12; i++) {
//			System.out.println(str.charAt(i));
		
			Calendar c = Calendar.getInstance();
			System.out.println("Data e Hora atual é: " + c.getTime());
			
			System.out.println("Ano: " + c.get(Calendar.YEAR));
			System.out.println("Mes:" +  c.get(Calendar.MONTH));
			System.out.println("Dia do mes :"  + c.get(Calendar.DAY_OF_MONTH));
			System.out.println("Dia da Semana :" + c.get(Calendar.DAY_OF_WEEK));
			
			int hora = c.get(Calendar.HOUR_OF_DAY);
			System.out.println(hora);
			
			
			
			
		}
		
		
	}
	


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class NewDates {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyy"); // Instancio um objeto "X" para formatar a hora que o Java traz por padrao

		Date agora = new Date(); // Traz a hora atual Brasil
	//	Date now = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Traz hora 
System.out.println(y.format(agora));
		//System.out.println(agora);

//		System.out.println("-----------------");

	//	System.out.println(y.format(agora));
		
		//System.out.println(y.format(now));
		Calendar call = Calendar.getInstance();
		
		call.setTime(agora);
		call.add(Calendar.HOUR_OF_DAY, 10);
		agora=call.getTime();
		
		System.out.println(y.format(agora));
		
		int minutos=call.get(Calendar.MINUTE);
		System.out.println(minutos);
		
		
		int mes = call.get(Calendar.MONTH);
		
		System.out.println(mes);
		
		int mili = call.get(Calendar.MILLISECOND);
		
		System.out.println(mili);
		
		

	}
}

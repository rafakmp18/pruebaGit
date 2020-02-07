package Prueba;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Prueba {

	public static void main(String[] args) {

		DayOfWeek martes = DayOfWeek.TUESDAY;
		Month enero = Month.JANUARY;
		LocalTime hora = LocalTime.now();
		Locale l = new Locale("es");
		System.out.printf("En 8 días será: %s%n", martes.plus(8));
		System.out.println(martes.getDisplayName(TextStyle.FULL, l));
		System.out.println(enero.getDisplayName(TextStyle.FULL, l ));
		System.out.printf("SEGUNDOS DE AHORA %s%n",hora.getSecond());
		System.out.printf("MINUTOS DE AHORA %s%n",hora.getMinute());
		System.out.printf("HORA DE AHORA %s%n",hora.getHour());
		
		
		
	}

}

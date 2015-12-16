import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Run {


	public static void main(String[] args) {

		// System.out.println("-- A --");
		// try {
		// int val = Integer.parseInt("bonjout !");
		// } catch (NumberFormatException e) {
		// System.err.println("Pas un chiffre !!");
		// }
		// System.out.println("-- A --");

		String s = "rr".concat("ooo");

		System.out.println(s);

		String csv = "ttt;rr;eee;eee;uuu;ee=";

		String[] tab = csv.split(";");



		for (int i = 0; i < csv.length(); i++) {
			System.out.print(csv.charAt(i));
		}

		int i = csv.indexOf("uuu", 10);
		if (csv.equalsIgnoreCase(s)) {

		}

		System.out.println(tab);

		double d = 5.5465558;
		System.out.println(d);
		DecimalFormat df = new DecimalFormat("0.00");
		Locale l = Locale.getDefault();
		System.out.println(l);
		System.out.println(df.format(d));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		sdf.setLenient(false); // si la date est pas cohérente il plante
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(sdf.format(d1));

		String s2 = "2015/10/16 16:44:00";
		Date d2;
		try {
			d2 = sdf.parse(s2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar c = new GregorianCalendar();
		c.setTime(new Date());
		System.out.println(c.getTime());
		c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + 3);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
}

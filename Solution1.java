
import java.util.*;
public class Solution1
{	
	public static void main(String args[]){
		// without API
		final String[] DAYS = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		date += ((month < 3) ? year-- : (year - 2));
		int day = ((((23 * month) / 9) + date + 4 + (year/4)) - (year/100) + (year/400)) % 7;
		
		System.out.println(DAYS[day]);
	}
}
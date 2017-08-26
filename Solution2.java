
import java.util.*;
public class Solution2
{	
	public static void main(String args[]){
		// without API
		final String[] DAYS = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		int a = (14 - month) /12;
		int y = year -a;
		int m = month + 12 * a - 2;
		
		int day = (date + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
		System.out.println(DAYS[day]);
	}
}

import java.util.*;
import java.time.LocalDate;
public class Solution3
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		LocalDate dt = LocalDate.of(year,month,date);
		System.out.println(dt.getDayOfWeek());
	}
}
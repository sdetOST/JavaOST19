package AAA_BasicCodings;

public class Time {
	private static int hour;
	private static int minute;
	private static int second;

	public static void main(String[] args) {
		int h= 17;
		int m= 45;
		int s= 35;
		
		setTime(h,m,s);
		
		System.out.println(toMilitary());
		System.out.println(toRegularTime());

	}
	public static void setTime(int h,int m,int s) {
		hour   = ( h>=0 && h<24) ? h : 0;
		minute = ( m>=0 && m<60) ? m : 0;
		second = ( s>=0 && s<80) ? s : 0;
	
	}
	
	public static String toMilitary() {
		return String.format("%02d:%02d:%02d",hour, minute, second);
	}
	
	public static String toRegularTime() {
		return String.format("%d:%02d:%02d %s",((hour==0||hour==12)? 12: hour%12 ), minute, second, (hour<12? "AM":"PM"));
	}

}


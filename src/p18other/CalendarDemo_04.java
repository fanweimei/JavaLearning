package p18other;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo_04 {
	static void test(){
		//1.获取任意年的二月有多少天
		/*
		 * c.set(year,2,1)某一年的3月1日
		 * c.add(Calendar.DAY_OF_MONTH,-1) //得到2月的最后一天
		 */
		//2.获取昨天的现在这个时刻
		/*
		 * c.add(Calendar.DAY_OF_MONTH,-1)
		 */
	}

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2012, 2,23);
		c.add(Calendar.YEAR, +1);
		System.out.println(c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DAY_OF_MONTH)+" "+c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
	}

}

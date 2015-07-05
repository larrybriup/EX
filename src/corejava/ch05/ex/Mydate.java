package corejava.ch05.ex;

/*
Ҫ��
1����Mydate��Ϊ��װ��
2��year����Ч��ΧΪ1900~2100
3��month����Ч��ΧΪ1~12
4��day����Ч��Χ���monthȷ����2��Ϊ1~28
5��year��month��day��ֵ�������Ч��Χ֮�⣬��ִ�и�ֵ����
6���޸�Teacher��TeacherTest��ʵ�ֶԷ�װ���Mydate����е���

7�������з��������Ϊ��������ͬ����ƣ�ʹ��this���д���
8�����ӹ�����Mydate(int year, int month)��
Mydate(int year)��
month��day���Կ���ʹ��1��Ϊ���ù������Ĳ���ֵ
*/
public class Mydate 
{
	private int year;
	private int month;
	private int day;

	public Mydate(int year, int month, int day){
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public Mydate(int year){
		this(year, 1, 1);
	}
	public Mydate(int year, int month){
		this(year, month, 1);
	}
	public void setYear(int year){
		if(year>=1900 && year<=2100)
			this.year = year;
	}
	public int getYear(){
		return year;
	}
	public void setMonth(int month){
		if(month>=1 && month<=12)
			this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(int day){
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day>=1 && day<=31)
					this.day = day;
				break;
			case 2:
				if(day>=1 && day<=28)
					this.day = day;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>=1 && day<=30)
					this.day = day;
				break;
		}		
	}
	public int getDay(){
		return day;
	}
	public String getDate(){
		return year + "-" + month + "-" + day;
	}
}

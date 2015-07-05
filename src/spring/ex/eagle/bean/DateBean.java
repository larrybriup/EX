package spring.ex.eagle.bean;

public class DateBean {
	private int hour;
	private int mins;
	private int secs;

	public DateBean() {
	}

	public DateBean(int hour, int mins, int secs) {
		this.hour = hour;
		this.mins = mins;
		this.secs = secs;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public int getSecs() {
		return secs;
	}

	public void setSecs(int secs) {
		this.secs = secs;
	}

	@Override
	public String toString() {
		return "DateBean [hour=" + hour + ", mins=" + mins + ", secs=" + secs
				+ "]";
	}

}

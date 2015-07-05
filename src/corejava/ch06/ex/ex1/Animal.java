package corejava.ch06.ex.ex1;

abstract class Animal{
	protected String name;


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	protected int legs;
	protected Animal(){}
	protected Animal(int legs){
		this.legs = legs;
	}
	public void walk(){}
	public abstract void eat();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "name=" + this.name;
	}
}
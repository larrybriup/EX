package spring.ex.eagle.bean;

public class Dog {
	private String owner;
	private String name;
	private String color;

	public Dog() {
	}

	public Dog(String owner, String name, String color) {
		this.owner = owner;
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "[owner=" + owner + ",color=" + color + "\n dog:\nname=" + name
				+ ", color=" + color + "]";
	}

}

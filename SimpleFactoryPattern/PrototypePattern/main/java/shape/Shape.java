package main.java.shape;

public abstract class Shape implements Cloneable{
	private String id;
	protected String type;
	
	abstract String draw();
	
	public void setId(String id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
}

package designpattern.prototype;

public  abstract class OperatingSystem implements Cloneable {
	
	
	private String hard_disk;

	public String getHard_disk() {
		return hard_disk;
	}

	public void setHard_disk(String hard_disk) {
		this.hard_disk = hard_disk;
	}

	@Override
	public String toString() {
		return "OperatingSysterm [hard_disk=" + hard_disk + "]";
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
}

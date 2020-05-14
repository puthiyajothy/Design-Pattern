package designpattern.prototype;

public class Linex extends OperatingSystem {

	private String Type;
	private String RAM;
	private String Processor_type;

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getProcessor_type() {
		return Processor_type;
	}

	public void setProcessor_type(String processor_type) {
		Processor_type = processor_type;
	}

	@Override
	public String toString() {
		return "Linex [Type=" + Type + ", RAM=" + RAM + ", Processor_type=" + Processor_type + "]";
	}

	
}

package designpattern.prototype;

public class Windows extends OperatingSystem {

	private String RAM;
	private String Type;
	private String Processortype;

	public String getProcessortype() {
		return Processortype;
	}

	public void setProcessortype(String processortype) {
		Processortype = processortype;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@Override
	public String toString() {
		return "Windows [RAM=" + RAM + ", Type=" + Type + ", Processortype=" + Processortype + "]";
	}
}

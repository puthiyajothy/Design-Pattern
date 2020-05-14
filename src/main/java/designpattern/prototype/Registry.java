package designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<OSType, OperatingSystem> os = new HashMap<>();

	public Registry() {
		this.initialize();
	}

	private void initialize() {
		Windows win = new Windows();
		win.setHard_disk("2TB");
		win.setProcessortype("INTEL");
		win.setType("LAPTOP");
		win.setRAM("16GB");
		
		Linex lin = new Linex();
		lin.setHard_disk("500GB");
		lin.setRAM("16GB");
		lin.setProcessor_type("AMD");
		lin.setType("MINICOMPUTER");
		
		
		os.put(OSType.WINDOWS, win);
		os.put(OSType.LINEX,lin);
		
	}
	
	public OperatingSystem  getoperatingSystem(OSType ostype) {
		
		OperatingSystem operatingsystem = null;
		try {
			 operatingsystem = (OperatingSystem) os.get(ostype).clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return operatingsystem;
		
	}

}

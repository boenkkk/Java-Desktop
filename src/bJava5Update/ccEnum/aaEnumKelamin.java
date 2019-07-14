package bJava5Update.ccEnum;

public enum aaEnumKelamin {

	LAKI_LAKI("L","Laki-laki"),
	PEREMPUAN("P", "Perempuan");
	
	private String symbol;
	private String name;
	
	private aaEnumKelamin(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return symbol;
	}

}

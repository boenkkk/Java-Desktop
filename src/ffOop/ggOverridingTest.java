package ffOop;

class cUmur {
	int umur = 12;
	
	int getUmur(){
		return umur;
	}
}

class ggOverridingTest extends cUmur{
	//override
	int umur = 13;
	int getUmur(){
		return 22;
	}
	public static void main(String[] args) {
		cUmur o  = new cUmur();
		System.out.println(o.getUmur()); //12
	}
}
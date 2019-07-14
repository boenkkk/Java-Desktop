package bJava5Update.ccEnum;

public class bbEnumKelaminTest {
	
	public static void main(String[] args) {
		
		//looping
		System.out.println("==keluarin semua enum==");
		aaEnumKelamin[] jks = aaEnumKelamin.values();
		for (aaEnumKelamin jk : jks) {
			System.out.println(jk+" | "+jk.getName());
		}
		
		//decision
		aaEnumKelamin kel = aaEnumKelamin.LAKI_LAKI;
		
		System.out.println("==pake switch==");
		switch (kel) {
		case LAKI_LAKI:
			System.out.println("PRIA : "+kel+" | "+kel.getName());
			break;
		case PEREMPUAN:
			System.out.println("WANITA : "+kel+" | "+kel.getName());
		}
		
		System.out.println("==pake if==");
		if (kel == aaEnumKelamin.LAKI_LAKI) {
			System.out.println("PRIA : "+kel+" | "+kel.getName());
		}else if(kel == aaEnumKelamin.PEREMPUAN){
			System.out.println("WANITA : "+kel+" | "+kel.getName());
		}
	}
	
}
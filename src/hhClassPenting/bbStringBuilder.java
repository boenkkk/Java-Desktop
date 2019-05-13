package hhClassPenting;

public class bbStringBuilder {

	public static void main(String[] args){
		StringBuilder s = new StringBuilder("ini StringBuilder tidak immutable ");
		System.out.println("sebelum operasi concat nilai s : " + s);
		//append merubah variabel s,
		//setelah proses append nilai variabel s akan berubah
		s.append("concat");
		System.out.println("setelah operasi concat nilai s : " + s);
		s.append(s.append("concat")).append(" object baru");
		
		StringBuilder sb = new StringBuilder("Budi");
		sb.append(" Santoso");
		System.out.println(sb);
		
		String s2 = "ini string immutable ";
		String concatS2 = s2 + s2.concat("concat") + " object baru";
		System.out.println("concatS2 : "+concatS2);
	}

}
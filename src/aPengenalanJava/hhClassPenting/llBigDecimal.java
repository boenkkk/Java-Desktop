package aPengenalanJava.hhClassPenting;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class llBigDecimal {

	public static void main(String[] args) {
		contohBD();
		withBD();
		withBDnNF();
	}
	
	public static void contohBD() {
		System.out.println("==Contoh BD==");
		double dd = 0.35;
		
		BigDecimal d = new BigDecimal(dd);
		System.out.println("0.35 = " + d); //hasilnya berantakan karena dari double
		
		d = d.setScale(2, RoundingMode.HALF_UP);
		System.out.println("0.35 = " + d); //hasilnya bagus setelah pembulatan
		
		BigDecimal dec = new BigDecimal("0.35");
		System.out.println("0.35 = " + dec); //hasilnya bagus
	}
	
	public static void withBD() {
		System.out.println("==With BD==");
		
		BigDecimal amount = new BigDecimal("1000000.05");
		BigDecimal discountPercent = new BigDecimal("0.10");
		BigDecimal discount = amount.multiply(discountPercent);
		discount = discount.setScale(2, RoundingMode.HALF_UP);
		BigDecimal total = amount.subtract(discount);
		total = total.setScale(2, RoundingMode.HALF_UP);
		BigDecimal taxPercent = new BigDecimal("0.05");
		BigDecimal tax = total.multiply(taxPercent);
		tax = tax.setScale(2, RoundingMode.HALF_UP);
		BigDecimal taxedTotal = total.add(tax);
		taxedTotal = taxedTotal.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("Subtotal : " + amount);
		System.out.println("Discount : " + discount);
		System.out.println("Total : " + total);
		System.out.println("Tax : " + tax);
		System.out.println("Tax+Total: " + taxedTotal);
	}
	
	public static void withBDnNF() {
		System.out.println("==With BD n NF==");
		
		BigDecimal amount = new BigDecimal("1000000.05");
		BigDecimal discountPercent = new BigDecimal("0.10");
		BigDecimal discount = amount.multiply(discountPercent);
		discount = discount.setScale(2, RoundingMode.HALF_UP);
		BigDecimal total = amount.subtract(discount);
		total = total.setScale(2, RoundingMode.HALF_UP);
		BigDecimal taxPercent = new BigDecimal("0.05");
		BigDecimal tax = total.multiply(taxPercent);
		tax = tax.setScale(2, RoundingMode.HALF_UP);
		BigDecimal taxedTotal = total.add(tax);
		taxedTotal = taxedTotal.setScale(2, RoundingMode.HALF_UP);
		
		NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
		
		System.out.println("Subtotal : " + money.format(amount));
		System.out.println("Discount : " + money.format(discount));
		System.out.println("Total : " + money.format(total));
		System.out.println("Tax : " + money.format(tax));
		System.out.println("Tax+Total: " + money.format(taxedTotal));
	}

}
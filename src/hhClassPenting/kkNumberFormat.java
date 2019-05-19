package hhClassPenting;

import java.text.NumberFormat;
import java.util.Locale;

public class kkNumberFormat {
	
	public static void main(String[] args) {
		withoutNF();
		withNF();
		withoutNFFloat();
		withNFFloat();
	}
	
	public static void withoutNF() {
		System.out.println("==Without NF==");
		double amount = 1000000.05;
		double discount = amount * 0.10; //diskon 10%
		double total = amount - discount;
		double tax = total * 0.05; //ppn 5%
		double taxedTotal = tax + total;
		System.out.println("Subtotal : "+ amount);
		System.out.println("Discount : " + discount);
		System.out.println("Total : " + total);
		System.out.println("Tax : " + tax);
		System.out.println("Tax+Total: " + taxedTotal);
	}
	
	public static void withNF() {
		System.out.println("==With NF==");
		double amount = 1000000.05;
		double discount = amount * 0.10; //diskon 10%
		double total = amount - discount;
		double tax = total * 0.05; //ppn 5%
		double taxedTotal = tax + total;
		NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
		System.out.println("Subtotal : "+ money.format(amount));
		System.out.println("Discount : " + money.format(discount));
		System.out.println("Total : " + money.format(total));
		System.out.println("Tax : " + money.format(tax));
		System.out.println("Tax+Total: " + money.format(taxedTotal));
	}
	
	public static void withoutNFFloat() {
		System.out.println("==Without NF Float==");
		float amount = (float) 1000000.05;
		float discount = (float) (amount * 0.10); //diskon 10%
		float total = amount - discount;
		float tax = (float) (total * 0.05); //ppn 5%
		float taxedTotal = tax + total;
		System.out.println("Subtotal : "+ amount);
		System.out.println("Discount : " + discount);
		System.out.println("Total : " + total);
		System.out.println("Tax : " + tax);
		System.out.println("Tax+Total: " + taxedTotal);
	}
	
	public static void withNFFloat() {
		System.out.println("==With NF==");
		float amount = (float) 1000000.05;
		float discount = (float) (amount * 0.10); //diskon 10%
		float total = amount - discount;
		float tax = (float) (total * 0.05); //ppn 5%
		float taxedTotal = tax + total;
		NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
		System.out.println("Subtotal : "+ money.format(amount));
		System.out.println("Discount : " + money.format(discount));
		System.out.println("Total : " + money.format(total));
		System.out.println("Tax : " + money.format(tax));
		System.out.println("Tax+Total: " + money.format(taxedTotal));
	}

}
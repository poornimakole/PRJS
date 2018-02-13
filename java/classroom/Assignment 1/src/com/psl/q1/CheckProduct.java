package com.psl.q1;

public class CheckProduct {
	public static String[] initProductNames() {
		String[] product = { "samsung j7", "apple", "sony", "micromax" };
		return product;
	}

	public static boolean isPresent(String[] productNames, String keyword) {
		int l = productNames.length;
		boolean res = false;
		for (int i = 0; i < l; i++) {
			if (productNames[i].equalsIgnoreCase(keyword)) {
				res = true;
				break;
			} else
				res = false;
		}
		return res;
	}

	public static void main(String[] args) {
		String[] productName = initProductNames();
		String keyword = "apple";
		boolean result = isPresent(productName, keyword);
		if (result == true)
			System.out.println(keyword + " is present in products");
		else
			System.out.println(keyword + " is absent in products");
	}
}

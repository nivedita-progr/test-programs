package com.word.convrtor;

/**
 * The {@code Problem1_NumberToWordCoversion} class exposes methods to convert Long type numbers into strings/words. 
 * @author  Nivedita
 */
public class Problem1_NumberToWordCoversion {

	public static void main(String[] args) {
		/*	TODO: 	1. Number to Word convertor.
				Take a number and give the equivalent number in British English words e.g.
				1 = one
				21 = twenty one
				105 = one hundred and five
				56945781 = fifty six million nine hundred and forty five thousand seven hundred and eighty one
				etc.. up to 999,999,999 
				(without using a tokenizer, or any external libraries)
		 */
		
		  //convert(9l); convert(90l); convert(99l); convert(999l); convert(990l);
		String result = convert(-5l);
		
		System.out.println(result);
	}
	
	/**
	 * The {@code Convert} method converts Long type numbers into strings/words. 
	 * @author  Nivedita
	 */
	public static String convert(Long number) {
		
		//assert (number < 0l) : "Given value is invalid.";
		if(number < 0) {
			return "Number must be greater than zero."; 
		}
		
		String[] strArr = {"zero"," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"};
		String[] strArr1= {""," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
		String[] strArr2= {""," ten"," twenty"," thirty"," fourty"," fifty"," sixty"," seventy"," eighty"," ninety"};
		
		String word = "";
		boolean skip = false;
		
		try {
			while(number > 10) {
				//System.out.println("Processing for - " + number);
				int length = number.toString().length();
				if(length==2) {
					word += strArr2[(int)(number/10)];
					//System.out.println("2-" + word);
					if(number % 10 == 0) {
						skip = true;
						break;
					}
				}
				if(length==3) {
					word += strArr[(int)(number/100)] + " hundred and";
					//System.out.println("3-" + word);
					if(number % 100 == 0)
						break;
				}
				if( (length==4) || (length==5) ) {
					if (length==4) {
						word += strArr[(int)(number/1000)] + " thousand";
					}
					if (length==5) {
						word += strArr2[(int)(number/10000)];
					}
					
				}
				if(length==6) {
					word += strArr[(int)(number/100000)] + " hundred and";
				}
				if( (length==7) || (length==8) ) {
					if (length==7) {
						word += strArr[(int)(number/1000000)] + " million";
					}
					if (length==8) {
						word += strArr2[(int)(number/10000000)];
					}
				}
				number = Long.parseLong((number.toString().substring(1, length)));
			}
			//System.out.println("Test - " + number + ":" + number%10);
			if(!skip) {
				word += strArr[(int)(number % 10)];
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return word;
	}

}

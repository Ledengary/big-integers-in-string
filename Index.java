import java.util.Scanner;
/* *
* @ author Reza Khan Mohammadi
* @ project 1
* @ uploaded 15.12.96
* */
public class Index {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		ConvertView ConvertViewObject = new ConvertView();
		// get the order as a String and the convert it into integer
		String orderString = inp.nextLine();
		int order = Integer.parseInt(orderString);
		String number = inp.nextLine();
		if (order == 0) {
			// check if it is aeshari or not !
			if (number.indexOf(".") == -1) {
				if (number.length() <= 12) {
					System.out.println(ConvertViewObject.beHoruf(number) + ".");
				} else {
					System.out.println("Please enter a number lower than 12 digits !");
				}
			} else {
				// break the number into two parts of befor and after the dot
				String teil1 = number.substring(0, number.indexOf("."));
				String teil2 = number.substring(number.indexOf(".") + 1, number.length());
				// now i wanna check if the after dots are all equal, if they are there aint no
				// problem ma man, but if and only if they're all zeros, then the code should be
				// preventing it to make any changes because no matter how many zeroes you give,
				// it'll be count as nothing.
				boolean isTeilTwoZero = false;
				if (isEqual(teil2)) {
					if (teil2.charAt(0) == '0') {
						isTeilTwoZero = true;
					}
				}
				// let's sum it up with the last words which are dahom, sadom or...
				if (teil1.length() <= 12 && teil2.length() <= 12) {
					String lastD = "";
					switch (teil2.length()) {
					case 1:
						lastD = "Dahom";
						break;
					case 2:
						lastD = "Sadom";
						break;
					case 3:
						lastD = "Hezarom";
						break;
					case 4:
						lastD = "Dah Hezarom";
						break;
					case 5:
						lastD = "Sad Hezarom";
						break;
					case 6:
						lastD = "Millioniom";
						break;
					case 7:
						lastD = "Dah Millioniom";
						break;
					case 8:
						lastD = "Sad Millioniom";
						break;
					case 9:
						lastD = "Milliardiom";
						break;
					case 10:
						lastD = "Dah Milliardiom";
						break;
					case 11:
						lastD = "Sad Milliardiom";
						break;
					case 12:
						lastD = "Tilliardiom";
						break;
					default:
						break;
					}
					// if the number is like 0.4 it is chahar dahom not sefr.chahar dahom ! then the
					// code's gotta prevent it to happen
					if ("Sefr ".equals(ConvertViewObject.beHoruf(teil1))) {
						if (isTeilTwoZero) {
							System.out.println("Sefr .");
						} else {
							System.out.println(ConvertViewObject.beHoruf(teil2) + lastD + ".");
						}
					} else {
						if (isTeilTwoZero) {
							System.out.println(ConvertViewObject.beHoruf(teil1) + ".");
						} else {
							System.out.println(ConvertViewObject.beHoruf(teil1) + "Momayez "
									+ ConvertViewObject.beHoruf(teil2) + lastD + ".");
						}
					}
				} else {
					System.out.println("Error => Overflowed Digits (Lower Than 12) !");
				}
			}

		} else if (order == 1) {
			// is it aeshari or not?
			if (number.indexOf("Momayez") == -1) {
				number = clearItUp(number);
				System.out.println(ConvertViewObject.beRaqam(number));
			} else {
				String[] teilWord = number.split(" Momayez ");
				String teil1word = teilWord[0];
				String teil2word = teilWord[1];
				teil2word = teil2word.substring(0, teil2word.lastIndexOf(" "));
				teil1word = clearItUp(teil1word);
				teil2word = clearItUp(teil2word);
				String lastWord = teil2word.substring(teil2word.lastIndexOf(" ") + 1);
				System.out.println(ConvertViewObject.beRaqam(teil1word) + "." + ConvertViewObject.beRaqam(teil2word));

			}
		} else {
			System.out.println("Please enter One or Zero !");
		}
	}

	static String clearItUp(String number) {
		// the code wants to put " o " befor hezar and million and milliard if there is
		// any, why you ask? that's just how it works :D
		if (number.indexOf("Hezar") != -1) {
			if (number.indexOf("Hezar") == 0) {
				StringBuffer schlampe = new StringBuffer(number);
				schlampe.insert(0, "Yek o ");
				number = schlampe.toString();
			} else {
				number = number.substring(0, number.indexOf("Hezar")) + "o "
						+ number.substring(number.indexOf("Hezar"), number.length());
			}
		}
		if (number.indexOf("Million") != -1) {
			number = number.substring(0, number.indexOf("Million")) + "o "
					+ number.substring(number.indexOf("Million"), number.length());
		}
		if (number.indexOf("Milliard") != -1) {
			number = number.substring(0, number.indexOf("Milliard")) + "o "
					+ number.substring(number.indexOf("Milliard"), number.length());
		}
		return number;
	}

	// to check if all the numbers are equal, why you ask? refer to line 23 bitte.
	static boolean isEqual(String number) {
		char temp = number.charAt(0);
		for (int i = 1; i < number.length(); i++) {
			if (number.charAt(i) != temp) {
				return false;
			}
		}
		return true;
	}
}

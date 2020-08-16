
public class ConvertView {
	public static String beHoruf(String number) {
		WordPress WordPressObject = new WordPress();
		String answer = "";
		int spot;
		char[] numberArray = new char[number.length()];
		// want an array full of the given number's digits
		for (int i = 0; i < number.length(); i++) {
			numberArray[i] = number.charAt(i);
		}
		String leftNumbers = "";
		for (int i = 0; i < number.length(); i++) {
			spot = i;
			// check if it;s one or it's not, if it is then we have to send the next digit
			// auch, aber wenn nicht, kein brauch !
			if (numberArray[i] != '1') {
				if (WordPressObject.NumToWord(numberArray[i], '0', spot, number) != "") {
					answer += WordPressObject.NumToWord(numberArray[i], '0', spot, number);
					leftNumbers = number.substring(i + 1, number.length());
					if (leftNumbers.length() == 3) {
						answer += " Hezar";
					} else if (leftNumbers.length() == 6) {
						answer += " Million";
					} else if (leftNumbers.length() == 9) {
						answer += " Milliard";
					}
					answer += " o ";
				} else {
					leftNumbers = number.substring(i + 1, number.length());
					if (leftNumbers.length() == 3) {
						if (number.charAt(i - 2) != '0' || number.charAt(i - 1) != '0' || number.charAt(i) != '0') {
							answer = answer.substring(0, answer.length() - 2);
							answer += "Hezar o ";
						}
					} else if (leftNumbers.length() == 6) {
						if (number.charAt(i - 2) != '0' || number.charAt(i - 1) != '0' || number.charAt(i) != '0') {
							answer = answer.substring(0, answer.length() - 2);
							answer += "Million o ";
						}
					} else if (leftNumbers.length() == 9) {
						if (number.charAt(i - 2) != '0' || number.charAt(i - 1) != '0' || number.charAt(i) != '0') {
							answer = answer.substring(0, answer.length() - 2);
							answer += "Milliard o ";
						}
					}
				}
			} else {
				leftNumbers = number.substring(i + 1, number.length());
				// check if 1 is the last digit in the number given, if it is code prevents to
				// check for the next number cause if does the program crashes !
				if (i != number.length() - 1) {
					if (WordPressObject.NumToWord(numberArray[i], numberArray[i + 1], spot, number) != "") {
						answer += WordPressObject.NumToWord(numberArray[i], numberArray[i + 1], spot, number);
						if (leftNumbers.length() == 1 || leftNumbers.length() == 4 || leftNumbers.length() == 7
								|| leftNumbers.length() == 10) {
							i++;
						}
						leftNumbers = number.substring(i + 1, number.length());
						if (leftNumbers.length() == 3) {
							answer += " Hezar";
						} else if (leftNumbers.length() == 6) {
							answer += " Million";
						} else if (leftNumbers.length() == 9) {
							answer += " Milliard";
						}
						answer += " o ";
					}
				} else {
					if (WordPressObject.NumToWord(numberArray[i], '0', spot, number) != "") {
						answer += WordPressObject.NumToWord(numberArray[i], '0', spot, number);
						if (leftNumbers.length() == 1 || leftNumbers.length() == 4 || leftNumbers.length() == 7
								|| leftNumbers.length() == 10) {
							i++;
						}
						leftNumbers = number.substring(i + 1, number.length());
						if (leftNumbers.length() == 3) {
							answer += " Hezar";
						} else if (leftNumbers.length() == 6) {
							answer += " Million";
						} else if (leftNumbers.length() == 9) {
							answer += " Milliard";
						}
						answer += " o ";
					}
				}
			}
		}
		answer = answer.substring(0, answer.length() - 2);
		return answer;
	}

	public static String beRaqam(String number) {
		WordPress WordPressObject = new WordPress();
		long answer = 0L;
		String[] words = number.split(" o ");
		// got for spots by an array for milliard digits, million and hezar and yek
		// digits
		long[] temp = new long[] { 0L, 0L, 0L, 0L };
		for (int i = 0; i < words.length; i++) {
			// 55 stands for "empty number returned which is an Error itself !"
			if (WordPressObject.WordToNum(words[i], answer, i) != 55) {
				if (WordPressObject.WordToNum(words[i], answer, i) == 1000) {
					temp[0] = answer * 1000;
					answer = 0;
				} else if (WordPressObject.WordToNum(words[i], answer, i) == 1000000) {
					temp[1] = answer * 1000000;
					answer = 0;
				} else if (WordPressObject.WordToNum(words[i], answer, i) == 1000000000) {
					temp[2] = answer * 1000000000;
					answer = 0;
				} else {
					answer += WordPressObject.WordToNum(words[i], answer, i);
				}
			}
		}
		// now let's sum all 4 spots
		answer += temp[0] + temp[1] + temp[2] + temp[3];
		// let's convert it to return the answer as a String variable ma man
		String answerString = Long.toString(answer);
		return answerString;
	}
}

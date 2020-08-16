
public class WordPress {
	public static String NumToWord(char number, char secondNumber, int spot, String completeNumber) {
		// Next is the words being returned as the Strings that we have requested from
		// class ConvertView.java
		int left = completeNumber.length() - (spot + 1);
		// just to check if the number requested is or is not 0 itself !
		if (number == '0') {
			if (completeNumber.length() != 1) {
				return "";
			} else {
				return "Sefr";
			}
		} else if (number == '1') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Yek";
			}
			// if the number left beside 1 is 1 it's eleven or ...
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				if (secondNumber == '0') {
					return "Dah";
				} else if (secondNumber == '1') {
					return "Yazdah";
				} else if (secondNumber == '2') {
					return "Davazdah";
				} else if (secondNumber == '3') {
					return "Sizdah";
				} else if (secondNumber == '4') {
					return "Chahardah";
				} else if (secondNumber == '5') {
					return "Panzdah";
				} else if (secondNumber == '6') {
					return "Shunzdah";
				} else if (secondNumber == '7') {
					return "Hefdah";
				} else if (secondNumber == '8') {
					return "Hejdah";
				} else if (secondNumber == '9') {
					return "Nuzdah";
				}
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Sad";
			}
		} else if (number == '2') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Do";
			}
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				return "Bist";
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Divist";
			}
		} else if (number == '3') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Seh";
			}
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				return "Si";
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Sisad";
			}
		} else if (number == '4') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Chahar";
			}
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				return "Chehel";
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Chaharsad";
			}
		} else if (number == '5') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Panj";
			}
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				return "Panjah";
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Pansad";
			}
		} else if (number == '6') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Shesh";
			}
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				return "Shast";
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Sheshsad";
			}
		} else if (number == '7') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Haft";
			}
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				return "Haftad";
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Haftsad";
			}
		} else if (number == '8') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Hasht";
			}
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				return "Hashtad";
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Hashtsad";
			}
		} else if (number == '9') {
			if (left == 0 || left == 3 || left == 6 || left == 9) {
				return "Noh";
			}
			if (left == 1 || left == 4 || left == 7 || left == 10) {
				return "Navad";
			}
			if (left == 2 || left == 5 || left == 8 || left == 11) {
				return "Nohsad";
			}
		}
		return null;
	}

	public static long WordToNum(String word, long answer, int i) {
		// Next is the nubers being returned as the ints that we have requested from
		// class ConvertView.java
		if ("Sefr".equals(word)) {
			return 55;
		} else if ("Yek".equals(word)) {
			return 1;
		} else if ("Do".equals(word)) {
			return 2;
		} else if ("Seh".equals(word)) {
			return 3;
		} else if ("Chahar".equals(word)) {
			return 4;
		} else if ("Panj".equals(word)) {
			return 5;
		} else if ("Shesh".equals(word)) {
			return 6;
		} else if ("Haft".equals(word)) {
			return 7;
		} else if ("Hasht".equals(word)) {
			return 8;
		} else if ("Noh".equals(word)) {
			return 9;
		} else if ("Dah".equals(word)) {
			return 10;
		} else if ("Yazdah".equals(word)) {
			return 11;
		} else if ("Davazdah".equals(word)) {
			return 12;
		} else if ("Sizdah".equals(word)) {
			return 13;
		} else if ("Chahardah".equals(word)) {
			return 14;
		} else if ("Panzdah".equals(word)) {
			return 15;
		} else if ("Shanzdah".equals(word)) {
			return 16;
		} else if ("Hefdah".equals(word)) {
			return 17;
		} else if ("Hejdah".equals(word)) {
			return 18;
		} else if ("Noozdah".equals(word)) {
			return 19;
		} else if ("Bist".equals(word)) {
			return 20;
		} else if ("Si".equals(word)) {
			return 30;
		} else if ("Chehel".equals(word)) {
			return 40;
		} else if ("Panjah".equals(word)) {
			return 50;
		} else if ("Shast".equals(word)) {
			return 60;
		} else if ("Haftad".equals(word)) {
			return 70;
		} else if ("Hashtad".equals(word)) {
			return 80;
		} else if ("Navad".equals(word)) {
			return 90;
		} else if ("Sad".equals(word)) {
			return 100;
		} else if ("Divist".equals(word)) {
			return 200;
		} else if ("Sisad".equals(word)) {
			return 300;
		} else if ("Chaharsad".equals(word)) {
			return 400;
		} else if ("Pansad".equals(word)) {
			return 500;
		} else if ("Sheshsad".equals(word)) {
			return 600;
		} else if ("Haftsad".equals(word)) {
			return 700;
		} else if ("Hashtsad".equals(word)) {
			return 800;
		} else if ("Nohsad".equals(word)) {
			return 900;
		} else if ("Hezar".equals(word)) {
			return 1000;
		} else if ("Million".equals(word)) {
			return 1000000;
		} else if ("Milliard".equals(word)) {
			return 1000000000;
		} else {
			return 1;
		}
	}
}

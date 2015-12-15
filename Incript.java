
public class Incript {

	static String incript(String string) {

		char[][] codeTable = { { 'A', 'B', 'C', 'D', 'E' }, 
							   { 'F', 'G', 'H', 'I', 'J', }, 
			        	       { 'K', 'L', 'M', 'N', 'O' },
				               { 'P', 'Q', 'R', 'S', 'T' }, 
				               { 'U', 'V', 'W', 'X', 'Y' } };

		int firstLetterRow = 0;
		int firstLetterCol = 0;
		int secondLetterRow = 0;
		int secondLetterCol = 0;
		String incoded = "";

		string = string.toUpperCase();

		if (string.length() % 2 != 0) {
			string += 'A';
		}

		for (int index = 0; index < string.length() - 1; index += 2) {
		
			for (int row = 0; row < codeTable.length; row++) {
			
				for (int col = 0; col < codeTable[row].length; col++) {
					
					if (string.charAt(index) == codeTable[row][col]) {
						firstLetterRow = row;
						firstLetterCol = col;
						
					}
					if (string.charAt(index + 1) == codeTable[row][col]) {
						secondLetterRow = row;
						secondLetterCol = col;
						
					}
				}
				
			}
			if ((!(firstLetterRow == secondLetterRow)) && (!(firstLetterCol == secondLetterCol))) {
				incoded += codeTable[firstLetterRow][secondLetterCol];
				incoded += codeTable[secondLetterRow][firstLetterCol];
				
				
				continue;
			}
			if (((firstLetterRow == secondLetterRow)) && (!(firstLetterCol == secondLetterCol))) {
				if (firstLetterCol == codeTable.length-1) {
					firstLetterCol = -1;
				}
				if (secondLetterCol == codeTable.length-1) {
					secondLetterCol = -1;
				}
				incoded += codeTable[firstLetterRow][firstLetterCol+1];
				incoded += codeTable[secondLetterRow][secondLetterCol+1];
				
				continue;
			}
			if ((!(firstLetterRow == secondLetterRow)) && ((firstLetterCol == secondLetterCol))) {
				if (firstLetterRow == codeTable.length-1) {
					firstLetterRow = -1;
				}
				if (secondLetterRow == codeTable.length-1) {
					secondLetterRow = -1;
					System.out.println("qba");
				}
				incoded += codeTable[firstLetterRow+1][secondLetterCol];
				incoded += codeTable[secondLetterRow+1][firstLetterCol];

				continue;
			}
		}

		return incoded;

	}

	static String decript(String string) {

		char[][] codeTable = { { 'A', 'B', 'C', 'D', 'E' }, 
							   { 'F', 'G', 'H', 'I', 'J' }, 
			        	       { 'K', 'L', 'M', 'N', 'O' },
				               { 'P', 'Q', 'R', 'S', 'T' }, 
				               { 'U', 'V', 'W', 'X', 'Y' } };

		int firstLetterRow = 0;
		int firstLetterCol = 0;
		int secondLetterRow = 0;
		int secondLetterCol = 0;
		String decoded = "";

	
		for (int index = 0; index < string.length() - 1; index += 2) {
		
			for (int row = 0; row < codeTable.length; row++) {
			
				for (int col = 0; col < codeTable[row].length; col++) {
					
					if (string.charAt(index) == codeTable[row][col]) {
						firstLetterRow = row;
						firstLetterCol = col;
						
					}
					if (string.charAt(index + 1) == codeTable[row][col]) {
						secondLetterRow = row;
						secondLetterCol = col;
						
					}
				}
				
			}
			if ((!(firstLetterRow == secondLetterRow)) && (!(firstLetterCol == secondLetterCol))) {
				decoded += codeTable[firstLetterRow][secondLetterCol];
				decoded += codeTable[secondLetterRow][firstLetterCol];
				
				
				continue;
			}
			if (((firstLetterRow == secondLetterRow)) && (!(firstLetterCol == secondLetterCol))) {
				if (firstLetterCol == 0) {
					firstLetterCol = codeTable.length;
				}
				if (secondLetterCol == 0) {
					secondLetterCol =codeTable.length;
				}
				decoded += codeTable[firstLetterRow][firstLetterCol-1];
				decoded += codeTable[secondLetterRow][secondLetterCol-1];
				
				continue;
			}
			if ((!(firstLetterRow == secondLetterRow)) && ((firstLetterCol == secondLetterCol))) {
				if (firstLetterRow == 0) {
					firstLetterRow = codeTable.length;
				}
				if (secondLetterRow == 0) {
					secondLetterRow = codeTable.length;
					
				}
				decoded += codeTable[firstLetterRow-1][secondLetterCol];
				decoded += codeTable[secondLetterRow-1][firstLetterCol];

				continue;
			}
		}

		return decoded;

	}

	
	public static void main(String[] args) {

		String lumpen = "voinaimir";

		String shano = incript(lumpen);

		System.out.println(shano);
		
		String stigaShani = decript(shano);
		
		System.out.println(stigaShani);
	}
}

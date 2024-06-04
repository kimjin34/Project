import java.util.Scanner;

class Histogram{
	
	String readString() {
		StringBuffer sb = new StringBuffer(); 
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine(); 
			if(line.equals(";")) 
				break; 
			sb.append(line); 
		}
		scanner.close();
		return sb.toString(); 
	}
	
	public void show() {
		
		char alpbt[] = new char[26]; 
		int count[] = new int[26]; 
		
		for(int i =0;i<alpbt.length;i++) {
			alpbt[i] = (char)(i+65); 
		}
		String upString = readString().toUpperCase(); 
		
		for(int i =0; i<alpbt.length;i++) { 
			for(int j=0;j<upString.length();j++) { 
				if(alpbt[i] == upString.charAt(j)) { 
				count[i]++; 
				}
			}
		}
		
		for(int i = 0; i<alpbt.length;i++) {
			System.out.print(alpbt[i]); 
			for(int j = 0; j < count[i]; j++) {
				System.out.print("-");
			}
			System.out.println();	
		}
	}
}

public class Problem14 {
	public static void main(String[] args) {
		Histogram h = new Histogram(); 
		h.show();	
	}
}

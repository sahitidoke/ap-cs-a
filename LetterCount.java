import java.util.Scanner;
/**
 *	Counts the frequency of letters in a file and produces a histogram.
 *
 *	@author	Sahiti Doke
 *	@since	September 14, 2023 
 */
public class LetterCount {
	
	// Fields go here, all must be private
	private Scanner sc;
	private int arr[] = new int[26];
	/* Constructor */							
	public LetterCount() {}
	
	/* Main routine */
	public static void main(String[] args) {
		LetterCount lc = new LetterCount();
		if (args.length != 1)
			System.out.println("Usage: java LetterCount <inputFile>");
		else
			lc.run(args);
	}
	/**	The core program of the class, it
	 *	- opens the input file
	 *	- reads the file and counts the letters
	 *	- closes the input file
	 *	- prints the histogram of the letter count
	 */
	public void run(String[] args) {
		String fileName = args[0];
		sc = FileUtils.openToRead(fileName);
		letterCount();	
		for (int i=0; i<26;i++){
			System.out.println(arr[i]);
		}
	}
	public void letterCount(){
		int let = 0;
		int idx =0;
	    for (int j=97; j<122;j++){
			while(sc.hasNext()){
				String str = sc.next().toLowerCase();
				for (int i=0;i < str.length(); i++){
					if (str.charAt(i)==(char)j)
						let++;
				}
			}
			arr[idx]=let;
			let=0;
			idx++;
		}
	}
}
	
	


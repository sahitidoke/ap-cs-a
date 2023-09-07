
import java.util.Scanner;
public class USMap {
	Scanner input2 = FileUtils.openToRead("bigCities.txt");
	double y;
	double x;
	double population [] = new double [276];
	public static void main(String [] args){
		USMap usmap = new USMap();
		usmap.setupCanvas();
	}
	public void setupCanvas() {
		double population [] = new double [276];
		StdDraw.setTitle("USMap");
		StdDraw.setCanvasSize(900, 512);
		StdDraw.setXscale(128.0, 65.0);
		StdDraw.setYscale(22.0, 52.0);
		StdDraw.setPenRadius(0.006);
		StdDraw.setPenColor(StdDraw.BLACK);
        Scanner input=  FileUtils.openToRead("cities.txt");
        int x=0;
         while (input.hasNext()){
			 y = input.nextDouble();
			 x = input.nextDouble();
			System.out.println(y + "  " + x);
			StdDraw.point(x, y);
			input.nextLine();
		} 
        while (input2.hasNext()){
			population[x] = 0.6 * (Math.sqrt(pop())/18500);
		}
		for (int i =0; i<10; i++){
			StdDraw.setPenRadius(population[x]);
			StdDraw.point(
		}
		
       
		
		
	}
	public void pop (){
		input2.next();
		input2.next();
		if (input2.next().equals(",")){
			input2.next();
			return input2.nextInt();
		}
		else{
			if (input2.next().equals(",")){
				input2.next();
				return input2.nextInt() ;
			}
			else{
				input2.next();
				input2.next();	
				return input2.nextInt() ;
				
			}
			
		}
	}
}

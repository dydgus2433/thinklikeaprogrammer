import java.util.ArrayList;
import java.util.Scanner;

public class colorpaper {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int paperCnt = sc.nextInt();
		
		int[][] largePaper = new int[101][101];
		
		ArrayList<Paper> paperArr = new ArrayList<>();
		int[] paperCntArr = new int[paperCnt];
		for(int i =0; i < paperCnt; i++) {
			Paper paper = new Paper(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			paperArr.add(paper);
		}
		
		
		for(int i = 0; i < paperArr.size(); i++) {
			Paper p = paperArr.get(i);
			
			
			for(int w = 0; w < p.width; w++) {
				
				for(int h = 0; h < p.height; h++) {
					
					largePaper[p.startX+w][p.startY+h] = i+1;
					
				}
				
			}
		}
		
		for(int w = 0; w < 101; w++) {
			
			for(int h = 0; h < 101; h++) {
				
				if(largePaper[w][h] != 0) {
					paperCntArr[largePaper[w][h]-1]++;
				}
				
			}
			
		}
		
		for(int i = 0; i < paperCntArr.length; i++) {
			System.out.println(paperCntArr[i]);
		}
		
		

	}

}

class Paper{
	int startX = 0;
	int startY = 0;
	int width = 0;
	int height = 0;
	
	
	
	public Paper(int startX, int startY, int width, int height) {
		super();
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}
	public int getStartX() {
		return startX;
	}
	public void setStartX(int startX) {
		this.startX = startX;
	}
	public int getStartY() {
		return startY;
	}
	public void setStartY(int startY) {
		this.startY = startY;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	} 
	
}
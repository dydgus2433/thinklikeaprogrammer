import java.util.Scanner;
 
public class tetris {
 
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int width = sc.nextInt();
        int height = sc.nextInt();
        
        int[][] map = new int[height][width];
        
        int[] resultMap = new int[width];
        
        for(int i = 0; i < height; i++) {            
            for(int j =0; j < width; j++) {
                map[i][j] = sc.nextInt();                
            }            
        }
        
        
        
        int x = 0;
        int result = 0;
        
        for(int i = 0; i < height; i++) {    
            
            int cnt = 0;
            int init = 0;
            for(int j =0; j < width; j++) {
            	
                if(map[i][j] == 1) {
                    cnt++;
                }else {
                	init = j;
                }
                if(cnt == width - 1 && resultMap[init] < 4) {
                    resultMap[init]++;
                }
            }    
            
            
        }
        
        
        for(int i =0; i < width; i++) {
            
            if(result < resultMap[i]) {
                int limit = 0;
                for(int k =0; k < height; k++) {
                    if(map[k][i]==0) {
                        limit++;
                    }else {
                        break;
                    }
                }
                
                if(limit > 3) {
                	 x = i+1;
                     result = resultMap[i];  
                    
                }
                    
                    
                
            }
            
        }
        	System.out.println(x + " " + result);
       
 
        
        
 
    }
 
}
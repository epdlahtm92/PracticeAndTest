class Solution {
	  public int[] solution(String[] wallpaper) {
	    	int firstY = 50;
	    	int firstX = 50;
	    	
	    	int lastY = 0;
	    	int lastX = 0;
	    	
	        for(int index = 0; index < wallpaper.length; index++) {
	           String line = wallpaper[index];
	           if (line.contains("#") == true) {
	        	   firstY = Math.min(firstY, index);
	        	   lastY = Math.max(lastY, index);
	            }
	            for(int num = 0; num < line.length(); num++) {
	        	   if (line.substring(num, (num + 1)).equals("#") == true) {
	        		   firstX = Math.min(firstX, num);
	            	   lastX  = Math.max(lastX, num);
	        	   }
	            } 
	        }
          
            int[] answer = {firstY, firstX, (lastY + 1), (lastX + 1)};
	        return answer;
    }
}
package Q2;
	
	import java.util.Random;

	public class Lottery {
	    private int[] lotteryNum;
		private int x;
	    
	    public Lottery() {
	        Random randm = new Random();
	        setLotteryNumbers(new int[5]);
	        
	        for (int i = 0; i < 5; i++) {
	            getLotteryNumbers()[i] = randm.nextInt(10);
	        }
	    }
	    public void setLotteryNumbers(int[] lotteryNumbers) {
			this.lotteryNum = lotteryNumbers;
		}
	 
		public int[] getLotteryNumbers() {
			return lotteryNum;
		}


	public int compareLottery(int array) {
		
		for(int i=0;i<lotteryNum[i];i++) {
			
			if(array==lotteryNum[i]) {
				
				x++;
			}
		}
		return x;
		

	}
	}



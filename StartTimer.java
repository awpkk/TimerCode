class StartTimer{
	public static void main(String args[]){
		int timer = 0;
		while(true){
			System.out.println(timer+" minutes!");
			try{
				Thread.sleep(1200000);
			}catch(Exception e){};
			
			timer++;
			for(int x=0;x<10;x++)
			{
				java.awt.Toolkit.getDefaultToolkit().beep();
				try{
				Thread.sleep(500);
				}catch(Exception e){};
			}
		}
	}
}

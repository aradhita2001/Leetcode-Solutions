class AcceptedSolution {
	public int minMaxGame(int[] nums) {
		while(nums.length>1){

			int [] newNum = new int [nums.length/2];

			for(int i=0; i<newNum.length; ++i){
				if(i%2==0)
					newNum[i] = Math.min(nums[i*2], nums[i*2+1]);
				else 
					newNum[i] = Math.max(nums[i*2], nums[i*2+1]);
			}

			nums = newNum; 
		}   
		return nums[0];
	}
}
package circulation;

public class Day1 {

	/**
	 * 输出100~999中所有的水仙花数
	 */
	public static void daffodil(){
		//个位
		int unit=0;
		//十位
		int decade=0;
		//百位
		int hundreds=0;
		
		for(int i=100;i<1000;i++){
			hundreds=i/100;
			decade=(i%100)/10;
			unit=i%100%10;
			if(i == hundreds*hundreds*hundreds+decade*decade*decade+unit*unit*unit){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		daffodil();
	}

}

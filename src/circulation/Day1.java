package circulation;

public class Day1 {

	/**
	 * ���100~999�����е�ˮ�ɻ���
	 */
	public static void daffodil(){
		//��λ
		int unit=0;
		//ʮλ
		int decade=0;
		//��λ
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

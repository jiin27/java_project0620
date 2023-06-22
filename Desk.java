public class Desk {
	int x;
	static int y;
	
	{ //A
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
	static { //B
		for(int i=0;i<20;i++){
			y++;
		}
	}
	                              
	public static void main(String[] args){
		//System.out.println(x); //C
		int a=new Desk().x; //D
		System.out.println(a); //E int a로 변수가 해당 main()메서드 내 정상적으로 명시 됐으므로 a값을 받음.
		System.out.println(y); //F
		
	}
}

//실행 순서는 B > C(오류남) > D > 
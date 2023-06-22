class BraceTest{
	//아래의 {}영역은 인스턴스 초기화 블럭이다
	//이 블럭은 BraceTest 클래스로부터 인스턴스가 생성될 때마다 실행된다
	{
		System.out.println("전 인스턴스 초기화 블럭이에요");
	}

	//클래스가 로드될 때 실행되는 영역 
	//static 초기화 블럭
	static{
		System.out.println("저 Load됐어요");
	}
	
	//load 되어 메모리에 데이터가 올라온 다음 실행부 main() 메서드+가 실행된다.

	public static void main(String[] args){
		//실행이란 코드가 메모리에 올라와야 가능하기 때문에
		//static 초기화 블럭이 먼저 동작한다.
		System.out.println("main() 호출됨");
		new BraceTest();
		new BraceTest();
		new BraceTest();
	}
}
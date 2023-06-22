class Dog{
	String name="뽀미";
	static int age=9;

	public static void main(String[] args){
		System.out.println(age); 
		//-> age 변수도 static, main() 메서드도 static. 즉, 둘다 Dog 원본 클래스 소속이므로 
		//클래스명을 굳이 명시하지 않아도 된다..!
	}
}
class BraceTest{
	//�Ʒ��� {}������ �ν��Ͻ� �ʱ�ȭ ���̴�
	//�� ���� BraceTest Ŭ�����κ��� �ν��Ͻ��� ������ ������ ����ȴ�
	{
		System.out.println("�� �ν��Ͻ� �ʱ�ȭ ���̿���");
	}

	//Ŭ������ �ε�� �� ����Ǵ� ���� 
	//static �ʱ�ȭ ��
	static{
		System.out.println("�� Load�ƾ��");
	}
	
	//load �Ǿ� �޸𸮿� �����Ͱ� �ö�� ���� ����� main() �޼���+�� ����ȴ�.

	public static void main(String[] args){
		//�����̶� �ڵ尡 �޸𸮿� �ö�;� �����ϱ� ������
		//static �ʱ�ȭ ���� ���� �����Ѵ�.
		System.out.println("main() ȣ���");
		new BraceTest();
		new BraceTest();
		new BraceTest();
	}
}
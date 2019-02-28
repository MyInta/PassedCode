package MyInterface;

public interface InterfaceA {
	void aaa();
}

interface InterfaceB{
	void bbb();
}

interface InterfaceC extends InterfaceA,InterfaceB{
	void ccc();
}

class InterfaceTest implements InterfaceC {

	@Override
	public void aaa() {
		System.out.println("aaa ");
		
	}

	@Override
	public void bbb() {
		System.out.println("bbb ");
		
	}

	@Override
	public void ccc() {
		System.out.println("ccc ");
		
	}
	
}
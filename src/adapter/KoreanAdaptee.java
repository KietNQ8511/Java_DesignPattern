package adapter;

public class KoreanAdaptee implements Adaptee {
	
	@Override
	public void receive(String words) {
		System.out.print("Korea\tretrieving words from adapter ...\t");
		System.out.println(words);
	}
}

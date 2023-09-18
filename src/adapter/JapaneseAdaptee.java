package adapter;

public class JapaneseAdaptee implements Adaptee {
	
	@Override
	public void receive(String words) {
		System.out.print("Japan\tretrieving words from adapter ...\t");
		System.out.println(words);
	}
}

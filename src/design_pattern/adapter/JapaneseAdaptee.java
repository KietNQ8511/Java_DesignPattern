package design_pattern.adapter;

public class JapaneseAdaptee implements Adaptee {
	@Override
	public void receive(String words) {
		System.out.println("Retrieving words from Adapter...[JapaneseAdaptee]");
		System.out.println(words);
	}
}

package design_pattern.adapter;

public class TranslatorAdapter implements VietnameseTarget {

	JapaneseAdaptee jAdaptee;

	public TranslatorAdapter(JapaneseAdaptee adaptee) {
		this.jAdaptee = adaptee;
	}

	@Override
	public void send(String words) {
		// TODO Auto-generated method stub
		System.out.println("Reading words ...");
		System.out.println(words);
		String vietnameseWords = this.translate(words);
		System.out.println("Sending words");
		jAdaptee.receive(vietnameseWords);
	}

	private String translate(String vietnameWords) {
		System.out.println("Translated!");
		return "こんにちは";
	}
}

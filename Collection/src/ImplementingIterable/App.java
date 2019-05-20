package ImplementingIterable;

public class App {
	public static void main(String[] args) {
		UrlLibrary urlLibrary = new UrlLibrary();
		
		// I can use for each becuase UrlLibrary class implements Iterator
		for(String html: urlLibrary) {
			System.out.println(html);
			System.out.println(html.length());
		}
	}
}

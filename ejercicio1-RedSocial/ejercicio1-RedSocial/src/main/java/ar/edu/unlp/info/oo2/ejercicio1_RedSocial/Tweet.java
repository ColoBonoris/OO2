package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

public class Tweet {
	
	private String cont;
	
	public Tweet(String content) {
		if((content == null) || (content.length() < 0)) {
			throw new IllegalArgumentException("Tweet under character minimum (1)");
		}
		if(content.length() > 280) {
			throw new IllegalArgumentException("Tweet over character maximum (280)");
		}
		this.cont = content.toString();
	}
	
	public String getCont() {
		return this.cont.toString();
	}
	
}

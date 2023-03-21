package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

public class ReTweet extends Tweet {
	
	private Tweet ref;
	
	public ReTweet(String content, Tweet reference) {
		super(content);
		this.ref = reference;
	}
	
	public Tweet getReference() {
		return this.ref;
	}
	
}

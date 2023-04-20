package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

public class ReTweet extends Tweet {
	
	private Tweet ref;
	
	public ReTweet(String content, Tweet reference) {
		super(content);
		this.ref = reference;
	}
	
	public boolean references(Tweet tweet) {
		return this.ref == tweet;
	}
	
	public Tweet getReference() {
		return this.ref;
	}
	
	public void referenceUnavailable() {
		this.ref = null;
	}
	
}

package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

import java.util.List;

public class Usuario {
	
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public List<Tweet> deleteTweets(){
		List<Tweet> deleted = this.getTweets();
		this.tweets = null;
		return deleted;
	}
	
	public Tweet tweet() {
		String content = "Texto de prueba, aca va el scanner";
		Tweet newTweet = new Tweet(content);
		tweets.add(newTweet);
		
		return newTweet;
	}
	
	public ReTweet reTweet(Tweet reference) {
		String content = "Texto de prueba, aca va el scanner";
		ReTweet newTweet = new ReTweet(content, reference);
		tweets.add(newTweet);
		
		return newTweet;
	}
	
}

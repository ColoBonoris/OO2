package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Tweet tweet(Usuario user) {
		return user.tweet();
	};
	public ReTweet retweet(Usuario user, Tweet reference) {
		return user.reTweet(reference);
	}
	
	public Usuario getUser(String screenName) {
		return ( this.usuarios.stream()
			.filter(usuario -> usuario.getScreenName() == screenName )
			.findFirst()
			.orElse(null)
		);
	}
	
	private boolean screenNameAvailable(String screenName){
		return ( this.usuarios.stream()
			.map(usuario -> usuario.getScreenName())
			.toList()
			.contains(screenName)
		);
	}
	
	public Usuario createUser(String screenName) {
		if(! screenNameAvailable(screenName)) return null;
		return new Usuario(screenName);
	}
	
	public void deleteUser(String screenName) {
		Usuario user = this.getUser(screenName);
		if(user == null) return;
		
		user.deleteTweets().stream().forEach(tweet -> this.deleteRetweets(tweet));
		this.usuarios.remove(user);
	}
	
	private void deleteRetweets(Tweet tweet) {
		this.usuarios.stream().forEach(usuario -> usuario.modifyReTweets(tweet));
	}
}

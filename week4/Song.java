package com.hackbulgaria.programming51.week4;

public class Song {
	private String name;
	private String artist;
	private int duration;
	private String album;
	
	public Song(String name,String artist,int duration,String album){
		this.setName(name);
		this.setArtist(artist);
		this.setDuration(duration);
		this.setAlbum(album);
	}
	
	public String toString(){
		return "Song: " + getName() + "Artist: " + getArtist() + "Duration: " + getDuration() + "Album: " + getAlbum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
}

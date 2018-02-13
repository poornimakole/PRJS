package com.psl.q2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Movie implements Comparable<Movie> {
	String name, language;
	Date releaseDate;
	String director, producer;
	float duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
		
		String strd=sdf.format(getReleaseDate());
		return "\nMovie :" + getName() + "   " + getLanguage() + "   "
				+ strd+"   " + getDirector() + "   "
				+ getProducer() + "   " + getDuration();
	}

	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.language.compareTo(m.language);
	}	

}

package com.psl.q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class SortMovies {
	
	public List<Movie> createMovieList()
	{
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
		
		Movie m1=new Movie();
		m1.setName("barfi");
		m1.setLanguage("hindi");
		try {
			m1.setReleaseDate(sdf.parse("06/07/2013"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m1.setDirector("def");
		m1.setProducer("xyz");
		m1.setDuration(2.34f);
		
		Movie m2=new Movie();
		m2.setName("spiderman");
		m2.setLanguage("english");
		try {
			m2.setReleaseDate(sdf.parse("21/10/2010"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.setDirector("bbb");
		m2.setProducer("pqr");
		m2.setDuration(2.20f);
		
		Movie m3=new Movie();
		m3.setName("sairat");
		m3.setLanguage("marathi");
		try {
			m3.setReleaseDate(sdf.parse("17/03/2016"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m3.setDirector("pqr");
		m3.setProducer("aaaa");
		m3.setDuration(2.28f);
		
		Movie m4=new Movie();
		m4.setName("coffee");
		m4.setLanguage("marathi");
		try {
			m4.setReleaseDate(sdf.parse("17/03/2015"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m4.setDirector("ddd");
		m4.setProducer("acc");
		m4.setDuration(2.33f);
		
		Movie m5=new Movie();
		m5.setName("dhamaal");
	    m5.setLanguage("hindi");
	    try {
			m5.setReleaseDate(sdf.parse("09/07/2009"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m5.setDirector("xpr");
		m5.setProducer("acc");
		m5.setDuration(2.27f);
		
		List<Movie> movie =new ArrayList<Movie>();
		movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		movie.add(m4);
		movie.add(m5);
		
		return movie;
		
	}

	public void sortByLanguage(List<Movie> movies)
	{
		Collections.sort(movies);
	}
	public void sortByDuration(List<Movie> movies)
	{
		Collections.sort(movies, new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				// TODO Auto-generated method stub
				int i=0;
				if(m1.duration>m2.duration){
					i=1;
				}else if(m1.duration<m2.duration){
					i=-1;
				}
				
				return i;
			}
		});
	}
	public void SortByLanguageAndReleaseDate(List<Movie> movies)
	{
		Collections.sort(movies,new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				// TODO Auto-generated method stub
				int i= m1.language.compareTo(m2.language);
				  if(i==0)
				  {
					return m1.releaseDate.compareTo(m2.releaseDate);
					  
				  }
				return i;
				
			}
		});
	}
	

	public static void main(String[] args) 
	{
		SortMovies sm=new SortMovies();
		
		List<Movie> movies =new ArrayList<Movie>();
		 movies= sm.createMovieList();
		
		 System.out.println("Before sorting:" +movies);	
			 sm.sortByLanguage(movies);
		System.out.println("\nAfter sorting by language:" +movies);
		    Collections.sort(movies,new Comparator<Movie>() {
		    	@Override
		    	public int compare(Movie m1, Movie m2) {
		    		// TODO Auto-generated method stub
		    		return m1.director.compareTo(m2.director);
		    	}

			});
		System.out.println("\nAfter sorting by director:" +movies);
		     sm.sortByDuration(movies);
        System.out.println("\nAfter sorting by duration:" +movies);
             sm.SortByLanguageAndReleaseDate(movies);
        System.out.println("\nAfter sorting by language and releasedate:" +movies);   
		 
 		
	}
}

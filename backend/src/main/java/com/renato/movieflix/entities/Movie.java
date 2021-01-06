package com.renato.movieflix.entities;

import java.io.Serializable;

public class Movie implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String tittle;
	private String subtittle;
	private Integer year;
	private String imgUrl;
	private String synopsis;
	
	private Genre genre;
	
	public Movie() {
	}
	
	public Movie(Long id, String tittle, String subtittle, Integer year, String imgUrl, String synopsis, Genre genre) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.subtittle = subtittle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genre = genre;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getSubtittle() {
		return subtittle;
	}

	public void setSubtittle(String subtittle) {
		this.subtittle = subtittle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

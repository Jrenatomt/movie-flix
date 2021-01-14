package com.renato.movieflix.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.renato.movieflix.entities.Genre;
import com.renato.movieflix.entities.Movie;
import com.renato.movieflix.entities.Review;

public class MovieDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String tittle;
	private String subTittle;
	private Integer year;
	private String imgUrl;
	private String synopsis;

	private Genre genre;
	
	private List<Review> reviews = new ArrayList<>();
	
	public MovieDTO() {
	}

	public MovieDTO(Long id, String tittle, String subTittle, Integer year, String imgUrl, String synopsis,
			Genre genre) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.subTittle = subTittle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genre = genre;
	}
	
	public MovieDTO(Movie entity) {
		super();
		id = entity.getId();
		tittle = entity.getTittle();
		subTittle = entity.getsubTittle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getSynopsis();
		genre = entity.getGenre();
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

	public String getSubTittle() {
		return subTittle;
	}

	public void setSubTittle(String subTittle) {
		this.subTittle = subTittle;
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

	public List<Review> getReviews() {
		return reviews;
	}	
}

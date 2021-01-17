package com.renato.movieflix.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.renato.movieflix.entities.Movie;
import com.renato.movieflix.entities.Review;

public class MovieDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String subTitle;
	private Integer year;
	private String imgUrl;
	private String synopsis;

	private Long genreId;

	private List<ReviewDTO> reviews = new ArrayList<>();

	public MovieDTO() {
	}

	public MovieDTO(Long id, String title, String subTitle, Integer year, String imgUrl, String synopsis,
			Long genreId) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genreId = genreId;
	}

	public MovieDTO(Movie entity) {
		super();
		id = entity.getId();
		title = entity.getTitle();
		subTitle = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getSynopsis();
		genreId = entity.getGenre().getId();
	}

	public MovieDTO(Movie entity, List<Review> reviews) {
		this(entity);
		reviews.forEach(x -> this.reviews.add(new ReviewDTO(x)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String tittle) {
		this.title = tittle;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTittle) {
		this.subTitle = subTittle;
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

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public List<ReviewDTO> getReviews() {
		return reviews;
	}
}

package com.pesquisa.dto;

import com.pesquisa.entities.Game;
import com.pesquisa.entities.enums.Platform;

public class GameDTO {

	private Long id;
	private String title;
	private Platform platform;
	
	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
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

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
	
	
}

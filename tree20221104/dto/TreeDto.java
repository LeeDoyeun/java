package tree20221104.dto;

import java.time.LocalDateTime;

public class TreeDto {

	String name;
	int price;
	int exp;
	int nowPlanted;
	int maxPlanted;
	LocalDateTime grownDate;
	int growingHour;

	public TreeDto() {
		super();
	}

	public TreeDto(String name, int price, int exp, int nowPlanted, int maxPlanted, LocalDateTime grownDate) {
		super();
		this.name = name;
		this.price = price;
		this.exp = exp;
		this.nowPlanted = nowPlanted;
		this.maxPlanted = maxPlanted;
		this.grownDate = grownDate;
	}

	public TreeDto(String name, int price, int exp, int nowPlanted, int maxPlanted, int growingHour) {
		super();
		this.name = name;
		this.price = price;
		this.exp = exp;
		this.nowPlanted = nowPlanted;
		this.maxPlanted = maxPlanted;
		this.growingHour = growingHour;
		grownDate = LocalDateTime.now().plusHours(growingHour);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getNowPlanted() {
		return nowPlanted;
	}

	public void setNowPlanted(int nowPlanted) {
		this.nowPlanted = nowPlanted;
	}

	public int getMaxPlanted() {
		return maxPlanted;
	}

	public void setMaxPlanted(int maxPlanted) {
		this.maxPlanted = maxPlanted;
	}

	public LocalDateTime getGrownDate() {
		return grownDate;
	}

	public void setGrownDate(LocalDateTime grownDate) {
		this.grownDate = grownDate;
	}

	public int getGrowingHour() {
		return growingHour;
	}

	public void setGrowingHour(int growingHour) {
		this.growingHour = growingHour;
	}

}
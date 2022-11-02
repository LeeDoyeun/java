package animal20221102.dto;

import java.time.LocalDateTime;
import java.util.Objects;

//dto에 추가해야 할 것들
//1. getter,setter
//2. 생성자
//3. equals hashcode
//4. toString

public class AnimalDto {

	private String name;
	private Integer age;
	private Double weight;
	private LocalDateTime datetime;
	public AnimalDto() {
	}
	public AnimalDto(String name, Integer age, Double weight, LocalDateTime datetime) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.datetime = datetime;
	}
	public AnimalDto(AnimalDto dto) {
		super();
		this.name = dto.name;
		this.age = dto.age;
		this.weight = dto.weight;
		this.datetime = dto.datetime;
	}
	
	@Override
	public String toString() {
		return "AnimalDto [name=" + name + ", age=" + age + ", weight=" + weight + ", datetime=" + datetime + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalDto other = (AnimalDto) obj;
		return Objects.equals(name, other.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
}

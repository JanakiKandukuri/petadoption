package com.springmvc.petadoption.pojo;

import java.io.File;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="animal")
public class Animal {
	
	@Id
	@GeneratedValue
	private int animalId;
	
//	@Basic
//	@Column()
	private String animalName;
	private String animalType;
	private String breed;
	private String color;
	private Date dateOfBirth;
	private String weight;
	private File image;
	private int age;
	private String disease;
	private String vaccinations;
	
	//forigen keys @ManytoOne - 
	private String vetId;
	private String ownerId;
	
	
	public Animal() {
		
	}
	
	public int getAnimalId() {
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getVacinations() {
		return vaccinations;
	}
	public void setVacinations(String vaccinations) {
		this.vaccinations = vaccinations;
	}
	public String getVetId() {
		return vetId;
	}
	public void setVetId(String vetId) {
		this.vetId = vetId;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	
	

}

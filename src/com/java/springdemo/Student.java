package com.java.springdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;

	private String lastName;

	private String country;

	private String favoriteLanguage;

	private String[] operatingSystems;

	private LinkedHashMap<String, String> countryOptions;

	private LinkedHashMap<String, String> favoriteLanguageOptions;

	private LinkedHashMap<String, String> operatingSystemsOptions;

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();

		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("US", "USA");

		favoriteLanguageOptions = new LinkedHashMap<String, String>();

		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("NodeJS", "NodeJS");
		favoriteLanguageOptions.put("GO", "GO");

		operatingSystemsOptions = new LinkedHashMap<String, String>();

		operatingSystemsOptions.put("Linux", "Linux");
		operatingSystemsOptions.put("Mac OS", "Mac OS");
		operatingSystemsOptions.put("windows", "windows");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public LinkedHashMap<String, String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}

	public void setOperatingSystemsOptions(LinkedHashMap<String, String> operatingSystemsOptions) {
		this.operatingSystemsOptions = operatingSystemsOptions;
	}

}

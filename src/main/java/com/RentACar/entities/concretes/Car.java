package com.RentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cars")
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private int carId;
	
	@Column(name = "daily_price")
	private int dailyPrice;
	
	@Column (name = "model_year")
	private String modelYear;
	
	@Column (name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn (name = "brand_id")
	private Brand brand;
	
	@ManyToOne
	@JoinColumn (name = "color_id")
	private Color color;
	
	/*@OneToMany(mappedBy="car") // mappedBy'a bir bak 
	private List<CarMaintenance> carMaintenances;

    @OneToMany(mappedBy = "car")
    private List<Rental> rentals;*/
}
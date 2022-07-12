package com.starixc.hrhapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class County {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String county;
		private Integer regionid;
		private String burden_category;
		private Integer active;
		
		@OneToMany(mappedBy = "county")
		private List<Subcounty> subcounties;


}

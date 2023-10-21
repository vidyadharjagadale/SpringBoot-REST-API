package com.infotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Actor_JPA_Data")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Actor_ID")
	private Integer aid;
	@Column(name = "Actor_Name")
	private String aname;
	@Column(name="Actor_CATEGAORY")
	private String categaory;
	@Column(name = "ACTOR_MOBILENO")
	private Long mobileNo;

}

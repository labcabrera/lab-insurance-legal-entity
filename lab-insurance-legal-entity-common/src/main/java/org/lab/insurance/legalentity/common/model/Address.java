package org.lab.insurance.legalentity.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Address {

	@Id
	private String id;

	private String roadName;
	private String roadNumber;
	private Country country;
	private Province province;
	private Locality locality;
	private String zipCode;

}

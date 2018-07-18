package org.lab.insurance.legalentity.common.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class InsuranceAuditEvent {

	@Id
	String id;

	Date timeStamp;

	String name;

	String category;

	Object data;

}

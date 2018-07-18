package org.lab.insurance.legalentity.common.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * Clase base de entidades fisicas y juridicas.
 */
@Data
@Document
public abstract class AbstractLegalEntity {

	@Id
	protected String id;

	protected IdCard idCard;

	protected Address postalAddress;

	protected Address fiscalAddress;

	protected ContactInformation contactInformation;

	private List<Account> accounts;

	protected String name;

	protected String internalCode;

	protected String externalCode;

	protected InsuranceAuditData auditData;

	@SuppressWarnings("unchecked")
	public <T> T as(Class<? extends AbstractLegalEntity> entityClass) {
		return (T) this;
	}

}

package org.lab.insurance.legalentity.common.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IdCard {

	private String number;
	private IdCardType type;

}

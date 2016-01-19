package com.payment.comm.base.domain;

import org.springframework.hateoas.Identifiable;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEntity implements Identifiable<String>, Serializable {

	private static final long serialVersionUID = 1L;

}

package com.roifmr.spring.early_spring.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class Fund {
	
	private long id;
	private String shortName;
	private String description;
	private BigDecimal currentValue;
	
	public Fund() {
		super();
		this.id = Instant.now().getEpochSecond();
		this.currentValue = BigDecimal.ZERO;
	}

	public Fund(String shortName, String description, BigDecimal currentValue) {
		this();
		this.shortName = shortName;
		this.description = description;
		this.currentValue = currentValue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(BigDecimal currentValue) {
		this.currentValue = currentValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentValue, description, id, shortName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fund other = (Fund) obj;
		return Objects.equals(currentValue, other.currentValue) && Objects.equals(description, other.description)
				&& id == other.id && Objects.equals(shortName, other.shortName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fund [getId()=");
		builder.append(getId());
		builder.append(", getShortName()=");
		builder.append(getShortName());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getCurrentValue()=");
		builder.append(getCurrentValue());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}

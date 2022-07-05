package uk.co.management.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "NewProduct")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FirstPage<FirstPageCompositeKey> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private FirstPageCompositeKey firstPageCompositeKey;
	
	@Column(name = "value")
	private Float value;
	@Id
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	private Long id;
	private String product;
	private BigDecimal quantity;
}

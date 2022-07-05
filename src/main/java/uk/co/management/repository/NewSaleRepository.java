package uk.co.management.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import uk.co.management.entities.NewSale;

@Repository
public interface NewSaleRepository extends JpaRepository<NewSale, Long>{

	@Query(value = "SELECT sum(value) FROM NewSale")
    public BigDecimal allValueSale();
}

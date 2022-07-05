package uk.co.management.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import uk.co.management.entities.NewOverheadCost;

@Repository
public interface NewOverheadCostRepository extends JpaRepository<NewOverheadCost, Long> {

	@Query(value = "SELECT sum(value) FROM NewOverheadCost")
    public BigDecimal allValueNOC();
}

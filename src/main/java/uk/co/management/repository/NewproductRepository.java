package uk.co.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uk.co.management.entities.NewProduct;

public interface NewproductRepository extends JpaRepository<NewProduct, Long>{

}

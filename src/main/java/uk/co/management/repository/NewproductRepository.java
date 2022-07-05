package uk.co.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uk.co.management.entities.NewProduct;

@Repository
public interface NewproductRepository extends JpaRepository<NewProduct, Long>{

}

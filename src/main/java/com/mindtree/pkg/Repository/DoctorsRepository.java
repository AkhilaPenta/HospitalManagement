package com.mindtree.pkg.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindtree.pkg.Entity.Doctors;
@Repository
public interface DoctorsRepository extends JpaRepository<Doctors,Integer>{
	Doctors findByName( String name);
}
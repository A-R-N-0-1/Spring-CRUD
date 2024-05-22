package admin_user.repositories;




import java.util.List;

import org.springframework.data.repository.CrudRepository;

import admin_user.model.Meddetail;



public interface MedUserRepository extends CrudRepository<Meddetail, Integer> {

	List<Meddetail> findByMedicinenameContaining(String keyword);	
	

	
}
	


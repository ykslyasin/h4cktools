package ykslyasin.h4cktools.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Ringtone;


public interface RingtoneDao extends JpaRepository<Ringtone, Integer>{

	Ringtone getByRingtoneName(String ringtoneName);
	
	Ringtone getByRingtoneCategory(Categories ringtoneCategory);
	
	Ringtone getById(int ringtoneId);
}

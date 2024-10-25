package ykslyasin.h4cktools.business.abstracts;

import java.util.List;

import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Ringtone;


public interface RingtoneService {

	DataResult<List<Ringtone>> getAll();
	
	Result add(Ringtone ringtone);
	
	DataResult<Ringtone> getByRingtoneName(String ringtoneName);
	
	DataResult<Ringtone> getById(int ringtoneId);
	
	DataResult<Ringtone> getByRingtoneCategory(Categories ringtoneCategory);
	
	/*List<Ringtone> getAll();*/
	
}

package ykslyasin.h4cktools.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ykslyasin.h4cktools.business.abstracts.RingtoneService;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.core.utilities.results.SuccessDataResult;
import ykslyasin.h4cktools.core.utilities.results.SuccessResult;
import ykslyasin.h4cktools.dataAccess.RingtoneDao;
import ykslyasin.h4cktools.entities.concretes.Categories;
import ykslyasin.h4cktools.entities.concretes.Ringtone;

@Service
public class RingtoneManager implements RingtoneService{

	private RingtoneDao ringtoneDao;
	
	@Autowired
	public RingtoneManager(RingtoneDao ringtoneDao) {
		super();
		this.ringtoneDao = ringtoneDao;
	}

	@Override
	public DataResult<List<Ringtone>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Ringtone>>
		(this.ringtoneDao.findAll(), "Data listelendi." );
				
	}

	@Override
	public Result add(Ringtone ringtone) {
		this.ringtoneDao.save(ringtone);
		return new SuccessResult("Zil sesi eklendi.");
	}

	@Override
	public DataResult<Ringtone> getByRingtoneName(String ringtoneName) {
		
		return new SuccessDataResult<Ringtone>
		(this.ringtoneDao.getByRingtoneName(ringtoneName), "Data getirildi.");
	}

	@Override
	public DataResult<Ringtone> getById(int ringtoneId) {
		return new SuccessDataResult<Ringtone>
		(this.ringtoneDao.getById(ringtoneId), "Data getirildi.");
	}

	@Override
	public DataResult<Ringtone> getByRingtoneCategory(Categories ringtoneCategory) {
		
		return new SuccessDataResult<Ringtone>
		(this.ringtoneDao.getByRingtoneCategory(ringtoneCategory), "Data getirildi.");
	}

	/*@Override
	public List<Ringtone> getAll() {
		return this.ringtoneDao.findAll();
	}*/



}

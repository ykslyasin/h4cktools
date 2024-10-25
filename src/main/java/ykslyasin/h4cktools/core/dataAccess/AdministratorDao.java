package ykslyasin.h4cktools.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import ykslyasin.h4cktools.core.entities.Administrator;

public interface AdministratorDao extends JpaRepository<Administrator, Integer>{

}

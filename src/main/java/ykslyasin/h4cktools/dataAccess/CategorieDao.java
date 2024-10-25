package ykslyasin.h4cktools.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import ykslyasin.h4cktools.entities.concretes.Categories;

public interface CategorieDao extends JpaRepository<Categories, Integer>{


	
}
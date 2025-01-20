package ykslyasin.h4cktools.entities.concretes;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ykslyasin.h4cktools.core.entities.User;


@Data
@Entity
@Table(name="favorite_tools")
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteTools {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int favoriteToolsId;
	
	@NotNull
	@NotBlank
	@Column(name="name")
	private String favoriteToolsName;
	
   // @ManyToMany(mappedBy = "favoriteTools")
    //private Set<User> users;
    
    
}

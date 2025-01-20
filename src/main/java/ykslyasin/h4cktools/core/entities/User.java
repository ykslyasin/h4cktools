package ykslyasin.h4cktools.core.entities;

import java.util.Set;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ykslyasin.h4cktools.entities.concretes.FavoriteTools;

@Entity
@Data
@Table(name="users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	@Email
	@NotBlank
	@NotNull
	private String email;
	
	@Column(name="password")
	@NotBlank
	@NotNull
	private String password;
	
	@NotNull
	@NotBlank
	@Column(name="username")
	private String userName;
	
   /* @ManyToMany
    @JoinTable(
            name = "user_favorite_tools",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tool_id")
    )
    private Set<FavoriteTools> favoriteTools;*/
	
}


package ykslyasin.h4cktools.entities.concretes;

import jakarta.persistence.Column;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="tools")
@AllArgsConstructor
@NoArgsConstructor
public class Tools {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int toolId;
	
	@NotNull
	@NotBlank
	@Column(name="name")
	private String toolName;
	
	@ManyToOne
    @JoinColumn(name="category_id")
    private Categories toolCategory;
	
	@NotNull
	@NotBlank
	@Column(name="tool_path")
	private String toolPath;
	
}

package net.javaci.thymleafExamples._01_modelAttribute_crud;


// import javax.validation.constraints.NotEmpty;
// import javax.validation.constraints.Size;

import lombok.*;

@Data
public class Customer {
	
	// @NotEmpty
	private String name;
	
	private String lastName;

}

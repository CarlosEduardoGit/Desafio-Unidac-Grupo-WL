package com.app.breakfast.dtos;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckListDto {
	
	public interface CheckListView {
		
		public static interface RegistrationPost {}
		public static interface CheckListPut {}
	
	}
	
	private UUID checkListId;
	
	@NotBlank(groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	@Size(min = 3, max = 100, groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	@JsonView({CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	private String collaboratorName;
	
	//@NotBlank(groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	//@Size(min = 5, max = 5, groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	@JsonView({CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	private boolean collaboratorContributed;
	
	@NotBlank(groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	@Size(min = 11, max = 11, groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	@JsonView({CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	private String cpf;
	
	@NotBlank(groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	@Size(min = 2, max = 100, groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	@JsonView({CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	private String contribution;
	
	@NotBlank(groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	//@Size(min = 8, max = 10, groups = {CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	@JsonView({CheckListView.RegistrationPost.class, CheckListView.CheckListPut.class})
	private String dataBreakfast;
	

}

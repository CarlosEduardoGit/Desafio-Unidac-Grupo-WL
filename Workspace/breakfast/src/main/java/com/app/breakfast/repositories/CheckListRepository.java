package com.app.breakfast.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.breakfast.models.CheckListModel;



public interface CheckListRepository extends JpaRepository<CheckListModel, UUID> {

	
	//@Modifying
    //@Query(value = "insert into tb_checklists values (:check_ListId, :collaboratorName, :collaboratorContributed, :cpf, :contribution, :dataBreakfast);",nativeQuery = true)
    //void insercaoCheckList(@Param("checkListId") UUID checkListId, @Param("collaboratorName") String collaboratorName, @Param("collaboratorContributed") boolean collaboratorContributed, @Param("cpf") String cpf, @Param("contribution") String contribution, @Param("dataBreakfast") String dataBreakfast);
	
	//@Modifying
    //@Query(value = "insert into tb_checklists values (:check_ListId, :collaboratorName, :collaboratorContributed, :cpf, :contribution, :dataBreakfast);",nativeQuery = true)
    //void insercaoCheckList(@Param("checkListId, collaboratorName, collaboratorContributed,collaboratorContributed, cpf, contribution, dataBreakfast") CheckListModel checkListModel);
	
	//@Modifying
    //@Query(value = "insert into tb_checklists (check_ListId, collaboratorName, collaboratorContributed, cpf, contribution, dataBreakfast) values (:check_ListId, :collaboratorName, :collaboratorContributed, :cpf, :contribution, :dataBreakfast);",nativeQuery = true)
    //void insercaoCheckList(@Param("checkListId") CheckListModel checkListModel);
	
	@Query(value="select * from tb_checklists", nativeQuery = true)
	List<CheckListModel> consultaCheckList();
	
	@Query(value="select * from tb_checklists where check_list_id = :checkListId", nativeQuery = true)
	Optional<CheckListModel> consultaCheckListById(@Param("checkListId") UUID checkListId);
	
	//@Modifying
    //@Query(value = "update tb_checklists set (:checkListId) where check_list_id= :checkListId;",nativeQuery = true)
    //void atualizacaoCheckList(@Param("checkListId") CheckListModel checkListModel);
	
	//@Modifying
    //@Query(value = "delete from tb_checklists where check_list_id= :checkListId", nativeQuery = true)
    //void exclusaoCheckList(@Param("checkListId") CheckListModel checkListModel);

	
	boolean existsByCollaboratorName(String collaboratorName);
	
	boolean existsByCpf(String cpf);
	
	boolean existsByContribution(String contribution);
	
	
}

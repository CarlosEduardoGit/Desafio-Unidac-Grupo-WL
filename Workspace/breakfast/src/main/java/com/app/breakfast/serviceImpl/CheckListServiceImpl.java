package com.app.breakfast.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.breakfast.models.CheckListModel;
import com.app.breakfast.repositories.CheckListRepository;
import com.app.breakfast.services.CheckListService;

import jakarta.transaction.Transactional;

@Service
public class CheckListServiceImpl implements CheckListService{

	@Autowired
	CheckListRepository checkListRepository;

	
	//@Transactional
	//@Override
	//public void insercao(CheckListModel checkListModel) {
	//	checkListRepository.insercaoCheckList(checkListModel);	
	//}
	
	@Override
	public void save(CheckListModel checkListModel) {
		checkListRepository.save(checkListModel);	
	}
	
	@Override
	public List<CheckListModel> consulta() {
		return checkListRepository.consultaCheckList();
	}
	
	//@Override
	//public Page<CheckListModel> findAll(Pageable pageable) {
	//	return checkListRepository.findAll(pageable);
	//}
	
	@Override
	public Optional<CheckListModel> consultaPorId(UUID checkListId) {
		return checkListRepository.consultaCheckListById(checkListId);
	}

	//@Override
	//public Optional<CheckListModel> findById(UUID checkListId) {
	//	return checkListRepository.findById(checkListId);
	//}
	
	//@Transactional
	//@Override
	//public void atualizacao(CheckListModel checkListModel) {
	//	checkListRepository.atualizacaoCheckList(checkListModel);	
	//}

	//@Override
	//public void exclusao(CheckListModel checkListModel) {
	//	checkListRepository.exclusaoCheckList(checkListModel);	
	//}
	
	@Override
	public void delete(CheckListModel checkListModel) {
		checkListRepository.delete(checkListModel);	
	}

	

	@Override
	public boolean existsByCollaboratorName(String collaboratorName) {
		return checkListRepository.existsByCollaboratorName(collaboratorName);
	}

	@Override
	public boolean existsByCpf(String cpf) {
		return checkListRepository.existsByCpf(cpf);
	}

	@Override
	public boolean existsByContribution(String contribution) {
		return checkListRepository.existsByContribution(contribution);
	}
}

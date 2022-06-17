package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.BankLoanAppDto;



@Repository
public class BankLoanAppDao {
	
	@Autowired
	 EntityManager entityManager;
	 EntityTransaction entityTransaction;
	
	public void saveBankLoanAppDto(BankLoanAppDto bankLoanApp) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bankLoanApp);
		entityTransaction.commit();
	}
	
	public BankLoanAppDto getBankLoanAppDtoById(int id) {
		return entityManager.find(BankLoanAppDto.class, id);
	}
	
	public void updateBankLoanAppDto(BankLoanAppDto bankLoanApp) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(bankLoanApp);
		entityTransaction.commit();
	}
	
	public boolean deleteBankLoanAppDto(int id) {
		BankLoanAppDto bankLoanApp = entityManager.find(BankLoanAppDto.class, id);
		if(bankLoanApp != null) {
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(bankLoanApp);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}
	
	public List<BankLoanAppDto> getAllBankLoanAppDto() {
		Query query = entityManager.createQuery("SELECT b FROM BankLoanAppDto b");
		return query.getResultList();
	}
}



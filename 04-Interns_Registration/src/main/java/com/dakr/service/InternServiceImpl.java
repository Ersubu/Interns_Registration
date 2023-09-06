package com.dakr.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.model.Interns;
import com.dakr.repository.InternsRepository;
@Service

public class InternServiceImpl implements InternsService{
	@Autowired
	
	public InternsRepository repo;

	@Override
	public Interns internsDetails(Interns ie1) {
		
		return repo.save(ie1);
	}

	@Override
	public Interns getIntern(Integer inId) {
		
		return repo.findById(inId).get();
	}

	@Override
	public List<Interns> getAllInterns() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Interns updateInterndetails(Interns ie2) {
		// TODO Auto-generated method stub
		return repo.save(ie2);
	}
	@Override
	public Interns updateInterns(Interns ien2) {
		Interns ien4=null;
		Optional<Interns> op =repo.findById(ien2.getInternID());
		if (op.isPresent())
		{	
			ien4=repo.save(ien2);
		}
		else {
			ien4=repo.save(ien2);
		}
		return ien4;
				
	}

	@Override
	public void deleteOneEmp(Integer ie3) {
		// TODO Auto-generated method stub
		repo.deleteById(ie3);
		
	}

	@Override
	public void deleteAllInterns() {

      repo.deleteAll();
		
	}

//	public String registerInterns( Interns reg) {
//		List<Interns> inte = repo.findAll();
//		 for (Interns intern : inte) {
//	            if (inte.equals(reg)) {
//	                return " Status.USER_ALREADY_EXISTS";
//	            }
//	        }
//	        repo.save(reg);
//	        return "Status.SUCCESS";
//	   
//	}

//	public String loginInterns(@Valid Interns loguser) {
//		 List<Interns> intern = repo.findAll();
//	        for (Interns other : intern) {
//	            if (other.equals(loguser)) {
//	                loguser.setLogin(true);
//	                repo.save(loguser);
//	                return "Status.SUCCESS";
//	            }
//	        }
//	        return "Status.FAILURE";
//	    }
//	

	
}

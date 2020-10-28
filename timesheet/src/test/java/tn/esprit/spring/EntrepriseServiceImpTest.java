package tn.esprit.spring;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImpTest {
	@Autowired
	IEntrepriseService ientrepriseservice;
	
	@Autowired
    EntrepriseRepository entrepriseRepoistory;
	
	
	/*@Test
	public void testdeleteEntrepriseById() {
		
			Entreprise a = new Entreprise(1,"monentreprise","fiscal");
			ientrepriseservice.ajouterEntreprise(a);
			
			assert (entrepriseRepoistory.findById(a.getId())) != null;
}*/
}



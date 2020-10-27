package tn.esprit.spring;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.text.ParseException;
import java.util.List;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.DepartementServiceImpl;
import tn.esprit.spring.services.EntrepriseServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {

	@Autowired
	EntrepriseServiceImpl EntrepriseServiceImpl;
	
	@Autowired
	DepartementServiceImpl departementServiceImpl;
	
	@Autowired
	EntrepriseRepository entrepriseRepoistory;
	
	@Autowired
	DepartementRepository deptRepoistory;
	
	@Test
	public void testAddEntreprise() throws ParseException {
		 
		  //Entreprise  e = new Entreprise("Airbus","aero") ;
		  Entreprise  e = new Entreprise("Wevioo","info") ;
          Entreprise entrepriseAdded = EntrepriseServiceImpl.ajouterEntreprise(e);
		  assertEquals(e.getName(), entrepriseAdded.getName());
		  System.out.println(e.getName());
		  System.out.println(e.getRaisonSocial());
	}
	
	
	

	
}
package tn.esprit.spring;

import static org.junit.Assert.assertNull;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.repository.MissionRepository;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class TimesheetApplicationTests {

	@Autowired 
	IEmployeService iemployeservice; 
	
	@Autowired
	EmployeRepository employerepository;
	
	
	@Autowired
	MissionRepository missionrepository;
	
	@Autowired
	ContratRepository contratrepository;
	
	@Autowired
	EntrepriseRepository entrepriserepository;


	@Test
	public void contextLoads() {
	}
	
	
	@Test
	public void testdeleteContratById() {
	
				Contrat c = new Contrat(1, "type 1", 2);
				iemployeservice.ajouterContrat(c);
				iemployeservice.deleteContratById(c.getReference());
				assertNull(employerepository.findById(c.getReference()));
}

}

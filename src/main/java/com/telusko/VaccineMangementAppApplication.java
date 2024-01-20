package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.*;

@SpringBootApplication
public class VaccineMangementAppApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(VaccineMangementAppApplication.class, args);
		VaccineMangementImpl service = context.getBean(VaccineMangementImpl.class);
		
//		VaccineDetails vaccine=new VaccineDetails("Covaxin", "BharatBio", 45454);
//		String message=service.registerVaccineDetails(vaccine);
//		System.out.println(message);
		
//		List<VaccineDetails> vaccineList=new ArrayList<>();
//		vaccineList.add(new VaccineDetails("CovidShield", "Astrazenica", 45454));
//		vaccineList.add(new VaccineDetails("Phizer", "Moderna", 4544));
//		vaccineList.add(new VaccineDetails("Sputnik", "RussianBased", 4454));
		
//		service.registerMultipleVaccineDetails(vaccineList);
//		System.out.println("Check your db");
		
//		Long count=service.getVaccinesCount();
//		System.out.println("Number of vaccines in DB table : "+ count);
		
//		System.out.println("******************************");
//		Long id=2l;
//		Boolean status=service.checkAvailability(id);
//		if(status)
//			System.out.println("Vaccine available with id : "+ id);
//		else
//			System.out.println("Vaccine not available with id "+ id);
		
//		Iterable<VaccineDetails> vaccineInfo=service.getAllVaccineInfo();
//		List<VaccineDetails> vaccineInfo=(List<VaccineDetails>) service.getAllVaccineInfo();
//		service.getAllVaccineInfo().forEach((vaccines)->System.out.println(vaccines));
		
//		List<Long> vaccineIds=new ArrayList<>();
//		vaccineIds.add(1L);
//		vaccineIds.add(2L);
//		service.getAllVaccineInfoByIds(vaccineIds).forEach((v)->System.out.println(v));
//		Long id=10L;
//		Optional<VaccineDetails> optional=service.getVaccineById(id);
//		if(optional.isPresent())
//			System.out.println(optional.get()); 
//		optional.orElse(new VaccineDetails());
//		System.out.println(service.removeVaccineById(1l));
//		List<Long>idList=new ArrayList<>();
//		idList.add(3l);
//		idList.add(2L);
//		System.out.println(service.removeVaccinesById(idList));
		VaccineDetails v = new VaccineDetails();
		v.setId(4L);
		v.setVaccineName("Sputnik");
		v.setVaccineCompany("RussianBased");
		v.setPrice(4454);
		System.out.println(service.removeVaccineByObject(v));
		
		context.close();
		
	}

}

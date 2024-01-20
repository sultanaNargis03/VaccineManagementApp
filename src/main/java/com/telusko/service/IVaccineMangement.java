package com.telusko.service;

import java.util.List;
import java.util.Optional;

import com.telusko.bo.VaccineDetails;

public interface IVaccineMangement 
{
	  public String registerVaccineDetails(VaccineDetails vaccine);
	     public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccineList);
	     public Long getVaccinesCount();
	     public Boolean checkAvailability(Long id);
	     public Iterable<VaccineDetails> getAllVaccineInfo();
	     public Iterable<VaccineDetails> getAllVaccineInfoByIds(Iterable<Long> idList);
	     public Optional<VaccineDetails> getVaccineById(Long id);
	     public String removeVaccineById(Long id);
	     public String removeVaccinesById(List<Long> ids);
	     public String removeVaccineByObject(VaccineDetails vaccine);
	     
	     
}

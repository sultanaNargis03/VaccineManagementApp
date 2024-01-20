package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends CrudRepository<VaccineDetails, Long> 
{

}

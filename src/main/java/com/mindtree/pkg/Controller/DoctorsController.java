package com.mindtree.pkg.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.pkg.Entity.Doctors;
@RestController
public class DoctorsController {
	@Autowired
	private com.mindtree.pkg.Repository.DoctorsRepository doctorsRepository;
	@GetMapping("/all")
	public List<Doctors>getAllDoctors(){
		return doctorsRepository.findAll();
	}
	@PostMapping("/save")
	public Doctors saveDoctors(@RequestBody Doctors doctor) {
		return doctorsRepository.save(doctor);
	}

}
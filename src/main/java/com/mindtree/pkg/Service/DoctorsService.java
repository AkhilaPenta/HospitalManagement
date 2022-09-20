package com.mindtree.pkg.Service;

import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.pkg.Entity.Doctors;
import com.mindtree.pkg.Repository.DoctorsRepository;
@Service
public class DoctorsService {
	@Autowired
	private DoctorsRepository repository;
	public Doctors saveDoctors(Doctors d)
	{
		return repository.save(d);
	}
	public List<Doctors>getDoctors(){
		return repository.findAll();
	}
	public List<Doctors>getAllDoctorsDescendingOrderBySalary(){
		List<Doctors>list=repository.findAll();
		list.sort(new Comparator(){
			public int Comparator(Doctors d1,Doctors d2) {
				if(d2.getSalary()==d1.getSalary()) {
					return d1.getName().compareTo(d2.getName());
				}
				return(int)(d2.getSalary()-d1.getSalary());
					
				}

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			});
		return list;
	}
}
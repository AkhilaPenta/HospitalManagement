package com.mindtree.pkg.Entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctors {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double salary;
	private String specialist;
	public int getId() {
		return id;
	}
		public void setId(int id) {
			this.id=id;
		}
		public String getName() {
			return name;
		}
			public void setName(String name) {
				this.name=name;
			}
			public double getSalary() {
				return salary;
			}
				public void setSalary(double salary) {
					this.salary=salary;
				}
				public String getSpecialist() {
					return specialist;
				}
					public void setSpecialist(String specialist) {
						this.specialist=specialist;
					}
					public Doctors() {
						super();
					}
					@Override
					public String toString() {
						return "Doctors[id="+id+",name="+name+",salary="+salary+",specialist="+specialist+"]";
	}
}					

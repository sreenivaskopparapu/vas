package info.inetsolv;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TBL" ,schema="bms")
public class Employee {
private Integer eno;
private String name;
private Double salary;
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
}

}

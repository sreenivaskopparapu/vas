package info.inetsolv;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EMP_TBL database table.
 * 
 */
@Entity
@Table(name="EMP_TBL",schema="BMS")
@NamedQueries({ @NamedQuery(name="findAllRecords", query="SELECT e FROM Employee e"),
	
    @NamedQuery(name="findBySalary",query="SELECT e FROM Employee e where e.salary>:salary")})
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long eno;

	private String ename;

	private BigDecimal salary;

	public Employee() {
	}

	public long getEno() {
		return this.eno;
	}

	public void setEno(long eno) {
		this.eno = eno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
package info.inetsolv;

import org.springframework.context.annotation.Configuration;
@Configuration

public class Person {
	
private Integer pid;
private String name;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;

}
}

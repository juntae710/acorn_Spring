package acorn.com.mysqlbatis;

import lombok.Data;

@Data
public class UsersDTO {
	int id;
	String name;
	String email;
	String registration_date;
}

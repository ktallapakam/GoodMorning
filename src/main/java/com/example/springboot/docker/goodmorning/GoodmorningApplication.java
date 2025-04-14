package com.example.springboot.docker.goodmorning;

import com.example.springboot.docker.goodmorning.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class GoodmorningApplication
{
	public static HashMap<String, Student> studentMap = new HashMap<String, Student>();


	/*@GetMapping("/hello/{message}")
	public String message(@PathVariable("message") String name) {
		System.out.println("Good morning....message()");
		return "<h3>Hello Mr/Mrs."+name+".....Good morning!</h3>" ;
	}*/

	@GetMapping("/addUser/")
	public String addUser(@RequestParam Map<String, String> params) {
		Student student = new Student();
		if(params.containsKey("name")){ student.setName(params.get("name")); }
		if(params.containsKey("age")){ student.setAge(Integer.parseInt(params.get("age"))); }
		if(params.containsKey("gender")){ student.setGender(params.get("gender")); }
		studentMap.put(params.get("name"), student);

		return getUsers();
	}


	@GetMapping("/getAllUsers")
	public String getUsers() {
		StringBuilder sb = new StringBuilder("<table><tr><th>Name</th><th>Age</th><th>Gender</th></tr>");
		studentMap.entrySet().forEach(entry -> {
			System.out.printf(String.valueOf(entry.getValue()));
			sb.append("<tr><td>").append(entry.getValue().getName())
					.append("</td><td>").append(entry.getValue().getAge())
					.append("</td><td>").append(entry.getValue().getGender()).append("</td></tr>");
		});
		sb.append("</table>");
		return sb.toString();
	}

	public GoodmorningApplication() {
		System.out.println("Constructing GoodmorningApplication Called");
		Student stu = new Student();
		stu.setName("Kishore");
		stu.setAge(40);
		stu.setGender("Male");
		studentMap.put(stu.getName(), stu);
		System.out.println("Student Added: "+studentMap.toString());
	}

	public static void main(String[] args) {
		SpringApplication.run(GoodmorningApplication.class, args);
	}

}

package kz.iitu.fullstack.midterm_spring_vue;

import kz.iitu.fullstack.midterm_spring_vue.entity.Employee;
import kz.iitu.fullstack.midterm_spring_vue.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MidtermSpringVueApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MidtermSpringVueApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = Employee.builder()
				.firstName("Alibek")
				.lastName("Mazhikenov")
				.email("test@gmail.com")
				.build();
		Employee employee2 = Employee.builder()
				.firstName("Bekzat")
				.lastName("Beisetay")
				.email("test2@gmail.com")
				.build();
		Employee employee3 = Employee.builder()
				.firstName("Dinmukhamed")
				.lastName("Abdigali")
				.email("test3@gmail.com")
				.build();
		employeeRepository.save(employee);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);

	}
}

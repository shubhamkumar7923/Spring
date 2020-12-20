package cm.abc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Demo {

	public static void main(String[] args) {
		BeanFactory b = new DefaultListableBeanFactory();
		BeanDefinitionRegistry bdr = (BeanDefinitionRegistry) b;
		XmlBeanDefinitionReader xbr = new XmlBeanDefinitionReader(bdr);
		xbr.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
		
		Employee e = (Employee) b.getBean("emp");
		System.out.println("Employee Id: "+e.getEmpid());
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Employee Salary: "+e.getSalary());
	}

}

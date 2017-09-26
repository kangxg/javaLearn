 
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;


import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Employee e1=new Employee();
	        e1.setId(103);
	        e1.setFirstName("Max03");
	        e1.setLastName("Su");
	   
	        Configuration conf=new Configuration();  
            conf.configure("hibernate.cfg.xml");  
            //创建工厂  
           
            SessionFactory sf=conf.buildSessionFactory();
            //SessionFactory sf=conf.buildSessionFactory();  
            //取得session  
            Session session=sf.openSession();  
            //开始事务  
            session.beginTransaction();  
            session.save(e1);  
            System.out.println("保存成功");  
            session.getTransaction().commit();  
            session.close();  
            sf.close();  

        System.out.println("successfully saved"); 
	}

}

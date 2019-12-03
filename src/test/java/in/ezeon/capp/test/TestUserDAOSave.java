package in.ezeon.capp.test;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestUserDAOSave {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);
        //TODO: the user details will be taken from User-Reg-Form
        User u=new User();
        u.setName("ak");
        u.setPhone("9303580884");
        u.setEmail("ak@gmail.com");
        u.setAddress("dhaka");
        u.setLoginName("ak");
        u.setPassword("ak123");
        u.setRole(1);//Admin Role 
        u.setLoginStatus(1); //Active
        userDAO.save(u);
        System.out.println("--------Data Saved------");
    }    
}

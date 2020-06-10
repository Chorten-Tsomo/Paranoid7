/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.usermanagementsystem.DOA.MyDb;
import com.usermanagementsystem.bean.RegisterUser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aashi
 */
public class insertTest {

    public insertTest() {
    }
    @Test
    public void test(){
    RegisterUser user=new RegisterUser(1,"Aashish","Khanal","Swoyambhu"," 9851082493 ","aashishkhanal@gmail.com","12345","12345");
     MyDb test = new MyDb();
     String output=test.insert(user);
     assertEquals("Data entered successfully",output);
    }

}

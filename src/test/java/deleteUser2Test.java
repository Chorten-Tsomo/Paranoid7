import com.usermanagementsystem.DOA.MyDb;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class deleteUser2Test {

    public deleteUser2Test() {
    }

    @Test
    public void test(){
    MyDb test = new MyDb();
        try {
            boolean output = test.deleteUser(2);
            assertEquals(false, output);
        } catch (SQLException ex) {
            Logger.getLogger(deleteUserTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(deleteUserTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
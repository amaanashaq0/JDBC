
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {
    public static void main(String... args){
        DatabaseConnectionManager dcm= new DatabaseConnectionManager("localhost"
                ,"cars","postgres","");
        try {
            Connection connection= dcm.getConnection();
            CustomerDAO customerDAO=new CustomerDAO(connection);


//                //Insert
//                Customer customer2=new Customer();
//                customer2.setFirstName("Prince");
//                customer2.setLastName("Raj");
//                customer2.setEmail("prince@123gmail.com");
//                customer2.setPhone("9602723097");
//                customer2.setAddress("Delhi");
//                customer2.setCity("Noida");
//                customer2.setState("Delhi");
//                customer2.setZipcode("201303");
//                customerDAO.create(customer2);
//update Data from Database
//                Customer customer=customerDAO.findById(10000);
//                System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getEmail());
//                customer.setEmail("update it yet");
//                customer.setFirstName("Kartik");
//                customer.setLastName("Goel");
//                customer=customerDAO.update(customer);
//                System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getEmail());
        }catch (SQLException e){

            e.printStackTrace();

        }
    }
}
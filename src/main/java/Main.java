import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;
// Added for MySQL JDBC Connecivity
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.metamodel.EntityType;
import java.util.Map;
// ORM Mappings
import com.datasynthesis.ormmapping.PlatformDatagenconfigEntity;
import com.datasynthesis.hibernatemappings.*;

public class Main {
    //private static final SessionFactory ourSessionFactory;
    /*
     *      This executes when main is started
     */
    static {
      /*  try
        {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            throw new ExceptionInInitializerError(ex);
        }*/
    }

    /*
     *      Invoked in Main

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
    */

    /*
     *      Main Method
     */
    public static void main(final String[] args) throws Exception {
        //Session session = getSession();
        try
        {
            /*
            *   This is a complete code example for Hibernate
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities())
            {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list())
                {
                    System.out.println("  " + o);
                }
            }
            System.out.println("Loading Hibernate Configuration ...");
            Configuration configuration = new Configuration();
            configuration.configure("./resources/hibernate.cfg.xml");
            System.out.println("Getting Session ...");
            Session s1 = session.getSession().getSessionFactory().openSession();
            System.out.println("Querying Data ...");
            Query query = s1.createQuery("from PlatformDatagenconfigEntity where statusId= :code");
            query.setParameter("code",1);
            System.out.println("Process Results ...");
            List list = query.list();
            */
            Connection _conn = null;
            System.out.println("Loading Database Connectivity Configuration ...");
            _conn = DriverManager.getConnection("jdbc:mysql://localhost/datasynthesis" +
                            "user=datasynthesis&password=datasynthesis");
            System.out.println("Connected to MySQL Database ...");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            //session.close();
        }
    }
}
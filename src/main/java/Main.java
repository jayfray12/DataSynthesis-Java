import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;

import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;
import java.util.List;
// Added for additional support
import javax.persistence.metamodel.EntityType;
import java.util.Map;
// Added for MySQL JDBC Connecivity
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
// ORM Mappings
import com.datasynthesis.ormmapping.PlatformDatagenconfigEntity;
import com.datasynthesis.hibernatemappings.*;


public class Main {
    private static SessionFactory ourSessionFactory = null;
    /*
    *      This executes when main is started
    */
    static {
       try
        {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            throw new ExceptionInInitializerError(ex);
        }
    }

    /*
     *      Invoked in Main
    */
    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
    

    /*
     *      Main Method
     */
    public static void main(final String[] args) throws Exception, SQLException {
        Session session = getSession();

     /*   final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            System.out.println("Instatitiating SessionFactory ...");
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            System.out.println("Opening Session Factory ...");
            Session session = sessionFactory.openSession();
        } catch (Exception ex) {
            System.out.println("Error Detail:  ");
            ex.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }*/
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
            */
            System.out.println("Loading Hibernate Configuration ...");
            Configuration configuration = new Configuration();
            configuration.configure("./resources/hibernate.cfg.xml");
            System.out.println("Getting Session ...");
            Session s1 = session.getSession().getSessionFactory().openSession();
            System.out.println("Querying Data ...");
            //Query query = s1.createQuery("from PlatformDatagenconfigEntity where statusId= :code");
            //query.setParameter("code",1);
            //System.out.println("Process Results ...");
            //List list = query.list();

            /*
            Connection _conn = null;
            System.out.println("Loading Database Connectivity Configuration ...");
            _conn = DriverManager.getConnection("jdbc:mysql://localhost/datasynthesis" +
                            "user=datasynthesis&password=datasynthesis");
            System.out.println("Connected to MySQL Database ...");
            */
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            //session.close();
        }
    }
}
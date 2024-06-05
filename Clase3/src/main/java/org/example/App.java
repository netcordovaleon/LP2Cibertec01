package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.Programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Programming.class);

        try (SessionFactory sessionFactory = configuration.buildSessionFactory()){

            Session session = sessionFactory.openSession();

            Programming programming = new Programming();
            programming.setId(1);
            programming.setName("JAVA");
            programming.setDescription("Open Sources");
            programming.setStatus('A');

            //INICIO OPERACION(ES)
            session.beginTransaction();

            // INI COMANDO PARA GRABAR
            //session.persist(programming);
            // FIN COMANDO PARA GRABAR


            // INI COMANDO PARA LEER

            List<Programming> listado = new ArrayList<>();

            listado = session.createQuery("from Programming", Programming.class).list();

            // FIN COMANDO PARA LEER

            //CIERRE OPERACION(ES)
            session.getTransaction().commit();



        }

        //System.out.println( "Hello World!" );
    }
}

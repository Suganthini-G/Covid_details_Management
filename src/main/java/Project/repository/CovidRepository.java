package Project.repository;

import java.sql.*;
import java.util.List;

import Project.model.coviddetails;
import Project.model.phidetails;
import Project.util.DbUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CovidRepository
{
	//Simple JDBC
	private Connection dbConnection;

	//Hibernate Libraries
	private Configuration cfg;
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;


	public CovidRepository()
	{
		//JDBC
		dbConnection = DbUtil.getConnection();

		//Hibernate
		cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
	}

	public void save(String name, String nic, String phoneno , String phidivision, String password)
	{
		if (dbConnection != null)
		{
			try
			{
				PreparedStatement prepStatement = dbConnection
						.prepareStatement("INSERT INTO phi( id , Name , nic , phi_division , Phone_Number , Password )  VALUES (DEFAULT , ? , ? , ? , ? , ? )");
				prepStatement.setString(1, name);
				prepStatement.setString(2, nic);
				prepStatement.setString(3, phidivision);
				prepStatement.setString(4, phoneno);
				prepStatement.setString(5, password);

				prepStatement.executeUpdate();

			}
            catch (SQLException e)
            {
				e.printStackTrace();
			}
		}
	}

	public void save2(String nic, String password)
	{
		if (dbConnection != null)
		{
			try
			{

	PreparedStatement prepStatement2 = dbConnection
			.prepareStatement("INSERT INTO users( id , username , Password , userrole)  VALUES (DEFAULT , ? , ? , 'phi')");
				prepStatement2.setString(1, nic);
				prepStatement2.setString(2, password);

				prepStatement2.executeUpdate();

			}
            catch (SQLException e)
					{
					e.printStackTrace();
					}
		}
	}

	public void save3(String totalcases, String totaldeaths, String totalrecovered, Date date)
	{
		if (dbConnection != null)
		{
			try
			{

				PreparedStatement prepStatement3 = dbConnection
						.prepareStatement("INSERT INTO coviddetails( id , Totalcases, TotalDeaths, TotalRecovered, Date)  VALUES (DEFAULT , ? , ? , ?, ?)");
				prepStatement3.setString(1, totalcases);
				prepStatement3.setString(2, totaldeaths);
				prepStatement3.setString(3, totalrecovered);
				prepStatement3.setDate(4, date);

				prepStatement3.executeUpdate();

			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

	public void update(String name, String nic, String phoneno , String phidivision, String password)
	{
		if (dbConnection != null)
		{
			try
			{
				PreparedStatement prepStatement = dbConnection
						.prepareStatement("UPDATE phi SET Name=? , nic=? , phi_division=? , Phone_Number=? , Password=?  WHERE id=?");
				prepStatement.setString(1, name);
				prepStatement.setString(2, nic);
				prepStatement.setString(3, phidivision);
				prepStatement.setString(4, phoneno);
				prepStatement.setString(5, password);

				prepStatement.executeUpdate();

			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

	public void update2(String nic, String password)
	{
		if (dbConnection != null)
		{
			try
			{

				PreparedStatement prepStatement2 = dbConnection
						.prepareStatement("UPDATE users SET username=?, Password=? WHERE id=?");
				prepStatement2.setString(1, nic);
				prepStatement2.setString(2, password);

				prepStatement2.executeUpdate();

			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

	public void update3(String totalcases, String totaldeaths, String totalrecovered, Date date)
	{
		if (dbConnection != null)
		{
			try
			{

				PreparedStatement prepStatement3 = dbConnection
						.prepareStatement("UPDATE coviddetails SET Totalcases=?, TotalDeaths=?, TotalRecovered=?, Date=? WHERE id=?");
				prepStatement3.setString(1, totalcases);
				prepStatement3.setString(2, totaldeaths);
				prepStatement3.setString(3, totalrecovered);
				prepStatement3.setDate(4, date);

				prepStatement3.executeUpdate();

			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}




	public boolean findByLogin(String userName, String password) {
		if (dbConnection != null) {
			try {
				PreparedStatement prepStatement = dbConnection
						.prepareStatement("select Password from users where UserName = ? and userrole='admin'");
				prepStatement.setString(1, userName);

				ResultSet result = prepStatement.executeQuery();
				if (result != null) {
					while (result.next()) {
						if (result.getString(1).equals(password)) {
							return true;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean findByLogin2(String userName, String password) {
		if (dbConnection != null) {
			try {
				PreparedStatement prepStatement = dbConnection
						.prepareStatement("select Password from users where UserName = ? and userrole='phi'");
				prepStatement.setString(1, userName);

				ResultSet result = prepStatement.executeQuery();
				if (result != null) {
					while (result.next()) {
						if (result.getString(1).equals(password)) {
							return true;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean phidelete(int Id) {
		if (dbConnection != null)
		{
			try
			{
				PreparedStatement prepStatement = dbConnection
						.prepareStatement("DELETE FROM phi WHERE id= ?");
				prepStatement.setInt(1, Id);

				int rowsdeleted = prepStatement.executeUpdate();

				if(rowsdeleted > 0){
					return true;
				}

			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean detailsdelete() {
		if (dbConnection != null) {
			try {
				PreparedStatement prepStatement = dbConnection
						.prepareStatement("delete from coviddetails Where id = ?");
//				prepStatement.setInt(1, Id);

				int rowsdeleted = prepStatement.executeUpdate();

				if(rowsdeleted > 0){
					return true;
				}

			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return false;
	}



    public boolean deletedetail(int id) {
        String hql = "delete from coviddetails where id = :id";
        Transaction t = null;

        try {
            t = session.beginTransaction();
            Query query = session.createSQLQuery(hql);
            query.setInteger("id", id);
            query.executeUpdate();
            t.commit();
            return true;
        } catch (Exception e) {
            if (!(t == null)) {
                t.rollback();
            }
        }
		finally {
            session.close();
        }
        return false;
    }

	public boolean deletephi(int id) {
		String hql = "delete from phi where id = :id";
		Transaction t = null;

		try {
			t = session.beginTransaction();
			Query query = session.createSQLQuery(hql);
			query.setInteger("id", id);
			query.executeUpdate();
			t.commit();
			return true;
		} catch (Exception e) {
			if (!(t == null)) {
				t.rollback();
			}
		}
		finally {
			session.close();
		}
		return false;
	}

	public List<phidetails> showAllAvailablePhi( )
	{
		Query query1 = session.createQuery("from phidetails ");

		List <phidetails> phiDetails = query1.list();

		for(phidetails phi : phiDetails) {
			System.out.println(phi.getName());
		}

		return phiDetails;
	}

	public List<coviddetails> showAllAvailableDetails( )
	{
		Query query1 = session.createQuery("from coviddetails ");

		List <coviddetails> Details = query1.list();

		for(coviddetails details : Details) {
			System.out.println(details.getDate());
		}

		return Details;
	}


}

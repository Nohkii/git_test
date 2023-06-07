package ch08;

public class DaoEx {

public static void main(String[] args) {
	
	DataAccessObject dao = new OracleDao();
			dbWork(dao);
	dbWork(new MySqlDao());
	
}

	public static void dbWork(DataAccessObject dao) {

	}
}

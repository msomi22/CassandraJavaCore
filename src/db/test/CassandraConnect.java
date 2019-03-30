package db.test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class CassandraConnect {

	public CassandraConnect() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String serverIP = "127.0.0.1";
		String keyspace = "\"University\"";

		Cluster cluster = Cluster.builder()
				.addContactPoints(serverIP)
				.build();

		Session session = cluster.connect(keyspace);

		String cqlStatement = "SELECT * FROM \"Student\"";
		for (Row row : session.execute(cqlStatement)) {
			System.out.println(row.toString());
		}

	}

}

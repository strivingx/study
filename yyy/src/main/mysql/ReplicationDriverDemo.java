/*
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Properties;

import com.mysql.jdbc.ReplicationDriver;

public class ReplicationDriverDemo {

    public static void main(String[] args) throws Exception {
        ReplicationDriver driver = new ReplicationDriver();
        Properties props = new Properties();
        props.put("autoReconnect", "true"); // We want this for failover on the slaves
        props.put("roundRobinLoadBalance", "true");  // We want to load balance between the slaves
        props.put("user", "foo");
        props.put("password", "password");

        //
        // Looks like a normal MySQL JDBC url, with a
        // comma-separated list of hosts, the first
        // being the 'master', the rest being any number
        // of slaves that the driver will load balance against
        //

        Connection conn = driver.connect("jdbc:mysql:replication://master,slave1,slave2,slave3/test",
                props);

        // Perform read/write work on the master by setting the read-only flag to "false"
        conn.setReadOnly(false);
        conn.setAutoCommit(false);
        conn.createStatement().executeUpdate("UPDATE some_table ....");
        conn.commit();

        // Now, do a query from a slave, the driver automatically picks one from the list
        conn.setReadOnly(true);

        ResultSet rs = conn.createStatement().executeQuery("SELECT a,b FROM alt_table");
    }
}*/

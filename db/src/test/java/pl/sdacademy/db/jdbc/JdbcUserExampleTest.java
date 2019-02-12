package pl.sdacademy.db.jdbc;
import org.assertj.core.api.Assertions;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.hibernate.hql.internal.antlr.SqlStatementLexer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import javax.swing.text.SimpleAttributeSet;
import java.sql.*;

public class JdbcUserExampleTest<SqlException> {


  @Test
  void test() throws Exception {
    try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:");
         Statement statement = connection.createStatement();) {
      statement.execute("create table user_test_table (id int auto_increment, name varchar(30), surname varchar(50) )");
      statement.execute("insert into user_test_table (name, surname) values ('Czesiek' , 'Kowalski') ");
      ResultSet resultSet = statement.executeQuery("select * from user_test_table");
      resultSet.next();
      String name = resultSet.getString("name");
      String surname = resultSet.getString("surname");
      Assertions.assertThat(name).isEqualTo("Czesiek");
      Assertions.assertThat(surname).isEqualTo("Kowalski");
    }
  }


  @DisplayName("Prepare")
  @Test
  public void test3() throws Exception {
    PreparedStatement insertStatement = null;
    PreparedStatement query = null;
    try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:");) {
      createSchema(connection);
      insertStatement = connection.prepareStatement("INSERT INTO my_table(name) VALUES (?)");
      addToDatabase("Marek", insertStatement);
      addToDatabase("Darek", insertStatement);
      query = connection.prepareStatement("SELECT * from my_table " + "WHERE name " +
              "= ?");
      query.setString(1, "Marek");
      ResultSet resultSet = query.executeQuery();
      resultSet.next();
      String name = resultSet.getString("name");
      Assertions.assertThat(name).isEqualTo("Marek");

      query.setString(1, "Darek");
      resultSet = query.executeQuery();
      resultSet.next();
      name = resultSet.getString("name");
      Assertions.assertThat(name).isEqualTo("Darek");

    }

    finally {
      if (insertStatement != null) {
        insertStatement.close();
      }
      if(query != null){
        query.close();
      }
    }

  }

  void createSchema(Connection connection) throws SQLException {
    Statement statement = connection.createStatement();
    statement.execute(
            "CREATE TABLE my_table(id int auto_increment, name varchar(30))");
  }

  void addToDatabase(String name, PreparedStatement preparedStatement) throws SQLException {

    preparedStatement.setString(1, name);
    preparedStatement.execute();
  }

}

steps to connecting java applications to database

1. import the package
2. load and register the driver
3. establish the connection
4. create the statement
5. execute the query
6. process the result
7. close the statement

the package used here is the

** java.sql.\* **

the second steps
2a. load
2b register

the driver for mysql is
load this driver ----> com.mysql.jdbc.driver
register --> using a method called
class forName("com.mysql.jdbc.driver"); that is how we register a method

establish the connection. you need to instantiate the object...

3 types of statements used in jdbc

1. normal statements 2. prepared statements 3 callable statements

coding format of the above steps...

import java.sql.\*
main() { }
Class forName("com.mysql.jdbc.driver")
Connection com = Driver getConnection("url", "username" , "password");
statement st = com.createStatement();
Result rs = st.executeQuery("select \* from students");
while(rs.next()) {
rs.getInt(1) + " " + rs.getString(2);
}

st.close();
com.close();

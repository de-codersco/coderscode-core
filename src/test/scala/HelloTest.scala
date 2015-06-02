
import cc.tables.daos._
import java.sql.DriverManager
import org.jooq.SQLDialect
import org.jooq.impl.DSL

object HelloTest extends App {
  println("Hello!")
  
  Class.forName("org.h2.Driver")
  val conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/mem:cc", "sa", "")
  val ctx = DSL.using(conn, SQLDialect.H2)
  
  val dao = new AuthorDao(ctx.configuration)
  
  val count = dao.count
  println(s"count = ${count}")
}
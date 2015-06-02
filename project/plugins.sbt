resolvers += "Flyway" at "http://flywaydb.org/repo"

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "3.2.1")

resolvers += "sean8223 Releases" at "https://github.com/sean8223/repository/raw/master/releases"

addSbtPlugin("sean8223" %% "jooq-sbt-plugin" % "1.5")

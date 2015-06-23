name := """coderscode-core"""

organization := """de.codersco"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.5"

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies ++= Seq(

    "org.jooq" % "jooq" % "3.6.1",
    "org.jooq" % "jooq-meta" % "3.6.1",
    "org.jooq" % "jooq-codegen" % "3.6.1",

    "org.flywaydb" % "flyway-core" % "3.2.1",

    "log4j" % "log4j" % "1.2.17",
    "org.slf4j" % "slf4j-log4j12" % "1.7.5",

    "com.h2database" % "h2" % "1.4.187",
    "com.h2database" % "h2" % "1.4.187" % "jooq"
)

fork in run := true


// flyway

seq(flywaySettings: _*)

flywayUrl := "jdbc:h2:tcp://localhost/cc"

flywayUser := "sa"

flywaySchemas := Seq("CC")

// jooq

seq(jooqSettings:_*)

jooqConfigFile := Some(new java.io.File("./src/main/resources/jooq.xml"))

jooqOutputDirectory <<= (sourceManaged in Compile)

// eclipse

EclipseKeys.createSrc := EclipseCreateSrc.All

name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.12.4"

lazy val akkaVersion = "2.5.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

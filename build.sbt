name := "mario"

version := "0.1"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.pircbotx" % "pircbotx" % "2.0.1",
  "org.slf4j" % "slf4j-simple" % "1.7.5",
  "com.typesafe" % "config" % "1.0.2"
)

mainClass in Compile := Some("it.slack.mario.Mario")

name := "WebScrapper"

version := "1.0"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq (
  "com.typesafe.akka" %% "akka-http"   % "10.1.11",
  "com.typesafe.akka" %% "akka-stream" % "2.5.26"
)

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
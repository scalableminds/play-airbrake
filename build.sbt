name := "play-airbrake"

version := "0.5.0"

scalaVersion := "2.11.7"

scalaBinaryVersion := "2.11"

scalacOptions ++= Seq("-Xlint","-deprecation", "-unchecked","-encoding", "utf8")

resolvers ++= Seq(
  Resolver.url("Play", url("http://download.playframework.org/ivy-releases/"))(Resolver.ivyStylePatterns),
  "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Typesafe Releases Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.4.3" % "compile",
  "com.typesafe.play" %% "play-ws" % "2.4.3" % "compile"
)

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

organization := "com.scalableminds"

organizationName := "scalable minds UG (haftungsbeschränkt) & Co. KG"

organizationHomepage := Some(url("http://scalableminds.com"))

startYear := Some(2014)

sonatypeProfileName := "com.scalableminds"

description := "Play framework 2.x module to report play exceptions to airbrake"

licenses := Seq("MIT" -> url("https://github.com/scalableminds/play-airbrake/blob/master/LICENSE"))

homepage := Some(url("https://github.com/sclableminds/play-airbrake"))

scmInfo := Some(ScmInfo(url("https://github.com/sclableminds/play-airbrake"), "https://github.com/scalableminds/play-airbrake.git"))

pomExtra := (
  <developers>
    <developer>
      <id>teamon</id>
      <name>Tymon Tobolski</name>
      <email>i@teamon.eu</email>
      <url>http://github.com/teamon</url>
    </developer>
    <developer>
      <id>tmbo</id>
      <name>Tom Bocklisch</name>
      <email>tom.bocklisch@scalableminds.com</email>
      <url>http://github.com/tmbo</url>
    </developer>
  </developers>
)

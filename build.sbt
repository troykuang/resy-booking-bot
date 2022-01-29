name := "resy-booking-bot"

scalaVersion := "2.13.4"

lazy val root = project in file(".")

libraryDependencies ++= Seq("com.typesafe.play" %% "play-ahc-ws" % "2.8.8")
libraryDependencies ++= Seq( "joda-time" % "joda-time"    % "2.3"
  , "org.joda"  % "joda-convert" % "1.6"
)
name := "play"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += "ERQX Releases" at "https://jroper.github.io/releases"

libraryDependencies += "au.id.jazzy.erqx" %% "erqx-engine" % "1.0.0"

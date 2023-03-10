val scala3Version = "3.2.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "sbt-parallel-tests",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    testOnly / testFilter := customTestFilter
  )

def customTestFilter(patterns: Seq[String]): Seq[String => Boolean] =
  patterns.map { pattern => className: String =>
    className.matches(pattern)
  }

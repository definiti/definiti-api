organization := "io.github.definiti"
name := "api"
version := "0.3.0-SNAPSHOT"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resourceDirectory in Compile := baseDirectory.value / "src"

crossPaths := false

useGpg := true

pomIncludeRepository := { _ => false }

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://definiti.gitbook.io/definiti"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/definiti/definiti-api"),
    "scm:git@github.com:definiti/definiti-api.git"
  )
)

developers := List(
  Developer(
    id = "grizio",
    name = "Gaëtan Rizio",
    email = "gaetan@rizio.fr",
    url = url("https://github.com/grizio")
  )
)

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
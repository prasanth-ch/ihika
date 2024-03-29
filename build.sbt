name := "WorkSpace"

version := "0.1"

scalaVersion := "2.11.5"


libraryDependencies ++= Seq(
  "org.apache.spark"  %%  "spark-core"    % "2.2.0"   % "provided",
  "org.apache.spark"  %%  "spark-sql"     % "2.2.0",
  "org.apache.spark"  %%  "spark-mllib"   % "2.2.0"
)

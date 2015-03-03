name := "tagging-your-suites"

scalaVersion := Common.scalaVersion

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

TaggingYourSuites.Settings.integrationSettings

TaggingYourSuites.Settings.uiSettings

TaggingYourSuites.Settings.unitSettings
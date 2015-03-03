name := "different-source-folders"

scalaVersion := Common.scalaVersion

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "it,test,uitest" // The "it" bit is important so that ScalaTest is available there too

Defaults.itSettings

DifferentSourceFolders.Settings.uiSettings
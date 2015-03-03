name := "scalatest-partitioning-recipes"

version := "1.0"

scalaVersion := Common.scalaVersion

lazy val partitioningRecipes = project.in(file("."))
  .aggregate(differentSourceFolder, taggingYourSuites, explicitTestSuites, testFilters)

lazy val differentSourceFolder = project.in(file("different-source-folders"))
  .configs(IntegrationTest, DifferentSourceFolders.Configs.UITests)

lazy val taggingYourSuites = project.in(file("tagging-your-suites"))
  .configs(TaggingYourSuites.Configs.UITests, TaggingYourSuites.Configs.IntegrationTests, TaggingYourSuites.Configs.UnitTests)

lazy val explicitTestSuites = project.in(file("explicit-test-suites"))
  .configs(ExplicitTestSuites.Configs.ExplicitSuites)

lazy val testFilters = project.in(file("test-filters"))
  .configs(TestFilters.Configs.IntegrationTests)
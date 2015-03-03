import sbt.Keys._
import sbt.{Defaults => D, _}

/**
 * Contains configs and settings for the "different-source-folders" sub-project
 */
object DifferentSourceFolders {
  object Configs {
    lazy val UITests = config("uitest").extend(Test)
  }

  object Settings {
    lazy val uiSettings = inConfig(Configs.UITests)(D.testSettings) ++ Seq(
      scalaSource in Configs.UITests := baseDirectory.value / "src/uitest/scala"
    )
  }
}

/**
 * Contains configs and settings for the "tagging-your-suites" sub-project
 */
object TaggingYourSuites {
  object Configs {
    lazy val UnitTests = config("unit").extend(Test)
    lazy val UITests = config("ui").extend(Test)
    lazy val IntegrationTests = config("integration").extend(Test)
  }

  object Settings {
    lazy val unitSettings = inConfig(Configs.UnitTests)(D.testTasks) ++ Seq(
      testOptions in Configs.UnitTests := Seq(
        Tests.Argument("-n", "example.tags.UnitTag")
      )
    )

    lazy val uiSettings = inConfig(Configs.UITests)(D.testTasks) ++ Seq(
      testOptions in Configs.UITests := Seq(
        Tests.Argument("-n", "example.tags.UITag")
      )
    )

    lazy val integrationSettings = inConfig(Configs.IntegrationTests)(D.testTasks) ++ Seq(
      testOptions in Configs.IntegrationTests := Seq(
        Tests.Argument("-n", "example.tags.IntegrationTag")
      )
    )
  }
}

/**
 * Contains configs and settings for the "explicit-test-suites" sub-project
 */
object ExplicitTestSuites {
  object Configs {
    lazy val ExplicitSuites = config("es").extend(Test)
  }

  object Settings {
    lazy val esSettings = inConfig(Configs.ExplicitSuites)(D.testTasks) ++ Seq(
      testOptions in Configs.ExplicitSuites := Seq(
        Tests.Argument("-w", "example.explicitpackage.a.Suite"),
        Tests.Argument("-w", "example.explicitpackage.b.Suite")
      )
    )
  }
}

/**
 * Contains configs and settings for the "test-filters" sub-project
 */
object TestFilters {
  object Configs {
    lazy val IntegrationTests = config("integration").extend(Test)
  }

  object Settings {
    private def onlyIntegrationTests: Tests.Filter = {
      def filter(testName: String): Boolean = {
        val parts = testName.split('.')
        val packages = parts.take(parts.length - 1)
        packages.lastOption.exists(_.equalsIgnoreCase("integration"))
      }

      Tests.Filter(filter)
    }

    lazy val itSettings = inConfig(Configs.IntegrationTests)(D.testTasks) ++ Seq(
      testOptions in Configs.IntegrationTests := Seq(onlyIntegrationTests)
    )
  }
}
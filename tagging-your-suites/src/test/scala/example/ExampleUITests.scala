package example

import example.tags.UITag
import org.scalatest.FeatureSpec

@UITag
class ExampleUITests extends FeatureSpec {
  feature("feature1") {
    scenario("scenario 1") { }
    scenario("scenario 2") { }
  }

  feature("feature2") {
    scenario("scenario 1") { }
    scenario("scenario 2") {
      fail("Don't worry, I always fail!")
    }
  }
}
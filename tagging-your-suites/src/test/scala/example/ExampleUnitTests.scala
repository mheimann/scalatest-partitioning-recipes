package example

import example.tags.UnitTag
import org.scalatest.{Tag, FlatSpec}

object Slow extends Tag("example.tags.Slow")

@UnitTag
class ExampleUnitTests extends FlatSpec {
  "unitTest1" should "be successful" in {
    // Need to put in some actual test code here
  }

  "unitTest2" should "be successful" in {
    // Need to put in some actual test code here
  }

  "slowUnitTest" should "be successful but very slow" taggedAs Slow in {
    Thread.sleep(5000)
    // Need to put in some actual test code here
  }
}
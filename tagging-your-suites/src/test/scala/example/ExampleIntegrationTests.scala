package example

import example.tags.IntegrationTag
import org.scalatest.FlatSpec

@IntegrationTag
class ExampleIntegrationTests extends FlatSpec {
  "integrationTest1" should "be successful" in {
    // Need to put in some actual test code here
  }

  "integrationTest2" should "be successful" in {
    // Need to put in some actual test code here
  }
}

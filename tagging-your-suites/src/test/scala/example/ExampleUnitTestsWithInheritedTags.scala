package example

import example.tags.UnitTag
import org.scalatest.{FlatSpecLike, Matchers}

/**
 * It is MANDATORY that [[UnitSpec]] is a class, because inheriting annotations
 * from traits (or interface in Java) is not possible, even when using the @Inherited
 * meta annotation.
 *
 * In this case here, [[ExampleUnitTestsWithInheritedTags]] inherits the annotation [[UnitTag]]
 * from [[UnitSpec]] - this would not be the case if [[UnitSpec]] would be defined as a trait.
 *
 * This is a new addition in ScalaTest v2.2.0, i.e. ScalaTest 2.2.0 and beyond will scan for inherited
 * tag annotations.
 */
@UnitTag
class UnitSpec extends FlatSpecLike with Matchers

class ExampleUnitTestsWithInheritedTags extends UnitSpec {
  "unitTestWithInheritedTag" should "be successful" in {
    // Need to put in some actual test code here
  }
}

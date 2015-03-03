# scalatest-partitioning-recipes

This is an example project that is meant as a companion to the blog post at http://www.edgezero.de/2015/03/partitioning-your-test-code-with-scalatest-and-sbt.
  It contains a sub-project for each test partitioning strategy that is presented in the post, so perhaps you should click on the link to read it there :-).
  
I hope you'll find this information helpful!

## Navigating the Code

Here are a few hints and pointers at how to navigate this repository:

- This is a multi-module [SBT](http://www.scala-sbt.org/) project
- All projects are defined in `build.sbt` files with common/companion functionality in a couple of `.scala` files in the root-level `project` folder
- `build.sbt` contains the root-level module that defines sub-modules
- `project/Configs.scala` contains Configurations and Settings definitions for the individual sub-modules
- The folders `different-source-folders`, `explicit-test-suites`, `tagging-your-suites` and `test-filters` contain the sub-module code, there is only test code and no actual code


## Running in SBT shell

To run the different tasks, you need to start an `sbt` shell on the root-level folder.

### `different-source-folders`

- Run unit tests with `test`
- Run integration tests with `it:test`
- Run UI tests with `uitest:test`

### `tagging-your-suites`

- Run unit tests with `unit:test`
- Run integration tests with `integration:test`
- Run UI tests with `ui:test`

### `explicit-test-suites`

- Run explicit suite packages with `es:test`

### `test-filters`

- Run integration tests with `integration:test`

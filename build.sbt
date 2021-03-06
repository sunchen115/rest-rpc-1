import LaikaKeys._
import GhPagesKeys._

organization := "com.thoughtworks"

name := "microbuilder"

lazy val hamu = project

lazy val `auto-parser` = project dependsOn hamu

lazy val `json-stream` = project

lazy val `microbuilder-core` = project dependsOn `auto-parser` dependsOn hamu dependsOn `json-stream`

lazy val `microbuilder-play` = project dependsOn `microbuilder-core`

lazy val `microbuilder-sample` = project dependsOn `microbuilder-play`


ghpages.settings

git.remoteRepo := "git@github.com:ThoughtWorksInc/microbuilder.git"

git.gitCurrentBranch := "master"

LaikaPlugin.defaults

mappings in synchLocal := (mappings in LaikaKeys.site in Laika).value

developers := List(
  Developer(
    "Atry",
    "杨博 (Yang Bo)",
    "pop.atry@gmail.com",
    url("https://github.com/Atry")
  )
)

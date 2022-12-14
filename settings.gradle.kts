/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/7.5.1/userguide/multi_project_builds.html
 */

rootProject.name = "devops-practice"
val destination = File(".git/hooks/commit-msg")

plugins {
  id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.0.25"
}

gitHooks {
  commitMsg {
    conventionalCommits()
  }
  createHooks(true)
}

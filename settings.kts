
import jetbrains.buildServer.configs.kotlin.v2025.07.*
import jetbrains.buildServer.configs.kotlin.v2025.07.project
import jetbrains.buildServer.configs.kotlin.v2025.07.buildSteps.*

version = "2025.07" // Specifies the TeamCity server version

project {
    name = "Jenkins_Demo" // Name of the TeamCity project

    vcsRoot(DslContext.settingsRoot) // Uses the VCS root where the settings.kts file resides

    buildType {
        name = "JenkinsDemo_Build // Name of the build configuration
        id = RelativeId("JenkinsDemo_Build") // Unique ID for the build configuration

        steps {
            // Define a build step, e.g., running a shell script
            script {
                name = "Run Tests"
                scriptContent = "echo 'Running tests...'" // Simple shell command
            }
        }

        triggers {
            // Define a trigger, e.g., a VCS trigger to run on changes
            vcs {
                triggerRules = "" // Empty rules mean it triggers on any VCS change
            }
        }
    }
}

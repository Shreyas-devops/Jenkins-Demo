import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object Build : BuildType({
    name = "Build"

    vcs {
        root(HttpsGithubComShreyasDevopsJenkinsDemoGitRefsHeadsMain)
    }

    steps {
        script {
            name = "Build"
            id = "Build"
            scriptContent = """echo "this is build step""""
        }
        script {
            name = "Test"
            id = "Test"
            scriptContent = """echo "this is test step""""
        }
        script {
            name = "Deploy"
            id = "Deploy"
            scriptContent = """echo " This  is deploy step...""""
        }
    }

    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }
})

version = "2025.07" // Specify the TeamCity version

project {
    buildType(HelloWorld) // Reference the build type defined below
}

object HelloWorld : BuildType({
    id("JenkinsDemo_Build") // Unique ID for the build configuration
    name = "Demo" // Display name in TeamCity UI

    steps {
        script {
            name = "Echo Hello"
            scriptContent = "echo 'Hello world!'" // Simple shell script step
        }
    }

    triggers {
        vcs {
            // Trigger the build on changes in the associated VCS root
        }
    }

    requirements {
        // Define agent requirements, e.g., system.os = "Linux"
    }

    features {
        // Add build features, e.g., commit status publisher
    }

    params {
        // Define build parameters, e.g., text("myParam", "defaultValue")
    }
})

import org.gradle.api.Plugin
import org.gradle.api.Project

class AsmPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.task("asmplugin") {
            doLast {
                println("asm plugin")
            }
        }

        project.task("hi") {
            doLast {
                println("hi")
            }
        }
    }
}
package me.yifeiyuan.hfasm

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class AsmPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("AsmPlugin")
        AppExtension appExtension = project.extensions.getByType(AppExtension)
        appExtension.registerTransform(new HFTransform(project))
        appExtension.registerTransform(new FirstTransform(project))
    }

}
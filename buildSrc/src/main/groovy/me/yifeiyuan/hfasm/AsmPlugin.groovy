package me.yifeiyuan.hfasm

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


    }



//    class TT extends Transform {
//
//        @Override
//        String getName() {
//            return null
//        }
//
//        @Override
//        Set<ContentType> getInputTypes() {
//            return null
//        }
//
//        @Override
//        Set<? super Scope> getScopes() {
//            return null
//        }
//
//        @Override
//        boolean isIncremental() {
//            return false
//        }
//    }


}
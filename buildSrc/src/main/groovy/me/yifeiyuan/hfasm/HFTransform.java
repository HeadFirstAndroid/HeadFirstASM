package me.yifeiyuan.hfasm;

import com.android.build.api.transform.Context;
import com.android.build.api.transform.DirectoryInput;
import com.android.build.api.transform.JarInput;
import com.android.build.api.transform.QualifiedContent;
import com.android.build.api.transform.Transform;
import com.android.build.api.transform.TransformException;
import com.android.build.api.transform.TransformInput;
import com.android.build.api.transform.TransformInvocation;
import com.android.build.api.transform.TransformOutputProvider;
import com.android.build.gradle.internal.pipeline.TransformManager;

import org.gradle.api.Project;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 程序亦非猿 on 2020/8/18.
 */
public class HFTransform extends Transform {


    public HFTransform(Project project) {

    }

    @Override
    public String getName() {
        return "fhtransform";
    }

    @Override
    public Set<QualifiedContent.ContentType> getInputTypes() {
        return TransformManager.CONTENT_CLASS;
    }

    @Override
    public Set<? super QualifiedContent.Scope> getScopes() {
        return TransformManager.SCOPE_FULL_PROJECT;
    }

    @Override
    public boolean isIncremental() {
        return false;
    }

    @Override
    public void transform(TransformInvocation transformInvocation) throws TransformException, InterruptedException, IOException {
        super.transform(transformInvocation);
        System.out.println("HFTransform: transform");

        transformInvocation.getInputs();

        if (transformInvocation.isIncremental()) {
            System.out.println("增量编译");
        }else{
            System.out.println("全量编译");
        }

        if (!transformInvocation.isIncremental() && transformInvocation.getOutputProvider() != null) {
            transformInvocation.getOutputProvider().deleteAll();
        }

        for (TransformInput input : transformInvocation.getInputs()) {
            handleInput(input);
        }
    }

    private void handleInput(TransformInput input) {

        //文件夹目录中的 class 文件
        for (DirectoryInput directoryInput : input.getDirectoryInputs()) {
            System.out.println(directoryInput);
        }

        //jar 包中的 class 文件
        for (JarInput jarInput : input.getJarInputs()) {
            System.out.println(jarInput);
        }

    }

}

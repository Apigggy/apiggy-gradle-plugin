package com.github.apiggs;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ApiggsPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {

        project.getTasks().create("hello", ApiggsTask.class, (task) -> {
            System.out.println(task);
            System.out.println("hello");
        });
    }
}

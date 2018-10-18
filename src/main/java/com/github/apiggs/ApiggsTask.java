package com.github.apiggs;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.util.Set;

/**
 * Gradle构建配置类
 * 配置项参考
 * {@link com.github.apiggs.Environment}
 */
public class ApiggsTask extends DefaultTask {

    String id;
    String title;
    String description;
    String out;
    Set<String> sources;
    Set<String> dependencies;
    Set<String> jars;
    Set<String> ignores;

    @TaskAction
    void work() {
        System.out.println("hello world");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public Set<String> getSources() {
        return sources;
    }

    public void setSources(Set<String> sources) {
        this.sources = sources;
    }

    public Set<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Set<String> dependencies) {
        this.dependencies = dependencies;
    }

    public Set<String> getJars() {
        return jars;
    }

    public void setJars(Set<String> jars) {
        this.jars = jars;
    }

    public Set<String> getIgnores() {
        return ignores;
    }

    public void setIgnores(Set<String> ignores) {
        this.ignores = ignores;
    }
}

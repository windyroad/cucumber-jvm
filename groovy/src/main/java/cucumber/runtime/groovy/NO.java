package cucumber.runtime.groovy;

import groovy.lang.Closure;

import java.util.regex.Pattern;

public class NO {
    public static void Gitt(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.instance.addStepDefinition(regexp, body);
    }

    public static void Når(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.instance.addStepDefinition(regexp, body);
    }

    public static void Så(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.instance.addStepDefinition(regexp, body);
    }

    public static void Og(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.instance.addStepDefinition(regexp, body);
    }

    public static void Men(Pattern regexp, Closure body) throws Throwable {
        GroovyBackend.instance.addStepDefinition(regexp, body);
    }

}

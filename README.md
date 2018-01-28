# UseDssbUtilsGradle
Example of how to use dssb-utils in a Gradle project.

It basically boiled down to adding dssb maven repository (hosted by github).

```Groovy
repositories {
    jcenter()
    maven { url 'https://raw.githubusercontent.com/dssb/maven-repository/master/' }
}

dependencies {
    compileOnly 'org.projectlombok:lombok:1.16.16'
    compile     'dssb-utils:utils-common:2.0.0'
}
```

See the full code here: [build.gradle](https://github.com/DSSB/UseDssbUtilsGradle/blob/master/UseDssbUtilsGradle/build.gradle)


打包插件,加入后,打的包,才可以运行 否则会提醒 no ....main
```java
    <build>
        <plugins>
<!--            打包插件 可达成jar包-->
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
```
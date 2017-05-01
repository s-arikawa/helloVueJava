# Hello World Vue.js + Java Application

## 概要
Vue.jsをフロントエンドに、Javaで書いたWeb APIをバックエンドにしたアプリケーション。

JavaのHello World REST APIを作って、フロントエンドのvue.jsに表示するだけのシステムを作る。

## 構築手順

### 1. gradleとnpm初期設定

```shell
mkdir helloVueJava
cd helloVueJava
mkdir backend
mkdir frontend
cd backend
gradle init --type java-application
cd ../frontend
npm init
```

### 2. backend - Javaを構築

Spring BootでHello Worldを構築する。

1. project nameを変更
    - settings.gradle
    - `rootProject.name = 'hellovuejava-backend'`
1. gradleにSpring Boot Gradle pluginを追加する
    - https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-gradle-plugin.html
1. Spring Boot Webを依存関係に追加
    - `spring-boot-starter-web`
1. main classを変更
    - `mainClassName = 'hello.Main'`
1. mkdir src/main/java/hello
    - SampleController.javaを作成
    - Main.javaを作成
1. gradle buildを実行
1. gradle bootrun
    ```
    :compileJava UP-TO-DATE
    :processResources NO-SOURCE
    :classes UP-TO-DATE
    :findMainClass
    :bootRun

    .   ____          _            __ _ _
    /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
    \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
    '  |____| .__|_| |_|_| |_\__, | / / / /
    =========|_|==============|___/=/_/_/_/
    :: Spring Boot ::        (v1.5.3.RELEASE)
    略
    ```
1. ブラウザで`http://localhost:8080/hello`にアクセス
    - **Hello World!** と表示されたら成功！

#### SampleController.java
```java
package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    String hello() {
        return "Hello World!";
    }
}
```

#### Main.java
```java
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
```


### 3. frontend - vue.jsを構築

- .gitignoreを書く
    - `/node_modules`
- npmで必要なライブラリを追加する
    - `npm i -S vue materialize-css`
    - `npm i -D babel-core babel-loader babel-preset-es2015 css-loader file-loader style-loader url-loader vue-loader vue-template-compiler webpack webpack-dev-server`
- .babelrcを書く
    ```
    {
        "presets": ["es2015"]
    }
    ```




















### 参考
- [Spring Boot](https://projects.spring.io/spring-boot/)
- [Spring Boot 使い方メモ - Qiita](http://qiita.com/opengl-8080/items/05d9490d6f0544e2351a#web-%E3%82%A2%E3%83%97%E3%83%AA%E3%82%92%E4%BD%9C%E3%82%8B)
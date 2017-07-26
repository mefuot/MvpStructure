# MvpStructure
MVP layout base class for Android

```java
MvpContract
MvpContract.View
MvpContract.ViewWithLoading
MvpContract.Presenter<V extend MvpContract.View>

MvpPresenter<V extend MvpContract.View>

MvpView<P extend MvpContract.Presenter>
```


### Install
#### Maven
```groovy
<dependency>
  <groupId>com.pong.library</groupId>
  <artifactId>mvp-structure</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
#### Gradle
```groovy
compile 'com.pong.library:mvp-structure:1.0.0'
```


### About
See sample project structure at :app

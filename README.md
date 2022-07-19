# ToastIt

Show custom toasts.

[![API](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=23) [![](https://jitpack.io/v/sunilk9211/ToastLibrary.svg)](https://jitpack.io/#sunilk9211/ToastLibrary) [![API](https://img.shields.io/badge/License-GPL%203.0-red.svg?style=flat)](https://github.com/sunilk9211/ToastIt/blob/master/LICENSE)


## Using in your projects

### Maven

#### Add the JitPack repository to your build file

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  
####  Add the dependency

	<dependency>
	    <groupId>com.github.sunilk9211</groupId>
	    <artifactId>ToastIt</artifactId>
	    <version>1.0.0-alpha06</version>
	</dependency>
  
  
### Gradle

#### Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
#### Add the dependency

	dependencies {
	        implementation 'com.github.sunilk9211:ToastIt:1.0.0-alpha06'
	}
  
  
## Usage

        ToastIt.normal(
            supportFragmentManager,
            "Title message",
            "This is your toast message"
        )
	
![Screenshot_2022-07-17-16-48-10-8](https://user-images.githubusercontent.com/36289013/179399074-78fc8039-1cf6-42e2-8cae-c201977cf96a.jpg)



        ToastIt.normal(
            supportFragmentManager,
            "This is your toast message"
        )
	
	
![Screenshot_2022-07-17-16-48-28-3](https://user-images.githubusercontent.com/36289013/179399149-99a0ba8c-ee56-42cf-91b7-d6ccee364aa0.jpg)


## Want to contribute?

This project is early stage of development, it will be awesome to have some good contributors like you. 😃
If you have any suggestion to improve this project, please mention that here https://github.com/sunilk9211/ToastIt/issues


## Contributors

[![ToastIt Contributors](https://contrib.rocks/image?repo=sunilk9211/ToastIt)](https://github.com/sunilk9211/ToastIt/graphs/contributors)

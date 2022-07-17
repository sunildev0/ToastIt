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
	    <version>1.0.0-alpha02</version>
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
	        implementation 'com.github.sunilk9211:ToastIt:1.0.0-alpha02'
	}
  
  
## Usage

        ToastIt.normal(
            supportFragmentManager,
            "Title message",
            "This is your toast message"
        )
	
![Screenshot_2022-07-17-16-48-10-834_com sunilkumar toastit](https://user-images.githubusercontent.com/36289013/179398873-c8b0be9b-dada-4678-b357-a7b4ec28f7d3.jpg)


        ToastIt.normal(
            supportFragmentManager,
            "This is your toast message"
        )
	
![Screenshot_2022-07-17-16-48-28-351_com sunilkumar toastit](https://user-images.githubusercontent.com/36289013/179398917-e21fd961-a261-49b9-b651-6ad4ba5a0ec6.jpg)
	
	

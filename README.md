# ToastLibrary
Easy way to showing toast on your android app

## Download

Step 1 Add it in your root build.gradle at the end of repositories

```	
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	} 
 ```
 
 Step 2. Add the dependency
 
 ```
 	dependencies {
	        implementation 'com.github.rohmanseo:ToastLibrary:$version'
	}
 ```
 
 ## Implementation
  
```
 ToastUtils.showToast(this,"Hello World")
 ```
 
 

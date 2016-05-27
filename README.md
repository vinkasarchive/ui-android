# Vinkas UI

[![](https://jitpack.io/v/com.vinkas/ui.svg)](https://jitpack.io/#com.vinkas/ui)
[![License: MIT](https://img.shields.io/badge/License-MIT-orange.svg)](https://opensource.org/licenses/MIT)
<hr />
Custom made android UI elements for our vinkas projects

## Add as dependency module
Add this on your project's root 'build.gradle' file
```
  repositories { 
        jcenter()
        maven { url "https://jitpack.io" }
   }
```
Add this on your app folder's 'build.gradle' file
```
   dependencies {
         compile 'com.vinkas:ui:1.0.0'
  }
```
OR
```
   dependencies {
         compile 'com.vinkas.ui:flowlayout:1.0.0'
         compile 'com.vinkas.ui:viewpager:1.0.0'
  }
```
## How to use
###ViewPager
####Xml layout
```
<com.vinkas.ui.ViewPager
        android:id="@+id/viewPager"
        app:swipeable="false"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

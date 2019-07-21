# VMOO Android Client 

The application has been published onto the market for easy access:

[![Get it on HUAWEI](https://android-artworks.25pp.com/fs08/2019/06/04/10/106_fb26d4e9fad8e6e9ba2c06224dd420ac_con_130x130.png)](http://a.vmall.com/uowap/index.html#/detailApp/C100807113)
[![Get it on MIMUI](http://app.mi.com/assets/img/slice/logo.png)](http://app.mi.com/details?id=com.seafile.vmoo&ref=search)

## Contributors

See [Contributors Graph](https://github.com/SaudM/seadroid/pulse)

## Build the APK

* Make sure you have installed the [Android SDK](http://developer.android.com/sdk/index.html) then:

* cd into seadroid directory
* Create `key.properties` file or simply rename `key.properties.example` and change configurations to match yours.

* Create keystore file if you don't have one

 ```
 keytool -genkey -v -keystore app/debug.keystore -alias AndroidDebugKey -keyalg RSA -keysize 2048 -validity 1 -storepass android -keypass android -dname "cn=TEST, ou=TEST, o=TEST, c=TE"
 ```
* Build with `./gradlew assembleRelease`

You will get `app/build/outputs/apk/vmoo-${versionName}.apk` after the build finishes.

## Develop in Android Studio

### Prerequisites

* Android Studio
* OpenJDK 8 / OracleJDK 8

### Import project

* Open Android Studio
* Import project
* Select seadroid directory
* Choose import from gradle
* Click next until import is completed


## 中文一些说明
* 这是一个致力于共享各类学习视频的平台
* 欢迎贡献你手里到任何类型的视频或者学习资料 [上传视频](https://vmoo.saud.net.cn/u/d/bd7decfe0456483d9c0b/) 
* 欢迎贡献代码

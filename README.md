# 微墨

## 中文：
### 我
我不想忙忙碌碌，我不想受制于人，我不想一事无成，不想活的毫无意义，不想悄悄的死了没人记的。我想改变这一切，这个世界上无数种方式方法可以改变我自己，但我知道，最有效，最有意义但方式，就是学习。

所以我选择学习，我要改变自己，我要提升自己，我要活的精彩，我要走入另外一个领域，我要充实自己，我要开阔眼界，我要扩大边界。学习是唯一快速，有效路径。

但我不知道怎么有效学习，我甚至都没有切入点，我甚至都不知道学到什么成都才算有成果。我把我学习但视频放在这里。如果你愿意，我们一起学习。如果你愿意，我们一起搭建这个平台。

我要成为最强者，我要不停但提升，我才能站立在人群中有所不通。

### 你
如果你愿意和我一起成长，那我们一起做一个学习平台，我们做一些有意义的事。我们终身骄傲的事。

### 我们
想象下，因为我们的存在，我们的爸妈，我们的孩子，我们的兄弟，我们的同事，我们的同学都在这里学习，是一种什么场景......
想象下，因为我们的存在，我们的孩子不在打游戏，刷抖音，不在看动漫，而是来主动这里看视频，学习技能，学习外语，学习手工，学习音乐，学习科学......
想象下，因为我们的存在，我们的父母因为我们，不在盯着电视看，不再看快手......
想象下，因为我们的存在，偏远山区的孩子，可以用手机不惜功课，开阔使用，学习新技能......
想象下，因为我们的存在，考验的同学部位专业课而发愁，不在为英语学习而发愁......
想象下，因为我们的存在，专业技能考试不在需要高额的培训费......
想象下，因为我们的存在，为人们开启一扇自学的大门，为人们指明学习的道路，为人们提供一个学习的启示，给人们一个突破自己界限的机会......
想象下，如果我们把app弄进入微信里，我们的app安装在每一个台出厂的手机上......

### 我需要你
期待你的加入！！！ 期待你我一起成长！！！


The application has been published onto the market for easy access:

[![Get it on HUAWEI](https://vmoo.saud.net.cn/thumbnail/021aac230cf74330833e/1024/hlogo.png)](http://a.vmall.com/uowap/index.html#/detailApp/C100807113)
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

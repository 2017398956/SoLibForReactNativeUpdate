# SoLibForReactNativeUpdate
使用 pushy 对 ReactNative 进行热更新时所需的 so 文件

在使用 [pushy](http://update.reactnative.cn/ "pushy") 对 ReactNative 项目进行热修复时，由于 react-native-update:android 下面中含有 jni ，导致某些情况下编译不成功。现将其中的 c文件 单独提取出来，创建一个可以生成 rnupdate.so 的项目，以便在 ReactNative 项目中使用。为了方便，在 rnupdate_lib 目录下提供了 x86 和 armeabi-v7a 的 so 库，使用时只需放在 ../node_modules/react-native-update/android/lib 下，并删除其 所有 jni 文件即可；如果需要其它平台，如 x86_64，请下载该项目自行编译。

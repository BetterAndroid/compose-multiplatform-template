# compose-multiplatform-template

[![GitHub license](https://img.shields.io/github/license/BetterAndroid/compose-multiplatform-template?color=blue)](https://github.com/BetterAndroid/compose-multiplatform-template/blob/main/LICENSE)
[![Telegram](https://img.shields.io/badge/discussion-Telegram-blue.svg?logo=telegram)](https://t.me/BetterAndroid)
[![Telegram](https://img.shields.io/badge/discussion%20dev-Telegram-blue.svg?logo=telegram)](https://t.me/HighCapable_Dev)

<img src="img-src/icon.png" width = "100" height = "100" alt="LOGO"/>

一个快速生成 Android、iOS、Desktop (JVM) 的 Jetpack Compose 多平台项目模版。

<img width="1767" alt="SHOT" src="img-src/shot.png">

[English](README.md) | 简体中文

| <img src="https://github.com/BetterAndroid/.github/blob/main/img-src/logo.png?raw=true" width = "30" height = "30" alt="LOGO"/> | [BetterAndroid](https://github.com/BetterAndroid) |
|---------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------|

这个项目属于上述组织，**点击上方链接关注这个组织**，发现更多好项目。

## 这是什么

这是一个快速生成 Android、iOS、Desktop (JVM) 的 Jetpack Compose 多平台项目模版。

Jetpack Compose 的跨平台能力为 Android 开发者将应用程序部署到多个平台提供了可能，这份模版修改自官方提供的 [compose-multiplatform-ios-android-template](https://github.com/JetBrains/compose-multiplatform-ios-android-template)，
它改进了项目结构并支持了桌面端 (JVM) 的跨平台能力。

## 开始使用

在 GitHub 上点击“Use this template”按钮来使用此模版，成功创建新的存储库后，使用 `git clone` 命令将你的项目克隆到本地，此时不要立即打开项目。

在项目的根目录，你可以找到 `initializer.json` 和 `initializer.py` 两个文件，请打开 `initializer.json` 文件，内容如下。

```json
{
  // 你的项目名称，这将作为整个 Gradle 项目的名称，只允许英文
  "__PROJECT_NAME__": "compose-multiplatform-demo",
  // 你的 App 名称
  "__APP_NAME__": "Compose Multiplatform Demo",
  // 你的项目组名 (Android 为 Package Name, Java 为 Group, iOS 为 Bundle ID)
  "__GROUP_NAME__": "com.highcapable.composemultiplatformdemo"
}
```

编辑完成配置文件后，运行 `initializer.py` 脚本对项目进行初始化，初始化成功后这两个文件会被自动删除。

如果你的系统中没有 Python，请前往 [官网](https://www.python.org/) 下载一个，然后在命令行执行 `python3 initializer.py`。

如果你正在使用 macOS 或 Linux，你可以直接执行 `./initializer.py`。

项目初始化成功后，你可以使用 Android Studio 或 IntelliJ IDEA 打开这个项目，确保你已经正确安装 [kotlin-multiplatform-mobile](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) 插件。

若要正常编译 iOS 项目，你需要使用 macOS 系统进行开发并安装 Xcode。

## 项目推广

<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h2>嘿，还请君留步！👋</h2>
    <h3>这里有 Android 开发工具、UI 设计、Gradle 插件、Xposed 模块和实用软件等相关项目。</h3>
    <h3>如果下方的项目能为你提供帮助，不妨为我点个 star 吧！</h3>
    <h3>所有项目免费、开源，遵循对应开源许可协议。</h3>
    <h1><a href="https://github.com/fankes/fankes/blob/main/project-promote/README-zh-CN.md">→ 查看更多关于我的项目，请点击这里 ←</a></h1>
</div>

## Star History

![Star History Chart](https://api.star-history.com/svg?repos=BetterAndroid/compose-multiplatform-template&type=Date)

## 许可证

- [Apache-2.0](https://www.apache.org/licenses/LICENSE-2.0)

```
Apache License Version 2.0

Copyright (C) 2019-2024 HighCapable

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

版权所有 © 2019-2024 HighCapable
# compose-multiplatform-template

[![GitHub license](https://img.shields.io/github/license/BetterAndroid/compose-multiplatform-template?color=blue)](https://github.com/BetterAndroid/compose-multiplatform-template/blob/main/LICENSE)
[![Telegram](https://img.shields.io/badge/discussion-Telegram-blue.svg?logo=telegram)](https://t.me/BetterAndroid)
[![Telegram](https://img.shields.io/badge/discussion%20dev-Telegram-blue.svg?logo=telegram)](https://t.me/HighCapable_Dev)

<img src="img-src/icon.png" width = "100" height = "100" alt="LOGO"/>

A Jetpack Compose Multiplatform project template that quickly generates Android, iOS, and Desktop (JVM).

<img width="1767" alt="SHOT" src="img-src/shot.png">

English | [简体中文](README-zh-CN.md)

| <img src="https://github.com/BetterAndroid/.github/blob/main/img-src/logo.png?raw=true" width = "30" height = "30" alt="LOGO"/> | [BetterAndroid](https://github.com/BetterAndroid) |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------- |

This project belongs to the above-mentioned organization, **click the link above to follow this organization** and discover more good projects.

## What's this

This is a Jetpack Compose Multiplatform project template that quickly generates Android, iOS, and Desktop (JVM).

The cross-platform capability of Jetpack Compose provides Android developers with the possibility to deploy applications to multiple platforms.

This template is modified from the official [compose-multiplatform-ios-android-template](https://github.com/JetBrains/compose-multiplatform-ios-android-template),
it improves project structure and supports cross-platform capabilities on the desktop (JVM).

## Get Started

Click the "Use this template" button on GitHub to use this template.

After successfully creating a new repository, use the `git clone` command to clone your project locally, do not open the project immediately at this time.

In the root directory of the project, you can find two files, `initializer.json` and `initializer.py`, please open the `initializer.json` file, the contents are as follows.

```json
{
   // Your project name, this will be used as the name of the entire Gradle project, only English is allowed
   "__PROJECT_NAME__": "compose-multiplatform-demo",
   // Your app name
   "__APP_NAME__": "Compose Multiplatform Demo",
   // Your project group name (Package Name for Android, Group for Java, Bundle ID for iOS)
   "__GROUP_NAME__": "com.highcapable.composemultiplatformdemo"
}
```

After editing the configuration file, run the `initializer.py` script to initialize the project, after successful initialization, these two files will be automatically deleted.

If there is no Python in your system, please go to [official website](https://www.python.org/) to download one, and then execute `python3 initializer.py` on the command line.

If you are using macOS or Linux, you can execute `./initializer.py` directly.

After the project is initialized successfully, you can use Android Studio or IntelliJ IDEA to open the project and ensure that you have correctly installed [kotlin-multiplatform-mobile](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) plugin.

To compile the iOS project normally, you need to use macOS for development and install Xcode.

## Promotion

<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
     <h2>Hey, please stay! 👋</h2>
     <h3>Here are related projects such as Android development tools, UI design, Gradle plugins, Xposed Modules and practical software. </h3>
     <h3>If the project below can help you, please give me a star! </h3>
     <h3>All projects are free, open source, and follow the corresponding open source license agreement. </h3>
     <h1><a href="https://github.com/fankes/fankes/blob/main/project-promote/README.md">→ To see more about my projects, please click here ←</a></h1>
</div>

## Star History

![Star History Chart](https://api.star-history.com/svg?repos=BetterAndroid/compose-multiplatform-template&type=Date)

## License

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

Copyright © 2019-2024 HighCapable
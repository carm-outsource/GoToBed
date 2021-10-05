# GoToBed 快去睡觉！

![CodeSize](https://img.shields.io/github/languages/code-size/CarmJos/GoToBed?style=flat-square)
[![Maven](https://img.shields.io/github/workflow/status/CarmJos/GoToBed/maven?style=flat-square)](https://github.com/CarmJos/GoToBed/actions/workflows/maven.yml)
![Support](https://img.shields.io/badge/Minecraft-Java%201.12--Latest-yellow?style=flat-square)
![Version](https://img.shields.io/github/v/release/CarmJos/GoToBed?style=flat-square)
[![license](https://img.shields.io/github/license/CarmJos/GoToBed?style=flat-square)](https://opensource.org/licenses/mit-license.php)

## 简介

本插件将在有玩家睡觉时，提醒其他玩家赶快入睡度过恐怖的夜晚。

本插件基于Spigot实现，功能简单，运行稳定，**理论上支持全版本**。

本插件由 [璎珞服务器](https://www.yingluo.world) 请求本人开发，经过授权后开源。

## 依赖

- **[必须]** 插件本体基于 [Spigot-API](https://hub.spigotmc.org/stash/projects/SPIGOT) 、[BukkitAPI](http://bukkit.org/) 实现。

详细依赖列表可见 [Dependencies](https://github.com/CarmJos/GoToBed/network/dependencies) 。

## 配置文件示例

### [基础配置文件](https://github.com/CarmJos/GoToBed/blob/master/src/main/resources/config.yml) (config.yml)

```yaml
settings:
  # 通知消息
  #  - 支持使用 “&” 代替小结号作为颜色符号
  #  - 变量： %(player)   躺上床的玩家名
  #  - 变量： %(sleeping) 已经躺上床的玩家数
  #  - 变量： %(online)   在线玩家数
  message: "&8☾ &f%(player) &7喊你睡觉啦！(&f%(sleeping)/%(online)&7)"
```

## 支持与捐赠

若您觉得本插件做的不错，您可以捐赠支持我！

感谢您成为开源项目的支持者！

<img height=25% width=25% src="https://github.com/CarmJos/CarmJos/blob/main/img/PAY.jpg" />

## 开源协议

本项目源码采用 [The MIT License](https://opensource.org/licenses/mit-license.php) 开源协议。

> ### 关于 MIT 协议
> MIT 协议可能是几大开源协议中最宽松的一个，核心条款是：
>
> 该软件及其相关文档对所有人免费，可以任意处置，包括使用，复制，修改，合并，发表，分发，再授权，或者销售。唯一的限制是，软件中必须包含上述版 权和许可提示。
>
> 这意味着：
> - 你可以自由使用，复制，修改，可以用于自己的项目。
> - 可以免费分发或用来盈利。
> - 唯一的限制是必须包含许可声明。
> - MIT 协议是所有开源许可中最宽松的一个，除了必须包含许可声明外，再无任何限制。
>
> *以上文字来自 [五种开源协议GPL,LGPL,BSD,MIT,Apache](https://www.oschina.net/question/54100_9455) 。*

## 其他信息

![Visitors](https://visitor-badge.glitch.me/badge?page_id=gotobed.readme)

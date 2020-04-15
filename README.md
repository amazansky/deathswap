# deathswap

This is a Bukkit plugin that allows players to play the DeathSwap, a Minecraft minigame. DeathSwap was originally conceived by SethBling, while this plugin supports the style of the game played by Dream, in which players swap at set intervals (usually every 5 minutes) instead of random intervals.

### Available commands:

*   /dsgame join - joins the lobby
*   /dsgame leave - leaves the lobby
*   /dsgame start - starts a new DeathSwap game with the players in the lobby
*   /dsgame stop - you commit suicide and leave the DeathSwap game
*   /dsgame settings - set different options of the game
*   /dsgame info - display information about the game

### Installation:

#### Compile it yourself!
*NOTE: It's also possible to compile the plugin in an IDE, but these instructions use the command line.*

*   Clone or download this repository to your computer.
*   Ensure you have the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) installed. Version 8 or higher of the JDK is required.
*   [Download](https://maven.apache.org/download.cgi) and [install](https://maven.apache.org/install.html) Maven. It is used to get dependencies for the plugin.
*   On the command line, change directories to the root folder of the plugin, then run `mvn clean install`.
*   Drag the newly generated `deathswap-0.1.0.jar` file (located in `target/`) into your server's plugins folder, reload your server, and enjoy!

### Config:

#### config.yml

*   gameWorld-name - This sets the name of your gameWorld (Use something unique)
*   difficulty - This sets the default difficulty
*   swap-interval - This sets the default time between swaps (in seconds)

*TODO: Implement swap time which changes after a certain length of time (e.g. swaps every 3 minutes after first 20 minutes)*

### Supported Minecraft versions:

*   1.15.2
*   1.15.1
*   1.15
*   1.14.4
*   1.14.3
*   1.14.2
*   1.14.1
*   1.14

*NOTE: You can experiment with testing out different versions of Bukkit and Java in the `pom.xml` file, although these haven't been tested and are not guaranteed to work.*

## Attribution:

* This DeathSwap plugin is based on [ConcreteCactus/DeathSwap](https://github.com/ConcreteCactus/DeathSwap) (licensed under [MIT](https://github.com/ConcreteCactus/DeathSwap/blob/master/LICENSE)). Portions of this software which originate from ConcreteCactus/DeathSwap are subject to the following:
```
MIT License

Copyright (c) 2020 rh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

# deathswap

This is a bukkit plugin that enables players to play the game called DeathSwap. It was originally created by SethBling, and this version of the plugin supports the implementation created by Dream, in which players swap at set intervals instead of random intervals.

### Available commands:

*   /dsgame join - joins the lobby
*   /dsgame leave - leaves the lobby
*   /dsgame start - starts a new DeathSwap game with the players in the lobby
*   /dsgame stop - you commit suicide and leave the DeathSwap game
*   /dsgame settings - set different options of the game
*   /dsgame info - display information about the game

### Installation:

*   Clone this repository to your computer
*   [Download](https://maven.apache.org/download.cgi) and [install](https://maven.apache.org/install.html) Maven. It is used to get dependencies for the plugin.


### Config:

#### config.yml

*   gameWorld-name - This sets the name of your gameWorld (Just use something unique please)
*   difficulty - This sets the default difficulty
*   swap-time - This sets the default value of max-swap-time

*TODO: Implement swap time which changes after a certain length of time (e.g. swaps every 3 minutes after first 20 minutes)*

### Supported minecraft versions:

*   1.15.2
*   1.15.1
*   1.15
*   1.14.4
*   1.14.3
*   1.14.2
*   1.14.1
*   1.14

## Attribution:

* This DeathSwap plugin is based on [ConcreteCactus/DeathSwap](https://github.com/ConcreteCactus/DeathSwap) (licensed under [MIT](https://github.com/ConcreteCactus/DeathSwap/blob/master/LICENSE)). Parts of this plugin which derive from ConcreteCactus/DeathSwap are subject to the following license:
```MIT License

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

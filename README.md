![dddddd](https://user-images.githubusercontent.com/69589624/109410126-1623c480-7966-11eb-9bd4-56984a88a6aa.PNG)
                                                                 
bedroom is a latest version fabric base for minecraft clients. this was made to serve as the base for beach house, i'm just making it public so others can use it and learn from it.<br>
<br>
bedroom is intended for use as a latest version fabric base for minecraft anarchy clients, it can serve as a good starting tool and can have different aspects of it changed or added onto, like adding a more in depth command system, or adding some sort of your own ui elements, and of course you own modules.
<br>
<br> this is not a cheat. it's intent is for minecraft anarchy clients, and it's use for otherwise is redundant. either way bedroom itself is not a cheat, nor are it's intended targets. also, due to previous events, i would like to remind u that fabric is "free to use for everyone. No exceptions." thank you :)
<br>
# bedroom's road map
**plans for bedroom 2** <br>
- color system <br>
- font renderer <br>
- improved command system <br>
- notification system <br>
- switch config to JSON <br>

*im not sure if i wanna do any ui stuff yet, i have some plans for that in the future but if anyone has some ideas, lmk :)* <br>
<br>

**bedroom 1** <br>
✔ events <br>
✔ configs <br>
✔ module system <br>
✔ setting system <br>
✔ command system <br>
✔ ui stuff <br>
<br>
# use of bedroom
***for eclipse*** <br>
- drag .zip release to a new folder
- open folder in cmd
- type gradlew eclipse
- type gradlew genSources
- boom... use

***main class*** <br>
all you have to do in your main class is change the top few lines...
```
public static final String modid = "bed";
public static final String name = "bedroom";
public static final String nameCondensed = "bedroom"; // this is for if there are spaces in ur mod name... "mod name" -> "mod-name".
public static final String version = "1";
  ```
you can change the modid, name, nameCondensed, and version variables to fit your own clients. <br>
you may also add different inits to the client under `// (your clients name)'s inits... if u need any.` <br>

***command system*** <br>
as for all of the systems here, you can use the current commands as examples. <br>

***module system w/ settings*** <br>
you can use the current modules as examples <br>

<br>
please respect the license in this repo. this is a template repo making it easier to simply use the underlying template to edit however you like, or you can clone the repo and create your own repo, as long as this base is properly credited. 

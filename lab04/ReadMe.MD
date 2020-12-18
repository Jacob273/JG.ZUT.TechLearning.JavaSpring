# MVC

Short description:
from msdn ( https://docs.microsoft.com/en-us/aspnet/core/mvc/overview?view=aspnetcore-5.0 )


__The Model-View-Controller (MVC)__ architectural pattern separates an application into three main groups of components: Models, Views, and Controllers. 

__Model__
represents the state of the application and any business logic or operations

__View__
are responsible for presenting content through the user interface. 

__Controllers__
 are the components that handle user interaction, work with the model, and select a view to render.

## Env. dependencies to run project:

* openJDK jdk8u275-b01 (JDK+JRE.zip for x64):

https://adoptopenjdk.net/releases.html?variant=openjdk8&jvmVariant=hotspot

* tomcat apache 9 (x64)

https://tomcat.apache.org/download-90.cgi

following env. variables must be set properly:

JAVA_HOME
CATALINA_HOME
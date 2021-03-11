threejs facade
==============

This is a ScalaJS facade of threejs javascript 3D library ( http://threejs.org/ ). 
All the code is inside facade folder (threejs subproject). 
It also contains some extra classes for easier scene creation and css3d rendering.

### Developer notes

Download _three.js_ from [three.js build](https://github.com/mrdoob/three.js/tree/dev/build) into `facade/project/resources`
- https://raw.githubusercontent.com/mrdoob/three.js/dev/build/three.js
- https://raw.githubusercontent.com/mrdoob/three.js/dev/build/three.min.js


### How to use

```
resolvers in ThisBuild += Resolver.githubPackages("OpenGrabeso", "_")

libraryDependencies += "com.github.opengrabeso" %%% "threejs-facade" % xxxx

```

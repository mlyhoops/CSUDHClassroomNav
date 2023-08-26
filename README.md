# CSUDHClassroomNav
This is an Android app developed on Android Studio that provides indoor navigation for Cal State University Dominguez Hills.

The purpose of this app was to create a waypoint application for the school to find your classroom even when you are inside. Normally you can use GPS in apps such as Google Maps, but the issue with Google Maps is that it only relies on GPS (which relies on satellites to work) so if you are inside a building or not under clear skies, the GPS location will not work as well.
This app uses a third party API Indoor Atlas (https://www.indooratlas.com/platform/) which also uses your wifi connection, accelerometer, compass, and gyroscope to give better location accuracy. 

Go to this link to watch a video demo. https://www.youtube.com/watch?v=eSMuyyN10nw

Reference for the video: 
- This is a demo where I opened up the app and navigated to the NSM (Natural Sciences and Mathematics) building. 
- The blue circle indicates my location and I clicked on the classroom I wanted to go to.
- I start walking the path that the app gives me and I end up at the class.
- The app uses Djikstras aglorithm to find the shortest path to the class and has all the points mapped out where you are able to walk.

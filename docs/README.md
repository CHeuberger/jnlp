# jnlp

JNLP test and framework

A project to test JNLP and build a framework for future reference.

* [Page](https://CHeuberger.github.io/jnlp/)
* [Repository](https://github.com/CHeuberger/jnlp)

## How To

1. Create and export certificate
   ```
   keytool -keystore keystore -genkeypair -alias cfh -keyalg RSA -dname="CN=Carlos F. Heuberger" -validity 371
   keytool -keystore keystore -exportcert -alias cfh -rfc > cfh.cer
   ```
1. Import certificate as trusted CA
   1. Java console > Security > Certificates (import as trusted); **or**
   1. to Windows/Browser: double-click `cfh.cer` (certmgr.msc)
1. Manifest
   ```
   Main-Class: cfh.pack.Main
   Application-Name: The Name
   Permissions: all-permissions
   Codebase: https://cheuberger.github.io
   ```
1. Sign JAR
   ```
   jarsigner -keystore keystore  -tsa http://timestamp.digicert.com the.jar cfh
   ```
1. JNLP file
   ```
   <security>
     <all-permissions>
   </security>
   ```

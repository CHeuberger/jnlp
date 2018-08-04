Welcome to the jnlp wiki!

# jnlp

JNLP tests and framework.

Testing Java Web Start, JNLP and correlated deployment methods.
Eventually building a framework for future projects.

## Manifest for JAR File
```
Manifest-Version: 1.0
Permissions: sandbox
Main-Class: cfh.test.jnlp.Main
```

## JNLP File

```
<?xml version="1.0" encoding="utf-8"?>
<jnlp spec="1.0" href="jnlp.jnlp">
  <information>
    <title>JNLP Test Title</title>
    <vendor>C F Heuberger</vendor>
    <homepage href="https://cheuberger.github.io/jnlp/" />
    <description>JNLP Test Framework</description>
    <offline-allowed />
  </information>
  <resources>
    <jar href="jnlp.jar" />
  </resources>
  <application-desc main-class="cfh.test.jnlp.Main" />
</jnlp>
```

## Create Certificate
* `keytool -keystore path/keystore -genkeypair -alias test -keyalg RSA -dname "CN=Test" -validity 366`
* `keytool -keystore path/keystore -selfcert -alias test -validity 366`

## Sign JAR
* `jarsigner -keystore path/keystore -tsa http://timestamp.digicert.com jnlp.jar test`

## Export, Import and trust Certificate
* `keytool -keystore path/keystore -exportcert -alias test -rfc > test.csr`
* Import the certificate into the User Signer CA store using Java Console
  
* Windows:
  1. double-click `test.cer`
  1. install certificate...

## Links
* [Page](https://CHeuberger.github.io/jnlp/) this project page (just this).
* [Wiki](https://github.com/CHeuberger/jnlp/wiki) for details (soon, WIP).
* [Repository](https://github.com/CHeuberger/jnlp)
* [Deployment Guide](https://docs.oracle.com/javase/10/deploy/getting-started.htm#)

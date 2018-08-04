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

## Links
* [Page](https://CHeuberger.github.io/jnlp/) this project page (just this).
* [Wiki](https://github.com/CHeuberger/jnlp/wiki) for details (soon, WIP).
* [Repository](https://github.com/CHeuberger/jnlp)
* [Deployment Guide](https://docs.oracle.com/javase/10/deploy/getting-started.htm#)

name := "Bro Financier Tool"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")
scalaVersion := "2.11.7"
scalacOptions in Compile += "-feature"

proguardCache in Android ++= Seq("org.scaloid")
proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize", "-keepattributes Signature", "-printseeds target/seeds.txt", "-printusage target/usage.txt"
  , "-dontwarn scala.collection.**" // required from Scala 2.11.4
  , "-dontwarn org.scaloid.**" // this can be omitted if current Android Build target is android-16
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.5" % "test" withSources() withJavadoc()
  ,"org.scaloid" %% "scaloid" % "4.0" withSources() withJavadoc()
  ,"net.sf.proguard" % "proguard-base" % "5.1"
)

run <<= run in Android
install <<= install in Android

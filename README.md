# WxTestUtil_sizeof
print size in Byte of various var types (c/c++, m/mm, java)


<h2>History</h2>

Over the years one of the, well, challenging areas in software development on different hardware platforms is the use of the right variable, when there are different types.

With 8 and 16 bit machines, an int or integer had two byte (whereas, when Intel defined it, it could be at first just one byte, with a second one added when necessary).  Starting from zero (0), positive values increased the binary value to a certain maximum, negative values were subtracted; so a "+1" would be a x0001 and a "–1" a xffff, and so on.

The variable with type byte is always one byte = 8 bit.

So far so good.

But then things became a bit fuzzy with introduction of 32 bit and later the 64 bit machines.

Depending on the compiler and the operating system's architecture (16 bit vs 32 bit for a 32 bit hardware architecture) int or integer types could be two or four byte long.  So there was need to somewhat control the variable size; and short and long were introduced.

The variable type short is two byte = 16 bit.

While int can vary in size two or four byte, long is four byte = 32 bit.

Until 64 bit machines became popular.  Here, depending on the compiler and the operating system's architecture (32 bit vs 64 bit for a 64 bit hardware architecture) int or integer were now always four byte long, but now long could be either four or eight byte.  To regain control, the type long long gwas introduced.

To summarize, long can be either four or eight byte, long long is eight byte = 64 bit.

<h2>Problem and Solution</h2>
  
As it is often unknown on what platform the developped application will run (64 bit vs 32 bit vs 16 bit) it is essential that a chosen variable type is of the planned or designed size!

With c/c++ the function sizeof() is avaliable and returns that data in byte.

Java, unfortunately, does not provide such tool.  And a (blind) trust that the size of a given variable is as specified can be fatal when the development suite may have a different understanding, and applications then end up causing unpredictable results or faults.

I have, therefore, written a few methods in Java to return the size of given variable types.  After all, the compiler should know; and not having a Java type sizeof() only means, well, write your own!  ;-) 

You are welcome to browse my code snippets for c/c++ and iOS and Android.

Particular when calling the c/c++ snippet in iOS and (through some wrapper) in Android you can compare the size of variable types when run on different devices.  E.g., long in c/c++ is four byte on iOS <= 9 (= 32 bit environment) and eight byte on iOS >= 10 (= 64 bit environment).  Likewise for Android — once I figure out, how to get the JNI / NDK to compile my c/c++ methods to 64 bit.  (No thanks to Android Studio with gradle and NDK changing syntax and features with quite some disregard to existing projects, scripts, and applications...)


Enjoy,<br>
&nbsp; &nbsp; <i>jm</i>.
    
San José, California    
16-April-2019
    
<br>    
<b>Computers (should) help you solve problems you would not have without them!</b>


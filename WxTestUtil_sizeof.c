//
//   driver.c
//                2012-2014    interface Wavvox Decoder Engine
//                2014-2019
//                                  Android: wavvoxNativeApp.c and WavvoxEngine.java
//                                  iOS:   WavvoxControllerEngine.mm, WavvoxEngine.m
//
//   (c) Wavvox Technology.
//    All Rights Reserved.
//


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <stdarg.h>

//#include "transform.h"
//#include "transformEmbed.h"
//#include "preamble.h"

//static decode_data_t state;      // = {0}
//static decode_t dp = &state;
//static wxdata_t wxData;          // = {0}

char someString [255];

//////
// SDK 3.0+


// print sizes in Byte for various var types in c
char * cVarTypeSizes ()
{
    //char sText [90];   // gets freed at return in XCode 9.2
    char * sTextP =  someString;
    sprintf (sTextP, "c/c++ var type size:  "
    				 "(char):%d  (short):%d  (int):%d  (long):%d  (long long):%d  "
                     "(float):%d  (double):%d"
                   , (int)sizeof(char), (int)sizeof(short), (int)sizeof(int), (int)sizeof(long), (int)sizeof(long long)
                   , (int)sizeof(float), (int)sizeof(double) );
    return sTextP;
}

///////



////////


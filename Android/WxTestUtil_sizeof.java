//
//  WxTestUtil.java
//  VoxDigits12_SDK
//
//  Created by jurgen menge on 03+08.Aug.2018.
//  Updated ..                 06.Jan.2019
//
//  Copyright (c) 2019 Wavvox Technology. All rights reserved.
//
package net.wavvox.wavvoxjar.testutilMethods;

import android.os.Build;
import android.util.Log;

//import net.wavvox.wavvoxjar.WavvoxEngine;
//import net.wavvox.wavvoxplayer.WavvoxPlayer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

//import android.os.Bundle;
//import android.os.Handler;


/**
 *  various test util functions calling Wavvox methods
 *  Android and iOS, used in some, say, test printouts
 *
 * ***
 *
 *      WxTestUtil.java
 *      WxTestUtil.m
 *
 *
 * ***
 *
 *
 */

public class WxTestUtil
{

    static int  numberInstances  = 0;
    int  currentID;


    public WxTestUtil ()
    // initialize class
    {
        //
        //
        //
        currentID = ++numberInstances;
    }


    // https://www.javaworld.com/article/2077408/core-java/sizeof-for-java.html
    // java.lang.Object shell size in bytes:

    static final int OBJECT_SHELL_SIZE   = 8;
    static final int OBJREF_SIZE         = 4;
    static final int LONG_FIELD_SIZE     = 8;
    static final int INT_FIELD_SIZE      = 4;
    static final int SHORT_FIELD_SIZE    = 2;
    static final int CHAR_FIELD_SIZE     = 2;
    static final int BYTE_FIELD_SIZE     = 1;
    static final int BOOLEAN_FIELD_SIZE  = 1;
    static final int DOUBLE_FIELD_SIZE   = 8;
    static final int FLOAT_FIELD_SIZE    = 4;

    private static final String NEW_LINE = "\n";


    /**
     *
     * @param v1   determine the length in Byte for the variable
     * @return     calculated length from %x (as possible)
     */
    int sizeof (boolean v1) {
        v1 = true;
        //  String s1 = String.format("%x", v1);
        return BOOLEAN_FIELD_SIZE;   // s1.length()/2 //
    }
    int sizeof (char v1) {
        v1 = ' ';
        //  String s1 = String.format("%x", v1);
        return CHAR_FIELD_SIZE;   // s1.length()/2 //
    }
    int sizeof (byte v1) {
        v1 = -1; // ff (2)
        String s1 = String.format("%x", v1);
        return s1.length()/2;
    }
    int sizeof (short v1) {
        v1 = -1; // ffff (4)
        String s1 = String.format("%x", v1);
        return s1.length()/2;
    }
    int sizeof (int v1) {
        v1 = -1; // ffffffff (8)
        String s1 = String.format("%x",v1);
        return s1.length()/2;
    }
    int sizeof (long v1) {
        v1 = -1; // ffffffffffffffff (16)
        String s1 = String.format("%x",v1);
        return s1.length()/2;
    }
    int sizeof (float v1) {
        v1 = -1.1f;
        String s1 = Float.toHexString(v1);
                    // -0x1.19999ap0 (13)
        return FLOAT_FIELD_SIZE;   // s1.length()/2 //
    }
    int sizeof (double v1) {
        v1 = -1.1;
        String s1 = Double.toHexString(v1);
                    // -0x1.19999999999ap0 (19)
        return DOUBLE_FIELD_SIZE;   // s1.length()/2 //
    }


    /**
     *
     *
     */
    public String javaVarTypeSizes ()
    {
		String sText;

        sText = "Java var type size:"
                + "  (char):"      + CHAR_FIELD_SIZE        + "  (short):"     + sizeof((short)1)
                + "  (int):"       + sizeof((int)1)         + "  (byte):"      + sizeof((byte)1)
                + "  (long):"      + sizeof((long)1)     // + "  (long long):" + LONGLONG_FIELD_SIZE
                + "  (float):"     + FLOAT_FIELD_SIZE       + "  (double):"    + DOUBLE_FIELD_SIZE
                + "  (boolean):"   + BOOLEAN_FIELD_SIZE     ;

        Log.i ("WxTestUtil". sText);
        return sText;
    }


//  /////////////////////////////////////////////////////////////////////////////////////


}

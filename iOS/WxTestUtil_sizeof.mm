//
//  WxTestUtil.mm
//  VoxDigits12n
//
//  Created by jurgen menge on 03,06,07.Aug.2018.
//  Updated                    06.Jan.2019.
//
//  Copyright (c) 2019 Wavvox Technology. All rights reserved.
//

/**
 *  various test util functions calling Wavvox methods
 *  (Android and iOS and embedded systems)
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
 *
 *
 *
 */

//#import "WavvoxConstants.h"
#import "WxTestUtil.h"


static int  numberInstances = 0;

@interface WxTestUtil ()
{
    int  currentID;

}


@end


@implementation WxTestUtil

#pragma mark Singleton Initialization

- (id) init
    // initialize class
    {
        self = [super init];

        //
        //
        //
        currentID = ++numberInstances;

        return self;
    }


/*
    // https://www.javaworld.com/article/2077408/core-java/sizeof-for-java.html
    // java.lang.Object shell size in bytes:
    static int OBJECT_SHELL_SIZE   = 8;
    static int OBJREF_SIZE         = 4;
    static int LONG_FIELD_SIZE     = sizeof(long);
    static int INT_FIELD_SIZE      = sizeof(int);
    static int SHORT_FIELD_SIZE    = sizeof(short);
    static int CHAR_FIELD_SIZE     = sizeof(char);
    static int BYTE_FIELD_SIZE     = sizeof(Byte);
    static int BOOL_FIELD_SIZE     = sizeof(bool);
    static int DOUBLE_FIELD_SIZE   = sizeof(double);
    static int FLOAT_FIELD_SIZE    = sizeof(float);
*/
    static NSString* const NEW_LINE = @ "\n";

    /**
     * printout size of various var type
     *
     */
    -(NSString *) objcVarTypeSizes
    {
        NSString * sText;

        sText = [NSString stringWithFormat:@
        		 "(char):%lu  (short):%lu  (int):%lu  (long):%lu  (long long):%lu  "
                 "(float):%lu  (double):%lu  (bool):%lu  (NSInteger):%lu"
                 , sizeof(char), sizeof(short), sizeof(int), sizeof(long), sizeof(long long)
                 , sizeof(float), sizeof(double), sizeof(bool), sizeof(NSInteger) ];

        sText = [@"objective-C var type size:  " stringByAppendingString: sText];

        NSLog(TESTUTIL " %@",sText);
        return sText;
    }


//  /////////////////////////////////////////////////////////////////////////////////////

@end

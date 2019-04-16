//
//  WxTestUtil.h
//  VoxDigits12n
//
//  Created by jurgen menge on 03+08.Aug.2018.
//  Updated ..                 06.Jan.2019
//
//  Copyright (c) 2019 Wavvox Technology. All rights reserved.
//

#ifndef WxTestUtil_h
#define WxTestUtil_h

//#import "WavvoxConstants.h"
//#import "WavvoxEngine.h"
//#import "WavvoxPlayer.h"
//#include "preamble.h"

#import <sys/utsname.h>

#define WXTESTUTIL  @"Wavvox TestUtil"

@interface WxTestUtil : NSObject

-(NSString *) objcVarTypeSizes;
-(NSString *) cVarTypeSizes;


@end

#endif /* WxTestUtil_h */

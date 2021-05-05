#ifdef __OBJC__

#import <Foundation/Foundation.h>

@protocol TypeProtocol1
@end

@protocol Protocol1

@property (nonatomic, strong) id <TypeProtocol1> _Nullable prop_1;

@end

#endif /* __OBJC__ */

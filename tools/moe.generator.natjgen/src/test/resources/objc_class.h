@protocol TestProtocol
@end

@interface TestClass
- (void)canLoadObjectOfClass:(Class<TestProtocol>)aClass;
@end

typedef struct {
  int kind;
} TestStruct;

typedef void (*Callback)(TestStruct testStruct);

void initiateCallback(TestStruct testStruct, Callback callback) {
    callback(testStruct);
}
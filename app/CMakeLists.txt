#版本
cmake_minimum_required(VERSION 3.4.1)

#添加一个库 hello最终会生成一个hello.so文件
#SHARED 表示动态库
#src/main/jni/NDKHello.cpp c++源文件
#以上表述的意思就是我们以c++源文件的形式添加了一个hello动态库
add_library(
             hello-lib
             SHARED
             src/main/jni/NDKHello.cpp)

# 找到预编译库 log_lib 并link到我们的动态库 hello-lib中
find_library(
              log-lib
              log )

# 制定目标库.
target_link_libraries(
                       hello-lib
                       ${log-lib} )
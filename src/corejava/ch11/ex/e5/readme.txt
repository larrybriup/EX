帮同学们复习一下线程

要求：
1. 类MyStack：实现堆栈功能
2. 类Producer extends Thread，要求如下：
    做20次producer的操作，每次操作随机产生一个'a'~'z'的char类型数据放入MyStack中
    放入完成后，输出放入的数据，然后sleep(300)
3. 类Consumer extends Thread，要求如下：
    做20次consumer的操作，每次从MyStack中取出一个数据
    取出后，输出取出的数据，然后sleep(300)
4. 使用TestThread进行测试

char value = (char)('a'+Math.random()*26)
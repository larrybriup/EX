��ͬѧ�Ǹ�ϰһ���߳�

Ҫ��
1. ��MyStack��ʵ�ֶ�ջ����
2. ��Producer extends Thread��Ҫ�����£�
    ��20��producer�Ĳ�����ÿ�β����������һ��'a'~'z'��char�������ݷ���MyStack��
    ������ɺ������������ݣ�Ȼ��sleep(300)
3. ��Consumer extends Thread��Ҫ�����£�
    ��20��consumer�Ĳ�����ÿ�δ�MyStack��ȡ��һ������
    ȡ�������ȡ�������ݣ�Ȼ��sleep(300)
4. ʹ��TestThread���в���

char value = (char)('a'+Math.random()*26)
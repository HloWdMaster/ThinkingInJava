package typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

class DynamicProxyHandler implements InvocationHandler {
    private Map map = new HashMap<String, Integer>();
    private Object proxied;
    private int[] arrs = new int[7];
    int i = 0;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mStr;
        if (args == null) {
            mStr = method.getName();
        } else {
            mStr = (method.getName() + args.getClass().getSimpleName().toString()).replaceAll("\\w+\\.", "");
        }
        if (map.get((mStr)) == null) {
            map.put(mStr, 1);
            System.out.println(mStr + "调用了:" + 1 + "次");
        } else {
            Integer count = (Integer) map.get(mStr);
            map.put(mStr, ++count);
            System.out.println(mStr + "调用了:" + map.get(mStr) + "次");
        }
        System.out.println("****proxy: " + proxy.getClass() + ",method: " + method + ",args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.print(arg + " ");
            }
        }
        return method.invoke(proxied, args);
    }
}


public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
        consumer(proxy);
        consumer(proxy);
    }
}

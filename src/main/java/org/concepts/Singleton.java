package org.concepts;

public class Singleton {
    public static void main(String[] args) {
        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager.toString());
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager2.toString());

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy.toString());
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy2.toString());

        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe.toString());
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe2.toString());




    }
}

class SingletonEager{
    private static final SingletonEager instance = new SingletonEager();
    private SingletonEager(){}
    public static SingletonEager getInstance(){
        return instance;
    }
}

class SingletonLazy{
    private static SingletonLazy instance;
    private SingletonLazy(){}
    public static SingletonLazy getInstance(){
        if(instance == null)
            instance = new SingletonLazy();
        return instance;
    }
}

class SingletonThreadSafe{
    private static SingletonThreadSafe instance;
    private SingletonThreadSafe(){};
    public static synchronized SingletonThreadSafe getInstance(){
        if(instance == null)
            instance = new SingletonThreadSafe();
        return instance;
    }
}


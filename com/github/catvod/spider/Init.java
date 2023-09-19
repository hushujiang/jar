package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p046l.RunnableC0610b;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class Init {

    /* renamed from: c */
    private Application f20c;

    /* renamed from: b */
    private final Handler f19b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    private final ExecutorService f18a = Executors.newFixedThreadPool(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class Loader {

        /* renamed from: a */
        static volatile Init f21a = new Init();

        private Loader() {
        }
    }

    public static Application context() {
        return get().f20c;
    }

    public static void execute(Runnable runnable) {
        get().f18a.execute(runnable);
    }

    public static Init get() {
        return Loader.f21a;
    }

    public static Activity getActivity() {
        Class<?> cls = Class.forName(atm.m897d("0B141E0723310E541B053C762B190E1C3A311E032E1D3E3D0B1E"));
        Object invoke = cls.getMethod(atm.m897d("090F080729361E3B1901252E030E0321242A0F1B1E"), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(atm.m897d("073B1901252E030E13103F"));
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(invoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(atm.m897d("1A1B0F06293C"));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField(atm.m897d("0B190E1C3A311E03"));
                declaredField3.setAccessible(true);
                Activity activity = (Activity) declaredField3.get(obj);
                SpiderDebug.log(activity.getComponentName().getClassName());
                return activity;
            }
        }
        return null;
    }

    public static void init(Context context) {
        SpiderDebug.log(atm.m897d("82FDD090E2C28DC4D392C4F482E5C891F7FB8DD8C69DF0D18FFFDF93C4C88FF0E59AF0D9"));
        get().f20c = (Application) context;
    }

    public static void run(Runnable runnable) {
        get().f19b.post(runnable);
    }

    public static void run(Runnable runnable, int i) {
        get().f19b.postDelayed(runnable, i);
    }

    public static void show(String str) {
        get().f19b.post(new RunnableC0610b(str, 1));
    }
}

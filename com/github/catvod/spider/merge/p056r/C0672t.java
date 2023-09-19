package com.github.catvod.spider.merge.p056r;

import com.github.catvod.spider.merge.atm;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.github.catvod.spider.merge.r.t */
/* loaded from: classes.dex */
public final class C0672t {

    /* renamed from: a */
    private static final Object f1275a;

    /* renamed from: b */
    public static final /* synthetic */ int f1276b = 0;

    static {
        Object obj;
        String m897d = atm.m897d("190F145B21311919543F2D2E0B361B1B2B1909191F063F");
        Method method = null;
        try {
            obj = Class.forName(atm.m897d("190F145B2131191954262439181F1E26293B181F0E06"), false, null).getMethod(atm.m897d("0D1F0E3F2D2E0B361B1B2B1909191F063F"), new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            obj = null;
        }
        f1275a = obj;
        if (obj != null) {
            try {
                Class.forName(m897d, false, null).getMethod(atm.m897d("0D1F0E26383909112E072D3B0F3F1610213D040E"), Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (Throwable unused2) {
            }
        }
        Object obj2 = f1275a;
        if (obj2 != null) {
            try {
                try {
                    method = Class.forName(m897d, false, null).getMethod(atm.m897d("0D1F0E26383909112E072D3B0F3E1F053830"), Throwable.class);
                } catch (ThreadDeath e3) {
                    throw e3;
                } catch (Throwable unused3) {
                }
                if (method == null) {
                    return;
                }
                method.invoke(obj2, new Throwable());
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
            }
        }
    }
}

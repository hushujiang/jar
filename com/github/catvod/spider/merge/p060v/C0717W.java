package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.Future;

/* renamed from: com.github.catvod.spider.merge.v.W */
/* loaded from: classes.dex */
public final class C0717W {
    /* renamed from: a */
    public static Object m72a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}

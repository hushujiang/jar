package com.github.catvod.spider.merge.p060v;

import sun.misc.Unsafe;

/* renamed from: com.github.catvod.spider.merge.v.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0728k {
    /* renamed from: a */
    public static /* synthetic */ boolean m71a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}

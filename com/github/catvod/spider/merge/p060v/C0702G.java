package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.p057s.AbstractC0679f;
import java.util.concurrent.Callable;

/* renamed from: com.github.catvod.spider.merge.v.G */
/* loaded from: classes.dex */
public final class C0702G<V> {

    /* renamed from: a */
    private final AbstractC0679f<InterfaceFutureC0708M<? extends V>> f1317a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0702G(AbstractC0679f abstractC0679f) {
        this.f1317a = abstractC0679f;
    }

    /* renamed from: a */
    public final InterfaceFutureC0708M m83a(Callable callable) {
        return new C0743z(this.f1317a, callable);
    }
}

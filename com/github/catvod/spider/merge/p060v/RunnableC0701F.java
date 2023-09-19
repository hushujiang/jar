package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.p056r.C0662j;
import com.github.catvod.spider.merge.p056r.C0663k;
import com.github.catvod.spider.merge.p061w.AbstractC0744a;
import com.github.catvod.spider.merge.p061w.C0745b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.github.catvod.spider.merge.v.F */
/* loaded from: classes.dex */
final class RunnableC0701F<V> implements Runnable {

    /* renamed from: a */
    final Future<V> f1315a;

    /* renamed from: b */
    final InterfaceC0700E<? super V> f1316b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0701F(Future<V> future, InterfaceC0700E<? super V> interfaceC0700E) {
        this.f1315a = future;
        this.f1316b = interfaceC0700E;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable m16a;
        Future<V> future = this.f1315a;
        if ((future instanceof AbstractC0744a) && (m16a = C0745b.m16a((AbstractC0744a) future)) != null) {
            this.f1316b.onFailure(m16a);
            return;
        }
        try {
            this.f1316b.onSuccess(C0703H.m80c(this.f1315a));
        } catch (Error e) {
            e = e;
            this.f1316b.onFailure(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.f1316b.onFailure(e);
        } catch (ExecutionException e3) {
            this.f1316b.onFailure(e3.getCause());
        }
    }

    public final String toString() {
        C0662j m132a = C0663k.m132a(this);
        m132a.m133a(this.f1316b);
        return m132a.toString();
    }
}

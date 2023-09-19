package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.p057s.AbstractC0674a;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.github.catvod.spider.merge.v.D */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0699D<V> extends AbstractC0674a implements InterfaceFutureC0708M<V>, Future<Object> {
    @Override // com.github.catvod.spider.merge.p060v.InterfaceFutureC0708M
    /* renamed from: a */
    public final void mo62a(Runnable runnable, Executor executor) {
        mo85c().mo62a(runnable, executor);
    }

    /* renamed from: c */
    protected abstract InterfaceFutureC0708M<? extends V> mo85c();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return mo84d().cancel(z);
    }

    /* renamed from: d */
    protected abstract Future<Object> mo84d();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return mo84d().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo84d().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo84d().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return mo84d().get(j, timeUnit);
    }
}

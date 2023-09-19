package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.github.catvod.spider.merge.v.V */
/* loaded from: classes.dex */
final class RunnableFutureC0716V<V> extends AbstractC0697B<Object> implements RunnableFuture<V>, InterfaceC0726i<Object> {

    /* renamed from: h */
    private volatile AbstractRunnableC0707L<?> f1327h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableFutureC0716V(Callable<V> callable) {
        this.f1327h = new C0715U(this, callable);
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, com.github.catvod.spider.merge.p060v.InterfaceFutureC0708M
    /* renamed from: a */
    public final void mo62a(Runnable runnable, Executor executor) {
        super.mo62a(runnable, executor);
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, java.util.concurrent.Future
    public final Object get() {
        return super.get();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o
    /* renamed from: k */
    protected final void mo39k() {
        AbstractRunnableC0707L<?> abstractRunnableC0707L;
        if (m45v() && (abstractRunnableC0707L = this.f1327h) != null) {
            abstractRunnableC0707L.m75c();
        }
        this.f1327h = null;
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o
    /* renamed from: r */
    protected final String mo38r() {
        AbstractRunnableC0707L<?> abstractRunnableC0707L = this.f1327h;
        if (abstractRunnableC0707L != null) {
            String valueOf = String.valueOf(abstractRunnableC0707L);
            StringBuilder sb = new StringBuilder(valueOf.length() + 7);
            sb.append(atm.m897d("1E1B091E7103"));
            sb.append(valueOf);
            sb.append(atm.m897d("37"));
            return sb.toString();
        }
        return super.mo38r();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC0707L<?> abstractRunnableC0707L = this.f1327h;
        if (abstractRunnableC0707L != null) {
            abstractRunnableC0707L.run();
        }
        this.f1327h = null;
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return super.get(j, timeUnit);
    }
}

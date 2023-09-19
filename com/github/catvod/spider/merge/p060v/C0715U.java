package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.v.U */
/* loaded from: classes.dex */
public final class C0715U extends AbstractRunnableC0707L<Object> {

    /* renamed from: c */
    private final Callable<Object> f1325c;

    /* renamed from: d */
    final /* synthetic */ RunnableFutureC0716V f1326d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0715U(RunnableFutureC0716V runnableFutureC0716V, Callable<Object> callable) {
        this.f1326d = runnableFutureC0716V;
        callable.getClass();
        this.f1325c = callable;
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: a */
    final void mo28a(Throwable th) {
        this.f1326d.mo46u(th);
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: b */
    final void mo27b(Object obj) {
        this.f1326d.mo47t(obj);
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: d */
    final boolean mo26d() {
        return this.f1326d.isDone();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: e */
    final Object mo25e() {
        return this.f1325c.call();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: f */
    final String mo24f() {
        return this.f1325c.toString();
    }
}

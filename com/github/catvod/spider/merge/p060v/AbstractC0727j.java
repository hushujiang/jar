package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.github.catvod.spider.merge.v.j */
/* loaded from: classes.dex */
abstract class AbstractC0727j<V> extends AbstractC0732o<V> implements InterfaceC0726i<V> {
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
    public final V get() {
        return (V) super.get();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return (V) super.get(j, timeUnit);
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }
}

package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.github.catvod.spider.merge.v.O */
/* loaded from: classes.dex */
class C0710O extends AbstractC0733p {

    /* renamed from: a */
    private final ExecutorService f1321a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0710O(ExecutorService executorService) {
        executorService.getClass();
        this.f1321a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f1321a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1321a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f1321a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f1321a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f1321a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f1321a.shutdownNow();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f1321a);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(obj).length() + 2);
        sb.append(obj);
        sb.append(atm.m897d("31"));
        sb.append(valueOf);
        sb.append(atm.m897d("37"));
        return sb.toString();
    }
}

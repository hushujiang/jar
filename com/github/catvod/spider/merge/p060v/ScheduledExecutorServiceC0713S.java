package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.github.catvod.spider.merge.v.S */
/* loaded from: classes.dex */
final class ScheduledExecutorServiceC0713S extends C0710O implements ScheduledExecutorService {

    /* renamed from: b */
    final ScheduledExecutorService f1324b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledExecutorServiceC0713S(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f1324b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC0716V runnableFutureC0716V = new RunnableFutureC0716V(Executors.callable(runnable, null));
        return new ScheduledFutureC0711P(runnableFutureC0716V, this.f1324b.schedule(runnableFutureC0716V, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC0712Q runnableC0712Q = new RunnableC0712Q(runnable);
        return new ScheduledFutureC0711P(runnableC0712Q, this.f1324b.scheduleAtFixedRate(runnableC0712Q, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC0712Q runnableC0712Q = new RunnableC0712Q(runnable);
        return new ScheduledFutureC0711P(runnableC0712Q, this.f1324b.scheduleWithFixedDelay(runnableC0712Q, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC0716V runnableFutureC0716V = new RunnableFutureC0716V(callable);
        return new ScheduledFutureC0711P(runnableFutureC0716V, this.f1324b.schedule(runnableFutureC0716V, j, timeUnit));
    }
}

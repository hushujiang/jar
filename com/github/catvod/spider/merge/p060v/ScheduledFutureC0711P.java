package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.github.catvod.spider.merge.v.P */
/* loaded from: classes.dex */
final class ScheduledFutureC0711P<V> extends AbstractC0698C<V> implements ScheduledFuture {

    /* renamed from: b */
    private final ScheduledFuture<?> f1322b;

    public ScheduledFutureC0711P(InterfaceFutureC0708M<V> interfaceFutureC0708M, ScheduledFuture<?> scheduledFuture) {
        super(interfaceFutureC0708M);
        this.f1322b = scheduledFuture;
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractFutureC0699D, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f1322b.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f1322b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f1322b.getDelay(timeUnit);
    }
}

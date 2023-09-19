package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.v.J */
/* loaded from: classes.dex */
public final class RunnableC0705J extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: a */
    private final AbstractRunnableC0707L<?> f1318a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0705J(AbstractRunnableC0707L abstractRunnableC0707L, C0717W c0717w) {
        this.f1318a = abstractRunnableC0707L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m76a(RunnableC0705J runnableC0705J, Thread thread) {
        runnableC0705J.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f1318a.toString();
    }
}
